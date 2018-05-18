
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Declaración de variables para usar en el programa
        String final_cadena, nombre_padre, hijo = "Hijo";
        int cant_padres, cant_hijos;
        double sueldo_semanal, pasajes, gasto_bar, salidas, total_pasajes, total_bar, total_salida, cantidad_total;
        //Se pedirá al usuario que ingrese la cantidad, además presentaremos la cadena de encabezado
        final_cadena = String.format("%s\n\n", "----------------------Reporte Gastos---------------------");
        System.out.printf("%s\n", "Cuantos padres desea registrar: ");
        cant_padres = entrada.nextInt();

        entrada.nextLine();
        //Con este ciclo repetitivo iremos almacenando los datos sobre los padres de familia que pedirá el usuario
        for (int cont_1 = 1; cont_1 <= cant_padres; cont_1++) {
            total_pasajes = 0;
            total_bar = 0;
            total_salida = 0;

            System.out.printf("%s\n", "DATOS DEL PADRE");
            System.out.printf("%s %d", "Padre", cont_1);
            //Datos qeu se pedirán al usuario
            System.out.printf("\n%s", "Nombre del padre de familia:");
            nombre_padre = entrada.nextLine();
            System.out.printf("\n%s", "Sueldo semanal: ");
            sueldo_semanal = entrada.nextDouble();
            System.out.printf("\n%s", "Cantidad de Hijos: ");
            cant_hijos = entrada.nextInt();
            //Con está cadena se imprimirá lo que está debajo del emcabezado, y parte de los datos
            final_cadena = String.format("\n%s%s%s\n%s%.2f\n%s%d\n\n", final_cadena, "Nombre del Padre de Familiaa:",
                    nombre_padre, "Sueldo Semanal: ", sueldo_semanal, "Numero de Hijos:", cant_hijos);
            final_cadena = String.format("\n%s%s\n%s\t\t%s\t\t%s\t\t%s\n", final_cadena, "Reporte de Gastos ", "Persona", "Pasajes", "Bar", "Salida");
            //Limpiamos el método Scanner
            entrada.nextLine();
            //Con este ciclo repetitivo, vamos ingresando la cantidad de hijos que el usuario ingreso
            for (int cont_2 = 1; cont_2 <= cant_hijos; cont_2++) {
                System.out.printf("%s%d\n", hijo, cont_2);
                final_cadena = String.format("%s%s%d", final_cadena, hijo, cont_2);
                //Pedir datos por teclado
                System.out.printf("\n%s", "Cuanto es el monto que gasta en sus pasajes: ");
                pasajes = entrada.nextDouble();
                System.out.printf("\n%s", "Cuanto es el monto que gasta en bar:");
                gasto_bar = entrada.nextDouble();
                System.out.printf("\n%s", "Cuanto es el monto que gasta en sus salidas: ");
                salidas = entrada.nextDouble();
                //Operaciones a realizarse
                total_pasajes = total_pasajes + pasajes;
                total_bar = total_bar + gasto_bar;
                total_salida = total_salida + salidas;
                //Impresión de la cadena
                final_cadena = String.format("%s\t\t%.2f\t\t%.2f\t\t%.2f\n", final_cadena, pasajes, gasto_bar, salidas);
                //Limpiamos el método Scanner
                entrada.nextLine();
            }
            //impresion de la cadena total
            final_cadena = String.format("%s\n%-16s%-16.2f%-16.2f%.2f\n", final_cadena,"Totales: ", total_pasajes, total_bar, total_salida);

            cantidad_total = total_pasajes + total_bar + total_salida;
            //Con este ciclo if comparamos el sueldo para indentificar si le falta o le alcanza
            if (cantidad_total <= sueldo_semanal) {
                final_cadena = String.format("%s\n%s%s%s\n\n", final_cadena, "El padre de Familia ", 
                        nombre_padre, " le falta dinero");

            } else {
                    final_cadena = String.format("%s\n%s%s%s\n\n", final_cadena, "El padre de Familia ",
                            nombre_padre, " le alcanza el dinero");
                
            }

        }
        //Impresión final
        System.out.println(final_cadena);
    }
}
