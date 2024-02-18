package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

/**
 * Classe représentant un générateur de carte basé sur des valeurs aléatoires.
 */
public class GenerateurAleatoire extends GenerateurCarte{

    /**
     * Constructeur de la classe GenerateurAleatoire.
     * @param seed Graine pour initialiser la séquence de nombres aléatoires.
     */
    public GenerateurAleatoire(long seed){
        super(new Random(seed).nextLong());
    }

    /**
     * Génère un terrain aléatoire.
     * @param i
     * @param j
     * @param largeur
     * @param hauteur
     * @return Terrain Terrain généré de manière aléatoire.
     */
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        return new Terrain(new Random(1).nextFloat() * 2 - 1,new Random(1).nextFloat(),new Random(1).nextFloat());
    }
}
