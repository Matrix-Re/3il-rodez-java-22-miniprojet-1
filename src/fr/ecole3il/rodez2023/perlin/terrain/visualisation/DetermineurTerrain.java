package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

/**
 * Interface définissant un détermineur de terrain.
 * Les classes implémentant cette interface sont responsables de déterminer le type de terrain en fonction des propriétés spécifiées.
 */
public interface DetermineurTerrain {

	/**
	 * Détermine le type de terrain en fonction des propriétés spécifiées.
	 * @param altitude     Altitude du terrain.
	 * @param hydrometrie  Hydrométrie du terrain.
	 * @param temperature  Température du terrain.
	 * @return TypeTerrain  Type de terrain déterminé.
	 */
	public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);


}
