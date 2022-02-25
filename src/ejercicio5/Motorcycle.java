package ejercicio5;

public class Motorcycle extends Vehicle {
    /**
     * Representa la cantidad de motos instanciadas.
     */
    private static int MotorcycleId;

    /**
     * Representa si tiene casco.
     */
    private boolean hasHelmet;


    // Getters and setters

    /**
     * @return Devuelve el número de motocicletas creadas (int).
     */
    public static int getMotorcycleId() {
        return MotorcycleId;
    }

    /**
     * @return Devuelve si tiene casco (boolean).
     */
    public boolean hasHelmet() {
        return hasHelmet;
    }

    /**
     * Define si tiene casco.
     * @param hasHelmet si tiene casco (boolean).
     */
    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    // Constructor

    /**
     * Constructor de moto, con contador de objetos creados.
     */
    public Motorcycle() {
        super();
        this.hasHelmet = false;
        MotorcycleId = getMotorcycleId() + 1;
    }
}
