/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1gomezhidalgo_paula_ej099950miproyectout09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Partida {

    BufferedReader br;
    Personaje player = new Personaje();
    Personaje enemigo = new Personaje();
    ArrayList<Personaje> ene = new ArrayList<>();
    TreeSet<Personaje> eneLucha = new TreeSet<>();

    public void Iniciar(int opt) {
        if (opt == 1) {
            player = new Mago();
            player.setClase("mago");
        }
        if (opt == 2) {
            player = new Guerrero();
            player.setClase("guerrero");
        }
        if (opt == 3) {
            player = new Arquero();
            player.setClase("arquero");
        }
    }

    public void CambiarNombre(String newNombre) {
        player.setNombre(newNombre);
    }

    public void entrenar() {
        player.setAtq(player.getAtq() + 5);
        player.setVida(player.getVida() + 5);
        player.setDef(player.getDef() + 5);
    }

    public void generarEnemigos() {
        ene = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("enemigos.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                /**
                 * POR CADA LINEA QUE LEA LA DIVIDIRÁ CUANDO ENCUENTRE UN ; Y LO
                 * GUARDARÁ EN EL ARRAY. SE BORRAN LOS VALORES DE LA CADENA
                 * ANTERIOR. PRIMERO VERIFICA SI ES UNA CLASE U OTRA, Y LUEGO SE
                 * USAN LOS SETTERS PARA AÑADIR EL VALOR.
                 */
                String[] valores = line.split(";");
                if (valores[0].equalsIgnoreCase("golem")) {
                    Golem auxG = new Golem();
                    auxG.setNombre(valores[1]);
                    auxG.setVida(Integer.parseInt(valores[2]));
                    auxG.setAtq(Integer.parseInt(valores[3]));
                    auxG.setDef(Integer.parseInt(valores[4]));
                    ene.add(auxG);
                }
                if (valores[0].equalsIgnoreCase("bruja")) {
                    Bruja auxB = new Bruja();
                    auxB.setNombre(valores[1]);
                    auxB.setVida(Integer.parseInt(valores[2]));
                    auxB.setAtq(Integer.parseInt(valores[3]));
                    auxB.setDef(Integer.parseInt(valores[4]));
                    ene.add(auxB);
                }
                if (valores[0].equalsIgnoreCase("dragon")) {
                    Dragon auxD = new Dragon();
                    auxD.setNombre(valores[1]);
                    auxD.setVida(Integer.parseInt(valores[2]));
                    auxD.setAtq(Integer.parseInt(valores[3]));
                    auxD.setDef(Integer.parseInt(valores[4]));
                    ene.add(auxD);
                }
            }

            //PRUEBA: MOSTRAR LOS PERSONAJES
            /*for (Personaje personaje : ene) {
                System.out.println(personaje.Mostrar());
            }*/
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex);
        }
    }

    public ArrayList mostrarEnemigos() {
        return ene;
    }

    /**
     * GUARDA EN UN TREESET LOS ENEMIGOS CONTRA LOS QU SE VAN A LUCHAR
     *
     * @param dif
     */
    public void enemigosLucha(int dif) {
        for (int i = 0; i < (dif + 2); i++) {
            eneLucha.add((Personaje)ene.get(i));
        }
        //System.out.println(eneLucha);
    }
}
