package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.Bruit2D;
import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

/**
 * Classe représentant un générateur de carte basé sur des valeurs réalier avec le bruit de perlin.
 */
public class GenerateurPerlin extends GenerateurCarte{

    private BruitPerlin2D bp2d;

    /**
     * Constructeur de la classe GenerateurPerlin.
     * @param seed Graine pour initialiser la séquence de nombres aléatoires.
     */
    public GenerateurPerlin(long seed){
        super(new Random(seed).nextLong());
        bp2d = new BruitPerlin2D(getGraine(),1);
    }

    /**
     * Génère un terrain basé sur le bruit de Perlin pour une position spécifique sur la carte.
     * @param i       Coordonnée i sur la carte.
     * @param j       Coordonnée j sur la carte.
     * @param largeur Largeur de la carte.
     * @param hauteur Hauteur de la carte.
     * @return Terrain Terrain généré avec le bruit de Perlin.
     */
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {

        // Normalisation des coordonnées
        double xNormalized = (double) i / largeur;
        double yNormalized = (double) j / hauteur;

        double hydrometrie = bp2d.bruit2D(xNormalized, yNormalized);
        double temperature = bp2d.bruit2D(2 * xNormalized, 2 * yNormalized); // Le double de la résolution pour la température
        double altitude = bp2d.bruit2D(4 * xNormalized, 4 * yNormalized);     // Le quadruple de la résolution pour l'altitude

        // Appliquer les règles de graines spécifiées
        hydrometrie *= getGraine();
        temperature *= 2 * getGraine();
        altitude *= 4 * temperature;

        return new Terrain((float) hydrometrie, (float) temperature, (float) altitude);

    }
}
