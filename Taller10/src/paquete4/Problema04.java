/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[3][2];
        int[][] b = new int[3][2];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("Ingrese un valor a matriz A [%d][%d]:", i + 1, j + 1);
                a[i][j] = entrada.nextInt();

            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("Ingrese un valor a matriz B [%d][%d]:", i + 1, j + 1);
                b[i][j] = entrada.nextInt();
            }

        }
        System.out.println("\nMatriz A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar matriz B
        System.out.println("\nMatriz B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        int menores = 0;
        int mayores = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < b[i][j]) {
                    menores += 1;
                }
                if (a[i][j] > b[i][j]) {
                    mayores += 1;
                }
            }
        }

        if (menores == 0 && mayores > 0) {
            System.out.println("\nLa matriz A es mayor que la matriz B");
        } else {
            if (menores == 0 && mayores > 0) {
                System.out.println("\nLa matriz A y la matriz B son iguales");
            } else {
                System.out.println("\nLa matriz A no es mayor que la matriz B");
            }
        }
    }
}
