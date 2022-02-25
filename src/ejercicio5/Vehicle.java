package ejercicio5;

/**
 * Representa un vehículo genérico.
 *
 * @version 01.00.00 2022-02-22
 * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
 * @since 01.00.00
 */
public class Vehicle {
    // Atributos
    /**
     * Representa la cantidad de vehículos instanciados.
     */
    private static int vehicleCount = 0;

    /**
     * Representa la cantidad de pasajeros a bordo.
     */
    private int passengerCount;

    /**
     * Representa si la tripulación está a bordo.
     */
    private boolean crew;

    /**
     * Representa la cantidad de ruedas
     */
    private int wheelsCount;

    /**
     * Representa el año de matriculación del vehículo.
     */
    private int matYear;

    /**
     * Representa el medio a través del cuál transita (terrestre, aéreo, marítimo)
     */
    private String environment;


    // Constructor
    /**
     * Constructor del vehículo genérico.
     */
    public Vehicle() {
        this.passengerCount = 0;
        this.crew = false;
        this.wheelsCount = 0;
        this.matYear = 2022;
        this.environment = "terrestre";
        vehicleCount++;
    }

    //Getters and Setters.
    /**
     * Devuelve la cantidad de pasajeros a bordo.
     */
    public int getPassengerCount() {
        return passengerCount;
    }

    /**
     * Define la cantidad de pasajeros a bordo.
     */
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    /**
     * Devuelve si la tripulación está a bordo.
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Define si la tripulación está a bordo.
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Devuelve la cantidad de ruedas
     */
    public int getWheelsCount() {
        return wheelsCount;
    }

    /**
     * Define la cantidad de ruedas
     */
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    /**
     * Devuelve el año de matriculación del vehículo.
     */
    public int getMatYear() {
        return matYear;
    }

    /**
     * Define el año de matriculación del vehículo.
     */
    public void setMatYear(int matYear) {
        this.matYear = matYear;
    }

    /**
     * Devuelve el medio a través del cual se transporta (terrestre, aéreo, marítimo)
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Define el medio a través del cual se transporta (terrestre, aéreo, marítimo)
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * @return Devuelve el número de vehículos creados (int).
     */
    public static int getVehicleCount() {
        return vehicleCount;
    }

    /**
     * Define el número de vehículos creados.
     * @param vehicleCount Número de vehículos creados (int).
     */
    public static void setVehicleCount(int vehicleCount) {
        Vehicle.vehicleCount = vehicleCount;
    }
}
