package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;

/**
 * Classe représentant un visualiseur de terrain.
 * Ce visualiseur utilise un détermineur de terrain spécifique et une carte pour afficher les informations de terrain.
 */
public abstract class VisualiseurTerrain {

    private DetermineurTerrainEnonce dt;
    private Carte c;

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
     * Obtient le détermineur de terrain utilisé par le visualiseur.
     * @return DetermineurTerrainEnonce Le détermineur de terrain.
     */
    public DetermineurTerrainEnonce getDt() {
        return dt;
    }

    /**
     * Définit le détermineur de terrain à utiliser par le visualiseur.
     * @param dt Nouveau détermineur de terrain.
     */
    public void setDt(DetermineurTerrainEnonce dt) {
        this.dt = dt;
    }

    /**
     * Obtient la carte associée au visualiseur.
     * @return Carte La carte à visualiser.
     */
    public Carte getC() {
        return c;
    }

    /**
     * Définit la carte à visualiser pour le visualiseur.
     * @param c Nouvelle carte à visualiser.
     */
    public void setC(Carte c) {
        this.c = c;
    }
}
