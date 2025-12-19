/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author User
 */
public class Problema08 {
    public static void main(String[] args) {
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double[][] dato2 = {{10, 1, 2},{10, 9, 1}};

        double[][] resultado = new double[2][3];

        for (int fila = 0; fila < resultado.length; fila++) {
            for (int columna = 0; columna < resultado[fila].length; columna++) {
                if (dato1[fila][columna] < dato2[fila][columna]) {
                    resultado[fila][columna] = dato1[fila][columna];
                } else {
                    resultado[fila][columna] = dato2[fila][columna];
                }
            }
        }

        // Mostrar resultado
        System.out.println("Arreglo resultado:");
        for (int fila = 0; fila < resultado.length; fila++) {
            for (int columna = 0; columna < resultado[fila].length; columna++) {
                System.out.print(resultado[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
}

    }
}


