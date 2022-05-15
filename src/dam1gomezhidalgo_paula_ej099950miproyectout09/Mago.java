package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Mago extends Personaje {

    private double CRIT = 0.3;
    private final int VIDA_EXTRA = 50;
    private Hechizos conjuro = new Hechizos();

    /**
     *
     */
    public Mago() {
        setClase("mago");
        setDef(getDef() + VIDA_EXTRA);
        setNombre("Lux, la dama luminosa");
    }

    /**
     *
     * @param nombre
     */
    public Mago(String nombre) {
        super(nombre);
        setClase("mago");
        setDef(getDef() + VIDA_EXTRA);
    }

    /**
     *
     * @param opt
     * @param mago
     * @param enemigo
     * @return
     */
    public int Hechizo(int opt, Personaje mago, Personaje enemigo) {
        switch (opt) {
            case 1:
                return conjuro.aturdir(enemigo);
            case 2:
                return conjuro.sanar(mago);
            default:
                return conjuro.cegar(enemigo);
        }
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
