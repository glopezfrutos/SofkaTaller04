package ejercicio5;

public class Car extends Vehicle {
    /**
     * Representa la cantidad de autos instanciados.
     */
    private static int carCount;

    /**
     * Representa la cantidad de puertas del auto.
     */
    private int doorCount;

    // Getters and Setters

    /**
     * @return Devuelve el número de autos creados (int).
     */
    public static int getCarCount() {
        return carCount;
    }

    /**
     * Define el número de autos creados.
     * @param boatCount número de autos creados (int).
     */
    public static void setCarCount(int boatCount) {
        carCount = boatCount;
    }

    /**
     * @return Devuelve la cantidad de puertas (int).
     */
    public int getDoorCount() {
        return doorCount;
    }


    /**
     * Define la cantidad de puertas.
     * @param doorCount cantidad de puertas (int).
     */
    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    // Constructor

    /**
     * Constructor de Auto, con contador de objetos creados.
     */
    public Car() {
        super();
        this.doorCount = 5;
        setCarCount(getCarCount() +1 );
    }
}
