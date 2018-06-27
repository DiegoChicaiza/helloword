/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrados;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class CalculoCuadrado {

    private static int calcularCuadradoPerfecto(int limiteInicial, int limiteFinal) {
        int cuadradoPerfectos = 0;
        for (int base = 0; (base * base) <= limiteFinal; base++) {
            int cuadrado = (base * base);
            if (cuadrado >= limiteInicial && cuadrado <= limiteFinal) {
                cuadradoPerfectos++;
            }
        }
        return cuadradoPerfectos;
    }

    public static void main(String[] args) {
        System.out.println("************Cuadrados Perfectos**************");
        Scanner scann = new Scanner(System.in);
        int limInicial, limFinal;
        System.out.println("Ingrese el limite inical:");
        limInicial = Integer.valueOf(scann.nextLine());
        System.out.println("Ingrese el limite final:");
        limFinal = Integer.valueOf(scann.nextLine());
        System.out.println("**********************************");
        System.out.println("Número de cuadrados perfectos: " + calcularCuadradoPerfecto(limInicial, limFinal));
    }
}
