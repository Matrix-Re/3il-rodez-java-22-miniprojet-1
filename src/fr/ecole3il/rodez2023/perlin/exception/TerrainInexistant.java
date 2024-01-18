package fr.ecole3il.rodez2023.perlin.exception;

/**
* @author anasm
 * Exception levée lorsqu'un terrain n'existe pas
*/
public class TerrainInexistant extends Exception{

    /**
     * Constructeur de l'exeption dans le cas d'un terrain innexistant.
     * @param message Message de l'erreur.
     */
    public TerrainInexistant(String message){
        super(message);
    }
}