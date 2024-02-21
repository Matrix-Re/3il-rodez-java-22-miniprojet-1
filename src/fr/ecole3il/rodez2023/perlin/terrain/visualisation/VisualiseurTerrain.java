package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

/**
 * Classe représentant un visualiseur de terrain.
 * Ce visualiseur utilise un détermineur de terrain spécifique et une carte pour afficher les informations de terrain.
 */
public abstract class VisualiseurTerrain {

    protected DetermineurTerrainEnonce dt;
    protected Carte c;

    /**
     * Constructeur de la classe VisualiseurTerrain.
     * @param dt Détermineur de terrain à utiliser.
     * @param c  Carte à visualiser.
     */
    public VisualiseurTerrain(DetermineurTerrainEnonce dt, Carte c){
        this.dt = dt;
        this.c = c;
    }

    /**
     * Obtient l'altitude affichée pour une position spécifique sur la carte.
     * @param x Coordonnée x sur la carte.
     * @param y Coordonnée y sur la carte.
     * @return Altitude du terrain.
     */
    public AltitudeAffichee getAltitudeAffichee(int x, int y){
        AltitudeAffichee resultat = null;

        TypeTerrain typeT = getTypeTerrain(x, y);

        if (TypeTerrain.OCEAN.equals(typeT))
        {
            resultat = AltitudeAffichee.Basse;
        }
        if (TypeTerrain.PLAINE.equals(typeT) || TypeTerrain.FORET_FEUILLUS.equals(typeT) || TypeTerrain.TOUNDRA.equals(typeT))
        {
            resultat = AltitudeAffichee.Moyenne;
        }
        if (TypeTerrain.DESERT.equals(typeT) || TypeTerrain.COLLINES.equals(typeT) || TypeTerrain.MONTAGNE.equals(typeT))
        {
            resultat = AltitudeAffichee.Elevee;
        }

        return resultat;
    }

    /**
     * Obtient l'hydrométrie affichée pour une position spécifique sur la carte.
     * @param x Coordonnée x sur la carte.
     * @param y Coordonnée y sur la carte.
     * @return Hydrométrie du terrain.
     */
    public HydrometrieAffichee getHydrometrieAffichee(int x, int y){
        HydrometrieAffichee resultat = null;

        TypeTerrain typeT = getTypeTerrain(x, y);

        if (TypeTerrain.DESERT.equals(typeT) || TypeTerrain.MARAIS.equals(typeT))
        {
            resultat = HydrometrieAffichee.Sec;
        }
        if (TypeTerrain.PLAINE.equals(typeT) || TypeTerrain.FORET_CONIFÈRES.equals(typeT))
        {
            resultat = HydrometrieAffichee.Moyen;
        }
        if (TypeTerrain.COLLINES.equals(typeT) || TypeTerrain.FORET_CONIFÈRES.equals(typeT))
        {
            resultat = HydrometrieAffichee.Humide;
        }

        return resultat;
    }

    /**
     * Obtient la température affichée pour une position spécifique sur la carte.
     * @param x Coordonnée x sur la carte.
     * @param y Coordonnée y sur la carte.
     * @return Température du terrain.
     */
    public TempératureAffichee getTemperatureAffichee(int x, int y){
        TempératureAffichee resultat = null;

        TypeTerrain typeT = getTypeTerrain(x, y);

        if (TypeTerrain.DESERT.equals(typeT) || TypeTerrain.MARAIS.equals(typeT))
        {
            resultat = TempératureAffichee.Froid;
        }
        if (TypeTerrain.PLAINE.equals(typeT) || TypeTerrain.FORET_CONIFÈRES.equals(typeT))
        {
            resultat = TempératureAffichee.Tempéré;
        }
        if (TypeTerrain.COLLINES.equals(typeT) || TypeTerrain.FORET_CONIFÈRES.equals(typeT))
        {
            resultat = TempératureAffichee.Chaud;
        }

        return resultat;
    }

    /**
     * Obtient le type de terrain pour une position spécifique sur la carte.
     * @param x Coordonnée x sur la carte.
     * @param y Coordonnée y sur la carte.
     * @return TypeTerrain Type de terrain déterminé.
     */
    public abstract  TypeTerrain getTypeTerrain(int x, int y);
}
