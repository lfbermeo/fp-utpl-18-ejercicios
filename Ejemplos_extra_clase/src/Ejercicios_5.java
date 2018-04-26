/*
- La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente expresión matemática:
F = (9/5)*C+32
La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:
F = (F-32)5/9
Generar la solución que permita obtener por parte de usuario el tipo de conversión que desea
realizar y posterior presentación del resultado requerido.
	(usar la instrucción que se crea conveniente)
 */

import java.util.Scanner;

public class Ejercicios_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar variables
        int conver;
        int valor_a_convertir;
        double resultado=0;
        double resultado_1;
        //Pedir datos al usuario
        System.out.println("Porfavor ingrese el tipo de conversión si es de Celsius a Fahrenheit coloque 1 o si es de Fahrenheit a Celsius 2: ");
        conver = entrada.nextInt();
        System.out.println("Porfavor ingrese el valor a convertir: ");
        valor_a_convertir = entrada.nextInt();
        //operaciones a realizarse
        if (conver == 1) {
            resultado_1 = 1.8 * valor_a_convertir;
            resultado = resultado_1 + 32;
        } else {
            if (conver == 2) {
                resultado_1 = valor_a_convertir - 32;
                resultado = resultado_1 * 0.55;
                //impresión

            }
        }
        System.out.printf("El resultado de la conversión es el siguiente: %.2f\n ", resultado);
    }

}
