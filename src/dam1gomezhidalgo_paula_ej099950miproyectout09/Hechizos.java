package dam1gomezhidalgo_paula_ej099950miproyectout09;

/**
 *
 * @author Paula Gomez Hidalgo
 */
public class Hechizos {

    /**
     * Recupera un 20% de la vida del personaje
     *
     * @param mago
     * @return 
     */
    public int sanar(Personaje mago) {
        int plusVida = (int) Math.ceil(mago.getVida() + 0.2);
        mago.setVida(mago.getVida() + plusVida);
        return plusVida;
    }

    /**
     * Reduce el ataque básico del enemigo
     *
     * @param enemigo
     * @return 
     */
    public int aturdir(Personaje enemigo) {
        int bajarAtq = (int) Math.ceil(enemigo.getAtq() * 0.2);
        enemigo.setAtq(enemigo.getAtq() - bajarAtq);
        return bajarAtq;
    }

    /**
     * Baja la defensa del enemigo
     * @param enemigo 
     * @return  
     */
    public int cegar(Personaje enemigo) {
        int bajarDef = (int) Math.ceil((enemigo.getDef()) * 0.2);
        enemigo.setDef(enemigo.getDef() - bajarDef);
        return bajarDef;
    }
}
