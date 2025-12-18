/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };
        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int asistencias_estudiantes[] = new int[estudiantes.length];
        String mensaje = "";
        int inasistencias_estudiantes[] = new int[estudiantes.length];
        String asistencia_completa = "";

        for (int i = 0; i < asistencia.length; i++) {
            for (int j = 0; j < asistencia[i].length; j++) {
                if (asistencia[i][j] == true) {
                    asistencias_estudiantes[i] = asistencias_estudiantes[i] + 1;
                } else {
                    inasistencias_estudiantes[i] = inasistencias_estudiantes[i] + 1;

                }

            }

        }
           for (int i = 0;i < estudiantes.length;i++) {
        mensaje += String.format(
                    "Nombre del Estudiante: %s, ha asistido a clase %d veces y ha faltado %d veces.\n-----------------------\n",
                    estudiantes[i],
                    asistencias_estudiantes[i],
                    inasistencias_estudiantes[i]);
        }
              for (int i = 0;i < estudiantes.length;i++) {
            if (asistencias_estudiantes[i] == asistencia[i].length) {
            asistencia_completa = estudiantes[i] + "\n";
}
          }  
        mensaje += String.format("Estudiantes con asistencia completa\n%s", asistencia_completa);
        System.out.println(mensaje);
    
}
}

