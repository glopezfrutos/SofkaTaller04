package ejercicio5;

public class Truck extends Vehicle {
    /**
     * Representa la cantidad de motos instanciadas.
     */
    private static int TruckCount;

    /**
     * Representa si tiene casco.
     */
    private double hight;


    // Getters and setters
    /**
     * @return Devuelve el número de camiones creados (int).
     */
    public static int getTruckCount() {
        return TruckCount;
    }

    /**
     * Define el número de camiones creados.
     * @param truckCount número de camiones creados (int).
     */
    public static void setTruckCount(int truckCount) {
        TruckCount = truckCount;
    }

    /**
     * @return Devuelve la altura del camión.
     */
    public double getHight() {
        return hight;
    }

    /**
     * Define la altura del camión.
     * @param hight altura del camión (double).
     */
    public void setHight(double hight) {
        this.hight = hight;
    }


    // Constructor

    /**
     * Constructor de Camión, con contador de objetos creados.
     */
    public Truck() {
        super();
        this.hight = 2.80;
        setTruckCount(getTruckCount() +1 );
    }
}
