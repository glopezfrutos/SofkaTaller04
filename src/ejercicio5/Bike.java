package ejercicio5;

public class Bike extends Vehicle {
    /**
     * Representa la cantidad de bicicletas instanciados.
     */
    private static int BikeCount;

    /**
     * Representa la cantidad de pasajeros a bordo.
     */
    private boolean esPlegable;


    // Getters and Setters

    /**
     * @return Devuelve el número de camiones creados (int).
     */
    public static int getBikeCount() {
        return BikeCount;
    }

    /**
     * Define el número de camiones creados.
     * @param bikeCount número de camiones creados (int)
     */
    public static void setBikeCount(int bikeCount) {
        BikeCount = bikeCount;
    }

    /**
     * @return Devuelve si es plegable (boolean).
     */
    public boolean esPlegable() {
        return esPlegable;
    }

    /**
     * Define si es plegable (boolean).
     * @param esPlegable si es plegable (boolean).
     */
    public void setEsPlegable(boolean esPlegable) {
        this.esPlegable = esPlegable;
    }

    // Constructor
    /**
     * Constructor de Bicicleta, con contador de objetos creados.
     */
    public Bike() {
        super();
        this.esPlegable = false;
        setBikeCount(getBikeCount() +1 );
    }
}
