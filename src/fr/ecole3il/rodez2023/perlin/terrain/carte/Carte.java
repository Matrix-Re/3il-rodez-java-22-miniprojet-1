package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurPerlin;

public class Carte {
    private String nom;
    private int largeur;
    private int hauteur;
    GenerateurCarte gc;

    public Carte(String nom, int largeur, int hauteur, GenerateurCarte gc){
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.gc = gc;
    }

    public String getNom() {
        return nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Terrain getTerrain(int x, int y){
        return null;
    }
}
