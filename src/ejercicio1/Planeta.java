package ejercicio1;

/**
 * Representa un planeta del sistema planetario.
 *
 * @version 01.00.00 2022-02-22
 * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
 * @since 01.00.00
 */
public class Planeta {
    private final String id;
    private String name;
    private int mass;
    private int density;
    private int diameter;
    private int sunDistance;


    /**
     * Constructor del Planeta.
     *
     * @param id De tipo String
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param sunDistance
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public Planeta(String id, String name, int mass, int density, int diameter, int sunDistance) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
    }

    /**
     * Calcula la atracción gravitatoria de dos planetas cualquiera del sistema planetario,
     * a partir de la masa y la distancia al sol de ambos.
     *
     * @param mass1 Masa del planeta 1
     * @param mass2 Masa del planeta 2
     * @param sunDistance1 Distancia al sol del planeta 1
     * @param sunDistance2 Distancia al sol del planeta 2
     * @return Devuelve la atracción gravitatoria de los dos planetas
     *
     * @author Gustavo López Frutos - gus.lopezfrutos@gmail.com
     * @since 01.00.00
     */
    public double calcGravAttrac(int mass1, int mass2, int sunDistance1, int sunDistance2) {
        final double constantG = 6.67408 * Math.pow(10, -11);
        int distance;
        if (sunDistance1 > sunDistance2) {
            distance = sunDistance1 - sunDistance2;
        } else {
            distance = sunDistance2 - sunDistance1;
        }
        return (constantG * mass1 * mass2) / Math.pow(distance, 2);
    }
}
