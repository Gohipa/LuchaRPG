
package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Golem extends Personaje {

    private double CRIT = 0.2;
    private final int DEF_EXTRA = 40;

    /**
     * Constructor con valores por defecto
     */
    public Golem() {
        setClase("golem");
        setDef(getDef() + DEF_EXTRA);
        setCrit(CRIT);
        setNombre("El coloso de Barro");
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
        int plusDef = (int) Math.ceil(getDef() * 0.05);
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
    public boolean Huir() {
        return generarProbabilidad(0.2) == true;
    }
}
