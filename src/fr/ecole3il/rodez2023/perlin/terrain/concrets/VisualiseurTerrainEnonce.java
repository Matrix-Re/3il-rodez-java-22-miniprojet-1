package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
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

	/**
	 * Obtient le type de terrain pour une position spécifique sur la carte.
	 * @param x Coordonnée x sur la carte.
	 * @param y Coordonnée y sur la carte.
	 * @return TypeTerrain Type de terrain déterminé.
	 */
	public TypeTerrain getTypeTerrain(int x, int y){
		return getDt().determinerTerrain(getAltitudeAffichee(x, y),getHydrometrieAffichee(x, y),getTemperatureAffichee(x, y));
	}

	/**
	 * Obtient l'altitude affichée pour une position spécifique sur la carte.
	 * @param x Coordonnée x sur la carte.
	 * @param y Coordonnée y sur la carte.
	 * @return Altitude du terrain.
	 */
	public float getAltitudeAffichee(int x, int y){
		return getC().getTerrain(x,y).getAltitude();
	}

	/**
	 * Obtient l'hydrométrie affichée pour une position spécifique sur la carte.
	 * @param x Coordonnée x sur la carte.
	 * @param y Coordonnée y sur la carte.
	 * @return Hydrométrie du terrain.
	 */
	public float getHydrometrieAffichee(int x, int y){
		return getC().getTerrain(x,y).getHydrometrie();
	}

	/**
	 * Obtient la température affichée pour une position spécifique sur la carte.
	 * @param x Coordonnée x sur la carte.
	 * @param y Coordonnée y sur la carte.
	 * @return Température du terrain.
	 */
	public float getTemperatureAffichee(int x, int y){
		return getC().getTerrain(x,y).getTemperature();
	}

}
