package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class Terrain {

    private float altitude;
    private float hydrometrie;
    private float temperature;

    public Terrain(float altitude, float hydrometrie, float temperature){
        System.out.println(altitude + " " + hydrometrie + " " + temperature);
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    public float getAltitude() {
        return altitude;
    }

    public float getHydrometrie() {
        return hydrometrie;
    }

    public float getTemperature() {
        return temperature;
    }
}
