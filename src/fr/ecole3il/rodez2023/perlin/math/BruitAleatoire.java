package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe RandomNoise étend la classe Noise2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {

    /**
     * Constructeur de la classe RandomNoise2D.
     * @param graine La graine utilisée pour initialiser le générateur de bruit.
     * @param resolution La résolution utilisée pour la qualité du bruit
     */
    public BruitAleatoire(long graine, double resolution) {
        super(graine, resolution);
    }

    @Override
    public double bruit2D(double x, double y) {
        return new Random(getGraine()).nextDouble();
    }

}
