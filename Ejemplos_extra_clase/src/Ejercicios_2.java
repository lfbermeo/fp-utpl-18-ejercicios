/*
Una empresa dedicada a vender teléfonos celulares, en base a las siguientes consideraciones:
	- Si el cliente es de tipo 1 se le descuenta 10%
	- Si el cliente es de tipo 2 se le descuenta 20%
	- Si el cliente es de tipo 3 se le descuenta 30%
La solución debe imprimir el siguiente reporte:
	Nombre: Luis Alvarez
	Tipo de Cliente: 1
	Cantidad de Celulares: 20
	Precio por cada celular: 300
	Subtotal a pagar: cantidad de celulares * precio c/celular
	Descuento: (se debe obtener el descuento)
	Valor final a pagar: Subtotal - Descuento.
Importante, en base al reporte requerido usted debe analizar el conjunto de datos de entrada necesarios.
	(usar la instrucción que se crea conveniente)
 */
import java.util.Scanner;

public class Ejercicios_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        String nombre;
        int tipo;
        double descuento;
        double cantidad;
        double pre_unitario;
        double sub_pagar;
        double va_final;
        //Introduccion de valores
        System.out.println("Introduzca su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Introduzca que tipo de cliente es: ");
        tipo = entrada.nextInt();
        System.out.println("Introduzca la cantidad de celulares: ");
        cantidad = entrada.nextDouble();
        System.out.println("Introduzca el precio unitario: ");
        pre_unitario = entrada.nextDouble();
        //Operaciones necesarias para realizar el programa.
        if (tipo == 1) {
            sub_pagar = (cantidad * pre_unitario);
            descuento = (sub_pagar * 0.1);
            va_final = (sub_pagar - descuento);
        } else {
            if (tipo == 2) {
                sub_pagar = (cantidad * pre_unitario);
                descuento = (sub_pagar * 0.2);
                va_final = (sub_pagar - descuento);
            } else {
                if (tipo == 3) {
                }
                sub_pagar = (cantidad * pre_unitario);
                descuento = (sub_pagar * 0.3);
                va_final = (sub_pagar - descuento);
            }
        }
        //impresión del reporte
        System.out.println("---------------------------------------");
        System.out.println("REPORTE CLIENTE");
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Tipo de cliente: %d\n", tipo);
        System.out.printf("Cantidad de celulares: %.2f\n", cantidad);
        System.out.printf("Precio por cada celular: %.2f\n", pre_unitario);
        System.out.printf("Subtotal a pagar: %.2f\n", sub_pagar);
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.printf("Valor final: %.2f\n", va_final);
    }
}
