package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.Bruit2D;
import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

public class GenerateurPerlin extends GenerateurCarte{

    private BruitPerlin2D bp2d;

    public GenerateurPerlin(long seed){
        super(new Random().nextLong(seed));
        bp2d = new BruitPerlin2D(getGraine(),1);
    }

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
