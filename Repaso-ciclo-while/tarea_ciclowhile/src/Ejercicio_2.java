
import java.util.Scanner;

/*
Se necesita generar una solución que permita ingresa los datos de varios autos importados, 
el número de autos a ingresar se debe solicitar al usuario de manera previa. Por cada automóvil, 
se tiene que ingresar: marca, origen y costo. 
Información para los cálculos:
- Se genera un impuesto en función del país de origen, en función del costo del automóvil:
	- Si es Argentina el impuesto es del 20%
	- Si es Colombia el impuesto es del 25%
	- Si es Chile el impuesto es del 30%
	- Cualquier otro país, el impuesto es de 40%
- El precio de venta es igual a la suma del costo del automóvil más el impuesto
- Se debe imprimir el total de autos importados.
- Se debe imprimir  el total de impuestos generados.
- Se debe imprimit el total de los precios de venta de los autos.
- Se debe generar e imprimir el total de autos de los países de origen:
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //DEclaración de variables a utilizarse
        String reporte_final;
        int limite, contador = 0, cont2 = 0, cont_pa_arge = 0, cont_pa_chi = 0, cont_pa_colom = 0, cont_pa_otros = 0;
        int num_au = 0;
        String marca = "", origen = "";
        double costo = 0, pre_venta = 0, impu = 0, total = 0, total_im = 0;

        reporte_final = String.format("%s\t\t\t%s\t\t\t\t%s\t\t\t%s\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio venta");
        System.out.println("Porfavor ingrese el numero de autos: ");
        limite = entrada.nextInt();
        while (contador < limite) {
            System.out.println("Porfavor ingrese la marca de su auto:");
            marca = entrada.next();
            System.out.println("Porfavor ingrese el origen del auto:");
            origen = entrada.next();
            System.out.println("Porfavor ingrese el costo del auto: ");
            costo = entrada.nextDouble();

            String p1 = "Argentina";
            String p2 = "Chile";
            String p3 = "Colombia";

            if (origen.equals(p1)) {
                impu = costo * 0.20;
                cont_pa_arge++;
            } else {
                if (origen.equals(p2)) {
                    impu = costo * 0.30;
                    cont_pa_chi++;
                } else {
                    if (origen.equals(p3)) {
                        impu = costo * 0.25;
                        cont_pa_colom++;
                    } else {
                        impu = costo * 0.40;
                        cont_pa_otros++;
                    }
                }
            }
            //Operaciones 
            pre_venta = impu + costo;
            total_im = total_im + impu; 
            total = total + pre_venta;
            reporte_final = String.format("\n%s%s\t\t\t%s\t\t\t\t%.2f\t\t\t%.2f\t\t%.2f\n", reporte_final, marca, origen, costo, impu, pre_venta);

            contador = contador + 1;
        }
        System.out.println("-----------------------Reporte de autos importados------------------------");
        System.out.printf("%s", reporte_final);
        System.out.printf("Total autos: %d", limite);
        System.out.printf("\t\t\tTo.imps\t%.2f",total_im);
        System.out.printf("\t\t\t\t\tTo. PV\t\t%.2f\n\n",total);
        System.out.printf("Argentina: %d\n",cont_pa_arge);
        System.out.printf("Chile: %d\n",cont_pa_chi);
        System.out.printf("Colombia: %d\n",cont_pa_colom);
        System.out.printf("Resto de Paises: %d\n",cont_pa_otros); 
    }

}
