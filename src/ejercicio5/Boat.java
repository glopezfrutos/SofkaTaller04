package ejercicio5;

public class Boat extends Vehicle {
    /**
     * Representa la cantidad de botes instanciados.
     */
    private static int boatCount;

    /**
     * Representa la cantidad de pasajeros a bordo.
     */
    private int lifeJacketCount;


    // Getters and Setters

    /**
     * @return Devuelve el número de botes creados (int).
     */
    public static int getBoatCount() {
        return boatCount;
    }

    /**
     * Define el número de botes creados.
     * @param boatCount número de botes creados (int).
     */
    public static void setBoatCount(int boatCount) {
        Boat.boatCount = boatCount;
    }

    /**
     * @return Devuelve el número de salvavidas a bordo (int).
     */
    public int getLifeJacketCount() {
        return lifeJacketCount;
    }

    /**
     * Define el número de salvavidas a bordo.
     * @param lifeJacketCount número de salvavidas a bordo (int).
     */
    public void setLifeJacketCount(int lifeJacketCount) {
        this.lifeJacketCount = lifeJacketCount;
    }

    // Constructor

    /**
     * Constructor de Bote, con contador de objetos creados.
     */
    public Boat() {
        super();
        this.lifeJacketCount = 10;
        setBoatCount(getBoatCount() +1 );
    }
}
