package fr.ecole3il.rodez2023.perlin.terrain.elements;

/**
 * Représente un terrain et ces caractéristiques.
 * Cette classe est utilisée pour définir les propriétés d'un terrain donné.
 */
public class Terrain {

    private float altitude;
    private float hydrometrie;
    private float temperature;

    /**
     * Constructeur de la classe Terrain.
     * @param altitude      Altitude du terrain.
     * @param hydrometrie   Hydrométrie du terrain.
     * @param temperature   Température du terrain.
     */
    public Terrain(float altitude, float hydrometrie, float temperature){
        System.out.println(altitude + " " + hydrometrie + " " + temperature);
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    /**
     * Obtient l'altitude du terrain.
     * @return Altitude du terrain.
     */
    public float getAltitude() {
        return altitude;
    }

    /**
     * Obtient l'hydrometrie du terrain.
     * @return Hydrometrie du terrain.
     */
    public float getHydrometrie() {
        return hydrometrie;
    }

    /**
     * Obtient la température du terrain.
     * @return Température du terrain.
     */
    public float getTemperature() {
        return temperature;
    }
}
