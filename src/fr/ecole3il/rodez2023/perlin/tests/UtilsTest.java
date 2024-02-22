package fr.ecole3il.rodez2023.perlin.tests;

import fr.ecole3il.rodez2023.perlin.Utils;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void main() {
        minTest();
        testMelanger();
    }

    private void minTest(){
        assertEquals(4, Utils.min(4, 5));
        assertEquals(4, Utils.min(5, 4));
        assertEquals(4, Utils.min(4, 4));
    }

    @Test
    public void testMelanger() {
        int[] tableau = {1, 2, 3, 4, 5};
        long graine = 111;

        int[] resultat = Utils.melanger(Arrays.copyOf(tableau, tableau.length), graine);

        assertEquals(tableau.length, resultat.length, "La taille du tableau ne correspond pas");

        boolean positionsDifferentes = false;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != resultat[i]) {
                positionsDifferentes = true;
                break;
            }
        }

        assert positionsDifferentes : "Le tableau n'a pas été mélangé.";
    }

}
