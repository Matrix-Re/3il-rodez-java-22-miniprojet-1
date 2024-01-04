package fr.ecole3il.rodez2023.perlin.math;

/**
 * La classe abstraite Noise2D est une base pour la génération de bruit en 2D.
 * Elle définit des méthodes permettant d'obtenir des valeurs de bruit en deux dimensions.
 */
public abstract class Bruit2D {
    
    /** La graine utilisée pour la génération du bruit */
    private final long graine;
    /* A REVOIR !!! */
    private double resolution;
    
    /**
     * Constructeur de la classe Noise2D.
     * @param seed La graine utilisée pour initialiser le générateur de bruit.
     * @param resolution La résolution utilisée pour la qualité du bruit
     */
    public Bruit2D(long seed, double resolution) {
        this.graine = seed;
        this.resolution = resolution;
    }
    
    /**
     * Méthode abstraite pour obtenir la valeur de bruit en 2D pour les coordonnées spécifiées.
     * @param x Coordonnée x pour laquelle obtenir le bruit.
     * @param y Coordonnée y pour laquelle obtenir le bruit.
     * @return La valeur de bruit en 2D pour les coordonnées fournies.
     */
    public abstract double bruit2D(double x, double y);

    /**
     * Méthode permettant d'obtenir la graine utilisée pour la génération du bruit.
     * @return La graine utilisée pour la génération du bruit.
     */
    public long getGraine() {
        return graine;
    }

}
