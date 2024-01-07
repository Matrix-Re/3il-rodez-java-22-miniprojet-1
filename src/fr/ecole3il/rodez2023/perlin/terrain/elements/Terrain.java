package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class Terrain {

    private long altitude;
    private long hydrometrie;
    private long temperature;

    public Terrain(long altitude, long hydrometrie, long temperature){
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
    }

    public long getAltitude() {
        return altitude;
    }

    public long getHydrometrie() {
        return hydrometrie;
    }

    public long getTemperature() {
        return temperature;
    }
}
