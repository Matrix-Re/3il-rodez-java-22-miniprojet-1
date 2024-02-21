package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.AltitudeAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.VisualiseurTerrain;

/**
 * Classe représentant un visualiseur de terrain basé sur les spécifications d'une carte.
 * Il utilise un détermineur de terrain spécifique pour déterminer le type de terrain en fonction des propriétés de la carte.
 */
public class VisualiseurTerrainEnonce extends VisualiseurTerrain {

	/**
	 * Constructeur de la classe VisualiseurTerrainEnonce.
	 * @param c Carte à visualiser.
	 */
	public VisualiseurTerrainEnonce(Carte c) {
		super(new DetermineurTerrainEnonce(), c);
	}

	public TypeTerrain getTypeTerrain(int x, int y){
		Terrain t = c.getTerrain(x, y);
		return dt.determinerTerrain(t.getAltitude(),t.getHydrometrie(),t.getTemperature());
	}

}
