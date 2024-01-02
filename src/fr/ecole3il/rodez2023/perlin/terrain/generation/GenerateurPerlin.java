package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

import java.util.Random;

public class GenerateurPerlin extends GenerateurCarte{


    public GenerateurPerlin(long seed){
        super(new Random().nextLong(seed));

    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        return null;
    }
}
