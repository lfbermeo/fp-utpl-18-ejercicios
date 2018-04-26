/*
- En una empresa dedicada a la venta de balones, si se compra uno se hace un descuento de 50%,
si se compra 2 descuento de 70%, se compra 3 o más se descuenta 80%. Generar la solución que permita 
leer el número de balones a comprar, el precio de cada balón y el valor final a cancelar.
 */

import java.util.Scanner;

public class Ejercicios_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declarar las variables
        int n_balones;
        double pre_balon;
        double sub_pagar;
        double descuento;
        double va_final;
        //Pedir datos de entrada
        System.out.println("Porfavor ingrese el número de balones que compro:");
        n_balones = entrada.nextInt();
        System.out.println("Porfavor ingrese el precio por cada balón: ");
        pre_balon = entrada.nextDouble();
        //Operaciones a utilizarse
        if (n_balones == 1) {
            sub_pagar = (n_balones * pre_balon);
            descuento = (sub_pagar * 0.50);
            va_final = (sub_pagar - descuento);
        } else {
            if (n_balones == 2) {
                sub_pagar = (n_balones * pre_balon);
                descuento = (sub_pagar * 0.70);
                va_final = (sub_pagar - descuento);
            } else {
                if (n_balones >= 3) {    
                }
                    sub_pagar = (n_balones * pre_balon);
                    descuento = (sub_pagar * 0.80);
                    va_final = (sub_pagar - descuento);
                }
            }
        //Imprimir 
        System.out.printf("Valor final a cancelar: %.2f\n",va_final);
    }
}
