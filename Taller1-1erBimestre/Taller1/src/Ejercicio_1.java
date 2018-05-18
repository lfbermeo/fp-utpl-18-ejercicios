
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //DEclaración de variables
        String gasto_final, hijo = "Hijo";
        int sueldo_semanal, cant_hijos;
        double total_pasajes = 0, pasajes = 0, total_bar = 0, gasto_bar = 0, saldo_final, salidas, total_salidas = 0;
        gasto_final = String.format("%s\t\t%s\t\t%s\t\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
        //Datos por teclado
        System.out.println("Cuanto dinero gana semanalmente: ");
        sueldo_semanal = entrada.nextInt();
        System.out.println("Cuantos hijos tiene:");
        cant_hijos = entrada.nextInt();

        //Usaremos este ciclo para que le usurio pueda ingresar el numero de hijos que  posee ya sean 7 o menos
        for (int cont = 1; cont <= cant_hijos; cont++) {
            gasto_final = String.format("%s%s %d", gasto_final, hijo, cont);
            System.out.println("Cuanto es el monto que gasta en sus pasajes: ");
            pasajes = entrada.nextDouble();
            System.out.println("Cuanto es el monto que gasta en bares: ");
            gasto_bar = entrada.nextDouble();
            System.out.println("Cuanto es el monto que gasta en salidas: ");
            salidas = entrada.nextDouble();

            //Operaciones para los totales
            total_pasajes = total_pasajes + pasajes;
            total_bar = total_bar + gasto_bar;
            total_salidas = total_salidas + salidas;

            gasto_final = String.format("\n%s\t\t%.2f\t\t%.2f\t\t%.2f\n", gasto_final, pasajes, gasto_bar, salidas);

        }
        //impresión del reporte
        saldo_final = total_pasajes + total_bar + total_salidas;
        System.out.println("-----------------------Gastos familia------------------------");
        System.out.printf("%s", gasto_final);
        System.out.print("Totales\t\t");
        System.out.printf("E.Pasajes: %.2f", total_pasajes);
        System.out.printf("\t\tE.Bar: \t%.2f", total_bar);
        System.out.printf("\t\tE.Salidas: %.2f\n", total_salidas);
        System.out.println();
        //Comparación para saber si el usario le sobra o le falta dinero para sus gastos
        if (saldo_final >= sueldo_semanal) {
            System.out.println("El padre de familia le sobra dinero");
        } else {

            System.out.println("El padre de familia le falta dinero");

        }
    }

}
