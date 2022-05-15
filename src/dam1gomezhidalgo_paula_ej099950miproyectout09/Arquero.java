package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Arquero extends Personaje {

    //Cada personaje tendrá un critico distinto
    private double CRIT = 0.4;
    private final int ATQ_EXTRA = 50;

    /**
     * Constructor con valores por defecto
     */
    public Arquero() {
        setClase("arquero");
        setAtq(getAtq() + ATQ_EXTRA);
        setCrit(CRIT);
        setNombre("Quinn, las alas de Demacia");
    }

    /**
     * Constructor personalizando el nombre
     *
     * @param nombre
     */
    public Arquero(String nombre) {
        super(nombre);
        setClase("arquero");
        setAtq(getAtq() + ATQ_EXTRA);
        setCrit(CRIT);
    }

    /**
     * Movimiento que devuelve el daño final que hará el personaje
     *
     * @return
     */
    @Override
    public int Atacar() {
        if (generarProbabilidad(CRIT) == true) {
            return getAtq();
        } else {
            return (int) Math.ceil(CRIT * getAtq());
        }

    }

    /**
     * Movimiento con el que el personaje puede mejorar sus defensas y aguantar
     * mejor los golpes
     *
     * @return
     */
    @Override
    public int defensa() {
        int plusDef = (int) Math.ceil(getDef() * 0.15);
        //System.out.println("¡La defensa ha aumentado " + plusDef + " puntos!");
        setDef(getDef() + plusDef);
        return getDef();
    }

    /**
     * Metodo que calcula un porcentaje de probabilidad para poder salir de la
     * lucha
     *
     * @return
     */
    @Override
    public boolean Huir() {
        return generarProbabilidad(0.5) == true;
    }

}
