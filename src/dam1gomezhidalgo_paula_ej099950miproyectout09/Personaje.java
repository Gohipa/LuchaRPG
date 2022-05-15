package dam1gomezhidalgo_paula_ej099950miproyectout09;

import java.util.Locale;
import java.util.Objects;

/**
 *
 * @author Paula Gómez Hidalgo
 */
public class Personaje implements Visualizable, MovLucha {

    private String id = "00000-00";
    private String nombre = "Player";
    private String clase = "personaje";
    private int atq = 0;
    private int def = 0;
    private int vida = 0;
    private double crit = 0;

    /**
     * Constructor vacío
     */
    public Personaje() {
        setClase("");
        setNombre("Rilm");
        setVida(450);
        setAtq(100);
        setDef(100);
        setCrit(0);
        setId(generarID());
    }

    /**
     * Construsctor con el nombre y la clase como parametro.Como las demás
 estadísticas tienen un valor por defecto no hace falta pedirlos.
     *
     * @param nombre
     */
    public Personaje(String nombre) {
        setNombre("Dummy");
        setId(generarID());
        setNombre(nombre);
        setClase("");
        setVida(450);
        setAtq(100);
        setDef(100);
        setCrit(0);
    }

    /**
     * Genera un numero aleatorio de 5 cifras, luego se le añaden las dos
     * primeras cifras del metodo Hascode
     *
     * @return random + Hashcode
     */
    private String generarID() {
        int random = (int) Math.ceil(Math.random() * (99999 - 10000) + 10000);
        String plus = String.valueOf(Math.abs(hashCode()));
        return random + "-" + plus.substring(0, 2);
    }

    /**
     * Este metodo da la opción de que el personaje tenga la probabilidad de
     * usar el valor de la defensa o el ataque por completo. Ej: Tener un 80% de
     * probabilidad de hacer un ataque crítico (usar el valor entero del ataque)
     * si sale true significará que sale un crítico, si no, se hará un 80% del
     * ataque.
     *
     * @param porcentaje
     * @return
     */
    public boolean generarProbabilidad(double porcentaje) {
        double prob = Math.random();
        //System.out.println(prob);
        if (prob <= porcentaje) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String Mostrar() {
        return "======= " + getClase().toUpperCase() + " : " + getNombre() + " =======\n"
                + "    ID ............ " + getId() + "     \n"
                + "    Ataque ........ " + getAtq() + "\n"
                + "    Vida .......... " + getVida() + "\n"
                + "    Defensa........ " + getDef() + "\n"
                + "    Critico ....... " + getCrit() + "\n";
    }

    /**
     *
     * @return
     */
    @Override
    public int Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public int defensa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public boolean Huir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.clase);
        hash = 71 * hash + this.atq;
        hash = 71 * hash + this.def;
        hash = 71 * hash + this.vida;
        return hash;
    }

    /**
     * Método equals comparando solo el ID
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personaje other = (Personaje) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    public double getCrit() {
        double _crit = this.crit;
        return _crit;
    }

    /**
     *
     * @param crit
     */
    public void setCrit(double crit) {
        double _crit = crit;
        this.crit = _crit;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getClase() {
        return this.clase;
    }

    /**
     *
     * @param clase
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     *
     * @return
     */
    public int getAtq() {
        int _atq = this.atq;
        return _atq;
    }

    /**
     *
     * @param atq
     */
    public void setAtq(int atq) {
        int _atq = atq;
        this.atq = _atq;
    }

    /**
     *
     * @return
     */
    public int getDef() {
        int _def = this.def;
        return _def;
    }

    /**
     *
     * @param def
     */
    public void setDef(int def) {
        int _def = def;
        this.def = _def;
    }

    /**
     *
     * @return
     */
    public int getVida() {
        int _vida = this.vida;
        return _vida;
    }

    /**
     *
     * @param vida
     */
    public void setVida(int vida) {
        //Para evitar que la vida sea negativa
        if (vida < 0) {
            this.vida = 0;
        }
        int _vida = vida;
        this.vida = _vida;
    }

}
