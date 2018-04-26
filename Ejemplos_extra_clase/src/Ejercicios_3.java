/*
- Solución que permita calcular y presentar los valores de X y Y, 
teniendo como dato de entrada el valor de X y obtener el de Y en base a las siguientes restricciones:

Si X<0 entonces Y=3*X+10
Si X>0 entonces Y=X**2+6
Si X==0 entonces Y=1
 */

import java.util.Scanner;

public class Ejercicios_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables a utilizarce
        int x;
        double y = 0;
        //Datos por teclado
        System.out.println("Porfavor introduzca el valor de x: ");
        x = entrada.nextInt();
        //Opciones para realizar el programa
        if (x < 0) {
            y = (3 * x + 10);
        } else {
            if (x > 0) {
                y = (x * 2 + 6);
            } else {
                if (x == 0) {
                    y = (1);
                }
            }
        }
        System.out.printf("El valor de y: %f\n",y);
    }
}
