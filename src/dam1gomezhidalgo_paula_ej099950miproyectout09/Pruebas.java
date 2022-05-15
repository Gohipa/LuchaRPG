/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dam1gomezhidalgo_paula_ej099950miproyectout09;

import java.util.ArrayList;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partida p = new Partida();
        Personaje player = new Personaje();
        player.setClase("Mago");
        player.setNombre("Magie_2374_ABC");

        // <editor-fold desc="PRUEBAS DE PERSONAJE">
//        System.out.println(player.Mostrar());
//
//        System.out.println("PRUEBAS PROBABILIDAD");
//        System.out.println(player.generarProbabilidad(0.8));
//        System.out.println(player.generarProbabilidad(0.8));
//        System.out.println(player.generarProbabilidad(0.8));
//
//        //CAMBIAMOS A ARQUERO PARA PROBAR LOS MOV DE LUCHA
//        player = new Arquero();
//
//        //ATACAR()
//        int atqArquero = player.Atacar();
//        System.out.println(player.Mostrar());
//        if (atqArquero >= player.getAtq()) {
//            System.out.println("¡Increible! Has conseguido un crítico: " + atqArquero);
//        } else {
//            System.out.println("Has infligido " + atqArquero + " de daño");
//        }
//
//        //DEFENSA()
//        System.out.println("Defensa: " + player.getDef() + ", Subida de defensa: " + player.defensa());
//
//        //HUIR ()
//        if (player.Huir() == true) {
//            System.out.println("¡Has huido con éxito!");
//        } else {
//            System.out.println("¡No puedes escapar!");
//        }
//
//        //CAMBIAMOS A GUERRERO PARA PROBAR LOS MOV DE LUCHA
//        player = new Guerrero();
//
//        //ATACAR()
//        int atqGuerrero = player.Atacar();
//        System.out.println(player.Mostrar());
//        if (atqGuerrero >= player.getAtq()) {
//            System.out.println("¡Increible! Has conseguido un crítico: " + atqGuerrero);
//        } else {
//            System.out.println("Has infligido " + atqGuerrero + " de daño");
//        }
//
//        //DEFENSA()
//        System.out.println("Defensa: " + player.getDef() + ", Subida de defensa: " + player.defensa());
//
//        //HUIR ()
//        if (player.Huir() == true) {
//            System.out.println("¡Has huido con éxito!");
//        } else {
//            System.out.println("¡No puedes escapar!");
//        }
//
//        if (player.getClase() == "mago") {
//            System.out.println("Eres un mago");
//        } else {
//            System.out.println("No eres un mago");
//        }
//
//        /**
//         * PARA LOS MAGOS NO SE PUEDE USAR EL POLIFORMISMO YA QUE TIENEN
//         * HECHIZOS EN COMPOSICION
//         */
//        Mago mago = new Mago();
//
//        System.out.println(mago.Mostrar());
//
//        System.out.println("Ataque: " + mago.Atacar());
//
//        //DEFENSA()
//        System.out.println("Defensa: " + player.getDef() + ", Subida de defensa: " + player.defensa());
//
//        //HUIR ()
//        if (player.Huir() == true) {
//            System.out.println("¡Has huido con éxito!");
//        } else {
//            System.out.println("¡No puedes escapar!");
//        }
//
//        if (player.getClase() == "mago") {
//            System.out.println("Eres un mago");
//        } else {
//            System.out.println("No eres un mago");
//        }
//
//        //HECHIZOS
//        if (mago.getClase().equalsIgnoreCase("mago")) {
//            System.out.println("Eres un mago!");
//        }
//        System.out.println("""
//                           1- Aturdir al enemigo (Reduce la defensa del enemigo)
//                           2- Ciega al enemigo (Baja su ataque)
//                           3- Cura un 20% de tu vida
//                           """);
//
//        System.out.println("El enemigo está aturdido! Su defensa ha bajado " + mago.Hechizo(1, mago, player) + " puntos");
//        System.out.println("El enemigo está cegao! Su ataque ha bajado " + mago.Hechizo(2, mago, player) + " puntos");
//        System.out.println("Te has curado " + mago.Hechizo(3, mago, player) + " puntos!");
        // </editor-fold>
        
        ArrayList<Personaje> aux = new ArrayList<>();
        p.generarEnemigos();
        aux = p.mostrarEnemigos();
        for (Personaje a : aux) {
           //System.out.println(a.Mostrar());
        }
        
        p.enemigosLucha(2);
        
        
    }

}
