/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] sensores = {
    {true, true, true, true, true, true},
    {true, false, true, false, true, false},
    {false, false, false, false, false, false},
    {true, true, false, true, true, false}
};
        int sin_fallos = 0;
        String zona_fallos = "";
        
         for (int i = 0; i < sensores.length; i++) {
        int contador = 0;

        for (int j = 0; j < sensores[i].length; j++) {
            if (sensores[i][j]) {
                contador+=1;
            }
        }


        if (contador == sensores[i].length) {
            sin_fallos+=1;
        } else {
            zona_fallos += "Zona " + (i + 1) + "\n";
        }
    }

    System.out.println("Número de zonas que funcionan sin fallos: " + sin_fallos);
    System.out.println("Zonas con al menos un fallo:");
    System.out.println(zona_fallos);
}
        
}
