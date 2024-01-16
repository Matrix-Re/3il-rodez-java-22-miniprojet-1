package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurPerlin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Carte {
    private String nom;
    private int largeur;
    private int hauteur;
    GenerateurCarte gc;
    Terrain[][] t;

    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte){
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.gc = generateurCarte;
        t = gc.genererCarte(largeur,hauteur);
    }

    public Carte(String donneesCarte){
        Scanner scanner = null;
        try {
            scanner = new Scanner(donneesCarte).useLocale(Locale.US);

            this.nom = scanner.nextLine();
            this.largeur = scanner.nextInt();
            this.hauteur = scanner.nextInt();
            this.t = new Terrain[this.largeur][this.hauteur];

            for (int i = 0; i < largeur; i++)
                for (int j = 0; j < largeur; j++)
                    this.t[j][i] = new Terrain(scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());

        } catch (Exception e) {
            System.err.println("Le fichier n'a pas été trouvé : " + e.getMessage());
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
        }
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

        try{
            if (0 <= x & x <= largeur & 0 <= y & y <= hauteur){
                return t[x][y];
            }
            else {
                throw new TerrainInexistant("Le terrain est inexistant.");
            }
        }
        catch (TerrainInexistant e) {
            System.out.println("Terrain inexistant : " + e.getMessage());
        }
        return null;
    }
}
