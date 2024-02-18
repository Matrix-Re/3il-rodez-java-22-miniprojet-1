package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.exception.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurPerlin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 * La classe Carte représente une carte générée en utilisant des générateurs.
 * Elle possède des getter pour les terrains qui la composes.
 */
public class Carte {
    private String nom;
    private int largeur;
    private int hauteur;
    GenerateurCarte gc;
    Terrain[][] t;

    /**
     * Méthode abstraite pour obtenir la valeur de bruit en 2D pour les coordonnées spécifiées.
     * @param nom Nom de la carte.
     * @param largeur Largeur de la carte.
     * @param hauteur Hauteur de la carte.
     * @param generateurCarte Type de générateur utiliser pour la carte.
     */
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte){
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.gc = generateurCarte;
        t = gc.genererCarte(largeur,hauteur);
    }

    /**
     * Méthode abstraite pour obtenir la valeur de bruit en 2D pour les coordonnées spécifiées.
     * @param donneesCarte Données de la carte sous forme de chaine des caractère.
     */
    public Carte(String donneesCarte){
        Scanner scanner = null;
        try {
            scanner = new Scanner(donneesCarte).useLocale(Locale.US);

            this.nom = scanner.nextLine();
            this.largeur = scanner.nextInt();
            this.hauteur = scanner.nextInt();
            this.t = new Terrain[this.largeur][this.hauteur];

            for (int i = 0; i < largeur; i++)
                for (int j = 0; j < hauteur; j++)
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

    /**
     * Obtient le nom de la carte.
     * @return Le nom de la carte.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient La largeur de la carte.
     * @return La largeur de la carte.
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Obtient La hauteur de la carte.
     * @return La hauteur de la carte.
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Obtient Un terrain au coordonnées spécifiées.
     * @param x Coordonnée en abscisse du terrain.
     * @param y Coordonnée en ordonnée du terrain.
     * @return Un terrain de la carte au coordonnées x et y ou null si innexistant.
     * @throws TerrainInexistant si les coordonnées sont hors des limites du terrain
     */
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
