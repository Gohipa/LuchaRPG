package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Dragon extends Personaje{
    private double CRIT = 0.2;
    private final int ATQ_EXTRA = 40;
    
    /**
     *
     */
    public Dragon(){
        setClase("Dragon");
        setDef(getDef() + ATQ_EXTRA);
        setCrit(CRIT);
        setNombre("El dragon de la tormenta");
    }
    
    /**
     *
     * @return
     */
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
        int plusDef = (int) Math.ceil(getDef() * 0.05);
        //System.out.println("¡La defensa ha aumentado " + plusDef + " puntos!");
        setDef(getDef() + plusDef);
        return getDef();
    }

    /**
     *
     * @return
     */
    public boolean Huir() {
        return generarProbabilidad(0.2) == true;
    }
}
