package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

public class GenerateurAleatoire extends GenerateurCarte{

    public GenerateurAleatoire(long seed){
        super(new Random().nextLong(seed));
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        return new Terrain(new Random().nextFloat(1),new Random().nextFloat(1),new Random().nextFloat(1));
    }
}
