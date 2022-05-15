/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dam1gomezhidalgo_paula_ej099950miproyectout09;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gohip
 */
public class DAM1GomezHidalgo_Paula_Ej099950MiProyectoUT09 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Partida p = new Partida();
        boolean personajeCreado = false;
        int opt = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("  _  ___  ___  ___  _  _ __   __ ___  _  _  ___  ___    ___   _ ");
        System.out.println(" (_)| _ )|_ _|| __|| \\| |\\ \\ / /| __|| \\| ||_ _||   \\  / _ \\ | |");
        System.out.println(" | || _ \\ | | | _| | .` | \\ V / | _| | .` | | | | |) || (_) ||_|");
        System.out.println(" |_||___/|___||___||_|\\_|  \\_/  |___||_|\\_||___||___/  \\___/ (_)");
        System.out.println("                                                                ");

        System.out.println("Un mundo de aventuras te espera, vamos a prepararnos!");
        //Usamos el thread.sleep para darle delay a los mensajes y se pueda seguir mejor el programa
        Thread.sleep(2000);

        do {
            //MENÚ INICIAL
            System.out.println("¿Que quieres hacer?\n\t1- Crear un personaje\n\t2- Cerrar programa");
            System.out.printf("Opción: ");
            opt = Integer.parseInt(scan.nextLine());

            if (opt != 1) {
                //CERRAMOS EL PROGRAMA
                System.out.println("Hasta pronto!");
                Thread.sleep(700);
                System.out.println("Cerrando el programa...");
                Thread.sleep(1000);
            } else {
                /**
                 * GENERAMOS LOS ENEMIGOS AL EMPEZAR LA PARTIDA
                 */
                p.generarEnemigos();
                //DA COMIENZO LA PARTIDA
                //ESTE BOOLEAN COMPRUEBA SI SE HA CREADO UN PERSONAJE O NO

                // <editor-fold desc="CREACION DE PERSONAJE">
                if (personajeCreado == false) {
                    System.out.println("Perfecto! Empecemos por la clase del personaje:");
                    System.out.println("\t1- Mago\n\t2- Guerrero\n\t3- Arquero");
                    Thread.sleep(700);
                    do {
                        //COMPROBACION DE OPCION
                        System.out.printf("Opción: ");
                        opt = Integer.parseInt(scan.nextLine());
                    } while (opt != 1 && opt != 2 && opt != 3);

                    /**
                     * UNA VEZ COMPROBAMOS QUE LA OPCIÓN ES CORRECTA, CREAMOS AL
                     * PERSONAJE A TRAVÉS DEL METODO "INICIAR"
                     */
                    p.Iniciar(opt);
                    //MOSTRAMOS EL PERFIL NUEVO
                    System.out.println(p.player.Mostrar());
                    Thread.sleep(700);
                    System.out.println("Enhorabuena! Ya tienes a tu " + p.player.getClase());
                    Thread.sleep(700);
                    personajeCreado = true;
                } else {
                    System.out.println("Parece que ya tienes un personaje creado!");
                    Thread.sleep(700);
                }
                // </editor-fold>

                /**
                 * UNA VEZ CREADO EL PERSOANJE, MOSTRAMOS EL MENÚ "PRINCIPAL"
                 * CON LAS OPCIONES, SE REPETIRÁ HASTA QUE PULSE 5, Y LE LLEVARÁ
                 */
                do {
                    System.out.println("Ahora que te apetece hacer:"
                            + "\n\t1- Ver perfil"
                            + "\n\t2- Cambiar nombre"
                            + "\n\t3- Vamos a entrenar esas habilidades!"
                            + "\n\t4- Cambiar de clase, se restaurar el perfil base"
                            + "\n\t5- Irnos de aventuras!"
                            + "\n\t6- Mostrar enciclopedia de monstruos"
                            + "\n\t7- Volver a inicio");
                    do {
                        System.out.printf("Opción: ");
                        opt = Integer.parseInt(scan.nextLine());
                    } while (opt != 1 && opt != 2 && opt != 3 && opt != 4 && opt != 5 && opt != 6 && opt != 7);

                    //AHORA GESTIONAMOS LAS OPCIONES
                    switch (opt) {
                        case 1:
                            //System.out.println("[LLAMAR AL METODO \"PERFIL\"]");
                            System.out.println(p.player.Mostrar());
                            Thread.sleep(1000);
                            break;
                        case 2:
                            //System.out.println("[LLAMAR AL METODO \"NOMBRE\"]");
                            System.out.println("Vamos a cambiar tu nombre!");
                            Thread.sleep(700);
                            System.out.println("Cual quieres?");
                            System.out.printf("Nuevo nombre: ");
                            p.CambiarNombre(scan.nextLine());
                            System.out.println("Nombre cambiado con exito!");
                            Thread.sleep(1000);
                            break;
                        case 3:
                            //System.out.println("[LLAMAR AL METODO \"ENTRENAR\"]");
                            p.entrenar();
                            System.out.println("Tus ataques son más rápidos, duras más en batalla!");
                            System.out.println("Tus estadisticas han subido!");
                            Thread.sleep(1000);
                            break;
                        case 4:
                            //System.out.println("[LLAMAR AL METODO \"CAMBIAR_CLASE\"]");
                            System.out.println("CUIDADO! Si cambias de clase tus estadisitcas se perderán");
                            Thread.sleep(700);
                            System.out.println("Quieres seguir?\n\t1- Si\n\t2- No");
                            do {
                                System.out.printf("Opcion:");
                                opt = Integer.parseInt(scan.nextLine());
                            } while (opt != 1 && opt != 2);

                            if (opt == 1) {
                                System.out.println("Perfecto! Indica la clase del personaje:");
                                System.out.println("\t1- Mago\n\t2- Guerrero\n\t3- Arquero");
                                Thread.sleep(700);
                                do {
                                    //COMPROBACION DE OPCION
                                    System.out.printf("Opción: ");
                                    opt = Integer.parseInt(scan.nextLine());
                                } while (opt != 1 && opt != 2 && opt != 3);
                                p.Iniciar(opt);
                                System.out.println("Ahora eres un " + p.player.getClase());
                            }

                            Thread.sleep(1000);
                            break;
                        case 5:
                            //System.out.println("[LLAMAR AL METODO \"AVENTURAS\"]");
                            /**
                             * PRIMERO PREGUNTAMOS EL NIVEL DE DIFICULTAD PARA
                             * SABER CUANTOS ENEMIGOS GENERAR
                             */
                            System.out.println("Elige la difcultad para luchar"
                                    + "\n\t1- Facil, un paseo por las afueras"
                                    + "\n\t2- Normal, un aventurero hecho y derecho");
                            do {
                                //COMPROBACION DE OPCION
                                System.out.printf("Opción: ");
                                opt = Integer.parseInt(scan.nextLine());
                            } while (opt != 1 && opt != 2 && opt != 3);
                            Thread.sleep(1000);

                            break;
                        case 6:
                            //System.out.println("[LLAMAR AL METODO \"MOSTRAR_ENEMIGOS\"]");
                            ArrayList<Personaje> aux = new ArrayList<>();
                            aux = p.mostrarEnemigos();
                            for (Personaje a : aux) {
                                System.out.println(a.Mostrar());
                                Thread.sleep(500);
                            }
                            break;
                        case 7:
                            //System.out.println("[VOLVER A \"INICIO\"]");
                            System.out.println("Volviendo a incio...");
                            Thread.sleep(700);
                            break;
                        default:
                            System.out.println("Cuidado! opcion no valida");
                            break;
                    }

                } while (opt != 7);
            }
        } while (opt != 2);

    }
}

//NumberFormatException:
