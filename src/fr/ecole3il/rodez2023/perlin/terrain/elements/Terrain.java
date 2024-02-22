package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.exception.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

import java.lang.reflect.Type;

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
     * @throws MauvaiseValeurException si les attributs ne sont pas compris dans les bornes
     */
    public Terrain(float altitude, float hydrometrie, float temperature){
        this.altitude = altitude;
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
        if (hydrometrie < 0 || hydrometrie > 1 || temperature < 0 || temperature > 1 || altitude < -1 || altitude > 1){
            System.out.println(altitude + " " + hydrometrie + " " + temperature);
            throw new MauvaiseValeurException("Les valeurs de hydrométrie, température et altitude doivent respecter les limites.");
        }
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

    public TypeTerrain getTypeTerrain(DetermineurTerrain dt){
        return dt.determinerTerrain(altitude,hydrometrie,temperature);
    }
}
