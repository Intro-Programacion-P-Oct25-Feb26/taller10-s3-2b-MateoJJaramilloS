/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {
       public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero o real: ");
        double numero_ingresado = entrada.nextDouble();


        double[][] matriz_original = new double[5][6];
        double[][] matriz_resultante = new double[5][6];

        System.out.println("Ingrese los valores de la matriz (5x6):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Elemento [%d][%d]: ", i+ 1, j + 1);
                matriz_original[i][j] = entrada.nextDouble();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz_resultante[i][j] = matriz_original[i][j] * numero_ingresado;
            }
        }

        // Paso 6: Mostrar matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz_original[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nMatriz Resultante:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz_resultante[i][j] + "\t");
            }
            System.out.println();
        }

       }
    
}
