# Taller 10 (Laboratorio):
## Construcción de programas usando arreglos bidimensionales

* Lenguaje de programación : Java
* IDE de programación : Netbeans
* Usar el proyecto de Netbeans creado llamado **Taller10**

### Problema1

Una institución registra la asistencia de 4 estudiantes durante 5 días (lunes a viernes).
```
boolean[][] asistencia = {
    {true, true, false, true, true},
    {true, false, false, true, false},
    {true, true, true, true, true},
    {false, true, true, false, true}
};

String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};

```

Actividades:

* Determine cuántos días asistió cada estudiante, usar un arreglo unidimensional para almacenar dicha información
* Presentar información por cada estudiante
* Indique si el estudiante cumple asistencia completa (5 días).

### Problema2

Se registran las edades de personas en 3 familias (4 integrantes cada una).

```
int[][] edades = {
    {5, 12, 35, 40},
    {8, 15, 33, 38},
    {6, 10, 30, 36}
};
```

Actividades:

Cuente cuántos menores de edad existen en total.
A través de un arreglo adecuado, almacene y presente cuántos adultos hay por familia.


### Problema3

Sensores de seguridad instalados en 4 zonas durante 6 revisiones.
```
boolean[][] sensores = {
    {true, true, true, true, true, true},
    {true, false, true, false, true, false},
    {false, false, false, false, false, false},
    {true, true, false, true, true, false}
};
```

Actividades:

* Determine cuántas zonas funcionan sin fallos.

* Indique qué zonas presentan al menos un fallo (false).

### Problema4

Elabore una solución que permita ingresar valores numéricos para dos matrices llamadas A y B, cada una de 3 filas y 2 columnas.

La solución debe realizar las siguientes acciones:

* Leer y almacenar los valores de la matriz A.
* Leer y almacenar los valores de la matriz B.
* Mostrar en pantalla todos los elementos de la matriz A, organizados por filas y columnas.
* Mostrar en pantalla todos los elementos de la matriz B, organizados por filas y columnas.
* Comparar ambas matrices elemento por elemento, considerando únicamente los valores que se encuentran en la misma fila y columna.

Se debe indicar que la matriz A es mayor que la matriz B únicamente si se cumplen ambas condiciones:

* En todas las posiciones, el valor almacenado en A es mayor o igual que el valor correspondiente almacenado en B.
* Existe al menos una posición en la que el valor de A es estrictamente mayor que el valor correspondiente de B.

Si alguna de estas condiciones no se cumple, el algoritmo debe mostrar el mensaje: “La matriz A no es mayor que la matriz B”. Caso contrario, debe mostrar: “La matriz A es mayor que la matriz B”.


### Problema5
Dado el siguiente arreglo

```
String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
 {"Carrie Burton", "Lauren Rice"},
{"Emma Escobar", "Lori Flores"},
{"Steven West", "Toni Martin"}
 };
```
Imprima en pantalla a través de una variable acumuladora  solo los estudiantes que tienen como primera letra S,P,T

### Problema6

Diseñe un algoritmo que permita leer un número entero o real y, posteriormente, ingresar los valores numéricos de una matriz de 5 filas y 6 columnas.

Una vez ingresados los datos, el algoritmo debe:

* Multiplicar cada elemento de la matriz original por el número leído.

* Almacenar el resultado de cada multiplicación en la misma posición de una nueva matriz, llamada matriz resultante.

* Mostrar en pantalla la matriz original.

* Mostrar en pantalla la matriz resultante, producto de la multiplicación por el número ingresado.

Cada elemento de la matriz resultante debe corresponder al producto entre el número ingresado y el valor ubicado en la misma fila y columna de la matriz original.

### Problema7

Elabore una solución que permita ingresar valores numéricos para una matriz X de 3 filas y 3 columnas.

Una vez ingresados los datos, se debe realizar las siguientes acciones:

Para cada valor de la matriz X, calcular el resultado de la expresión:

```
(x + 1) * (x + 1)
```

y guardar estos resultados en una nueva matriz llamada A.

Para los mismos valores de la matriz X, calcular el resultado de la expresión:

```
x * x + 2 * x + 1
```

y guardar estos resultados en otra matriz llamada B.

Comparar las matrices A y B, posición por posición (misma fila y misma columna).

Verificar si en todas las posiciones los valores de la matriz A son iguales a los valores de la matriz B.

Mostrar un mensaje indicando: que la identidad algebraica se cumple, si todos los valores coinciden, o que la identidad algebraica no se cumple, si existe al menos una posición donde los valores sean diferentes.

### Problema8

Dado el siguiente código

```
public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        double[][] dato2 = {{10, 1, 2},{10, 9, 1}};
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
        */

    }
```
Genere una solución
