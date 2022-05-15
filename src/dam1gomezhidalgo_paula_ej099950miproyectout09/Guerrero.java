package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Guerrero extends Personaje {

    private double CRIT = 0.7;
    private final int DEF_EXTRA = 50;

    /**
     *
     */
    public Guerrero() {
        setClase("guerrero");
        setDef(getDef() + DEF_EXTRA);
        setCrit(CRIT);
        setNombre("Garen, el poder de Demacia");
    }

    /**
     *
     * @param nombre
     */
    public Guerrero(String nombre) {
        super(nombre);
        setClase("guerrero");
        setDef(getDef() + DEF_EXTRA);
        setCrit(CRIT);
    }

    /**
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
     *
     * @return
     */
    public boolean Huir() {
        return generarProbabilidad(0.5) == true;
    }
}
