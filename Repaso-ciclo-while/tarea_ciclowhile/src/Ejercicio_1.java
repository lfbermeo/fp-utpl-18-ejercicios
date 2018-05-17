/*
Elaborar un programa en lenguaje Java, que permita ingresar los valores de productos vendidos a un clinte, 
en un supermecado.
Los productos serán ingresados, hasta que el usuario lo decida.
Ejemplificar con los siguiente datos:
Información que necesita ingresar durante la ejecución del programa:
- Ingresar el nombre del cliente.
- Para cada artículo se debe ingresar:
	- Nombre del artículo.
	- Cantidad de artículos.
	- Precio unitario de cada artículo.
- Se debe generar el siguiente reporte
 */
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables a utilizarse
        String nombre;
        String nom_arti, factura_final;
        int cant_arti;
        double val = 0;
        double pre_uni;
        double pre_total, sub_total = 0, iva = 0, total;
        int cont_1 = 1, cont_2 = 1;
        boolean valor = true;
        factura_final = String.format("%s\t%s\t%s\t\t%s\n", "Articulo", "Cantidad", "Precio unitario", "Precio total");
        System.out.println("Ingrese el nombre del cliente:");
        nombre = entrada.nextLine();
        //Utilización del ciclo para impresión de la factura
        while (valor) {
            //Variables qeu se pedirán por teclado al usuario
            System.out.printf("Ingrese el nombre del articulo %s\n", cont_1);
            nom_arti = entrada.nextLine();
            System.out.printf("Ingrese la cantidad de articulos%d\n", cont_2);
            cant_arti = entrada.nextInt();
            System.out.println("Ingrese el precio unitario de su artículo");
            pre_uni = entrada.nextDouble();

            //Operaciones a realizarse 
            pre_total = cant_arti * pre_uni;
            val = val + pre_total;
            sub_total = val;
            iva = sub_total * 0.12;

            factura_final = String.format("\n%s%s\t\t%d\t\t%.2f\t\t\t%.2f\n", factura_final, nom_arti, cant_arti, pre_uni, pre_total);
            cont_1 = cont_1 + 1;
            cont_2 = cont_2 + 1;

            entrada.nextLine();
            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if (temporal.equals("si")) {
                valor = false;
            }
        }
        //Imprecion de la factura
        total = sub_total + iva;
        System.out.println("");
        System.out.println("-----------------------Factura------------------------");
        System.out.println("Supermercado Todo a menor precio");
        System.out.printf("Nonmbre del cliente: %s\n", nombre);
        System.out.printf("%s", factura_final);
        System.out.printf("\t\t\t\tSubtotal:\t\t%.2f\n", sub_total);
        System.out.printf("\t\t\t\tIva14:\t\t\t%.2f\n", iva);
        System.out.printf("\t\t\t\tTotal:\t\t\t%.2f\n", total);
    }
}
