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
        String con_fallos = "";

        for (int i = 0; i < sensores.length; i++) {
            int contador_true = 0;

            for (int j = 0; j < sensores[i].length; j++) {
                if (sensores[i][j]) {
                    contador_true += 1;
                }
            }

            // Si el número de true es igual al total de revisiones → sin fallos
            if (contador_true == sensores[i].length) {
                sin_fallos += 1;
            } else {
                con_fallos += "Zona " + (i + 1) + "\n";
            }
        }

        String mensaje = String.format("Zonas sin fallos: Zona %d\nZonas con al menos un fallo:\n%s",
                sin_fallos,
                con_fallos);

        System.out.println(mensaje);
    }
