package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.concrets.DetermineurTerrainEnonce;

public class VisualiseurTerrain {

    private DetermineurTerrainEnonce dt;
    private Carte c;

    public VisualiseurTerrain(DetermineurTerrainEnonce dt, Carte c){
        this.dt = dt;
        this.c = c;
    }

    public DetermineurTerrainEnonce getDt() {
        return dt;
    }

    public void setDt(DetermineurTerrainEnonce dt) {
        this.dt = dt;
    }

    public Carte getC() {
        return c;
    }

    public void setC(Carte c) {
        this.c = c;
    }
}
