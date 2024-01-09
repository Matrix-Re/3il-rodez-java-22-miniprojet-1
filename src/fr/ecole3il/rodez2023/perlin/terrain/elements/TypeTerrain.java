package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain {
    PLAINE, FORET_FEUILLUS, TOUNDRA, FORET_CONIFÈRES, MONTAGNE, DESERT, COLLINES, MARAIS, OCEAN;

    public BufferedImage getImage() {

        BufferedImage image = null;

        switch (this.name()){
            case "PLAINE":
                image = Utils.chargerTuile("plain.png");
                break;
            case "FORET_FEUILLUS":
                image = Utils.chargerTuile("deciduous_forest.png");
                break;
            case "TOUNDRA":
                image = Utils.chargerTuile("tundra.png");
                break;
            case "FORET_CONIFÈRES":
                image = Utils.chargerTuile("coniferous_forest.png");
                break;
            case "MONTAGNE":
                image = Utils.chargerTuile("mountain.png");
                break;
            case "DESERT":
                image = Utils.chargerTuile("desert.png");
                break;
            case "COLLINES":
                image = Utils.chargerTuile("hills.png");
                break;
            case "MARAIS":
                image = Utils.chargerTuile("marsh.png");
                break;
            case "OCEAN":
                image = Utils.chargerTuile("ocean.png");
                break;
        }

        return image;
    }
}
