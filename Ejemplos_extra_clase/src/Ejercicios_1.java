/*
Solución que permita leer el número de día (un valor entre 1 y 7) e imprima Lunes si es 1, Martes si es 2, ... , 
Domingo si es 7.

	(usar instrucción switch)
 */
import java.util.Scanner;

public class Ejercicios_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Inicialización de variable
        int dia;
        //Pedir datos por teclado
        System.out.println("Introduza el número que desea saber el día de las semana:  ");
        dia = entrada.nextInt();
        //Operaciones que servirán para concluir el programa
        switch (dia) {
            case 1:
                System.out.printf("Día %s\n", "LUNES");
                break;
            case 2:
                System.out.printf("Día %s\n", "MARTES");
                break;
            case 3:
                System.out.printf("Día %s\n", "MIÉRCOLES");
                break;
            case 4:
                System.out.printf("Día %s\n", "JUEVES");
                break;
            case 5:
                System.out.printf("Día %s\n", "VIERNES");
                break;
            case 6:
                System.out.printf("Día %s\n", "SÁBADO");
                break;
            case 7:
                System.out.printf("Día %s\n", "DOMINGO");
                break;
            default:
                System.out.println("NO EXISTE");
        }

    }
}
