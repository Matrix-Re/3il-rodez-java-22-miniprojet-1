package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.VisualiseurTerrain;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {



	public VisualiseurTerrainEnonce(Carte c) {
		super(new DetermineurTerrainEnonce(), c);
	}

	public TypeTerrain getTypeTerrain(int x, int y){
		return getDt().determinerTerrain(getAltitudeAffichee(x, y),getHydrometrieAffichee(x, y),getTemperatureAffichee(x, y));
	}

	public int getAltitudeAffichee(int x, int y){
		return 0;
	}

	public int getHydrometrieAffichee(int x, int y){
		return 0;
	}

	public int getTemperatureAffichee(int x, int y){
		return 0;
	}

}
