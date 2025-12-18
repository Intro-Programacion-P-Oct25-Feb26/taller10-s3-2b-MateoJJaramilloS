/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] edades = {
    {5, 12, 35, 40},
    {8, 15, 33, 38},
    {6, 10, 30, 36}
};
        String mensaje = "";
        int menores= 0;
        int adultos [] = new int[edades.length];
        
        for (int i = 0; i < edades.length; i++) {
        for (int j = 0; j < edades[i].length; j++) {
            if (edades[i][j] < 18) {
                menores = menores + 1;
            } else {
                adultos[i]+=1;
            }
        }
    }
    mensaje+= String.format("Total de menores de edad: " + menores +"\n-------------------\n");
    for (int i = 0; i < adultos.length; i++) {
        mensaje+= String.format("Familia " + (i + 1) + " tiene " + adultos[i] + " adultos.\n");
    }
        System.out.print(mensaje);
}

