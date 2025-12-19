/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problema07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matriz_x = new double[3][3];
        double[][] matriz_a = new double[3][3];
        double[][] matriz_b = new double[3][3];


        System.out.println("Ingrese los valores de la matriz X (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.printf("X[%d][%d]: ", i+1, columna+1);
                matriz_x[i][columna] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double x = matriz_x[i][j];
                matriz_a[i][j] = (x + 1) * (x + 1);       // (x+1)^2
                matriz_b[i][j] = (x * x) + (2 * x) + 1;   // x^2 + 2x + 1
            }
        }


        System.out.println("\nMatriz X:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz_x[fila][columna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz A ( (x+1)*(x+1) ):");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz_a[fila][columna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B ( x*x + 2*x + 1 ):");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz_b[fila][columna] + "\t");
            }
            System.out.println();
        }

        int diferencias = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (matriz_a[fila][columna] != matriz_b[fila][columna]) {
                    diferencias+=1;
                }
            }
        }

        if (diferencias == 0) {
            System.out.println("\nLa identidad algebraica se cumple.");
        } else {
            System.out.println("\nLa identidad algebraica no se cumple.");
        }



        
        
    }
    
}
