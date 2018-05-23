package ciclo_for;

import java.util.Scanner;

public class Ciclo_for {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables 
        String final_cadena, nombre_estudiante, nombre_materia;
        int cant_estudiantes, edad, num_asig = 0, suma_edad = 0;
        double cali_bime1, cali_bime2, promedio, suma_notastotal = 0, promedio_notas = 0, promedio_edad = 0;

        final_cadena = String.format("%s\n\n", "----------------------Reporte de calificaciones---------------------");
        //Se pedir´al usuario que ingrese el número de estudiantes que desea
        System.out.printf("%s", "¿Cuantos estudiantes desea ingresar:?\n");
        cant_estudiantes = entrada.nextInt();

        entrada.nextLine();
        //Con este ciclo repetitivo vamos ir alamacenando los datos del estudiante y el numero va a ir repitiendo depediendo del usuario
        for (int cont_1 = 1; cont_1 <= cant_estudiantes; cont_1++) {
            //Datos al usuario
            System.out.printf("%s", "DATOS DEL ESTUDIANTE\n");
            System.out.printf("%s", "Nombre del estudiante:\n");
            nombre_estudiante = entrada.nextLine();
            System.out.printf("%s", "Edad del estudiante:\n");
            edad = entrada.nextInt();
            System.out.printf("%s", "Número de asignaturas:\n");
            num_asig = entrada.nextInt();
            //Se imprime la conquetenación de la materia y el encabezado del reporte
            final_cadena = String.format("%s%s %d: %s\n%s%d\n%s%d\n\n", final_cadena, "Nombre de Estudiante", cont_1, nombre_estudiante, "Edad: ", edad, "Número de Asignaturas: ", num_asig);
            final_cadena = String.format("\n%s%s\t\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\n", final_cadena, "Materia", "Bim-1", "Bim-2", "Promedio");
            entrada.nextLine();
            double promedio_1 = 0;
            
            //Con este ciclo repetitivo vamos ir alamacenando los datos sobre el numero de materias que el usurio desea ingresar
            for (int cont_2 = 1; cont_2 <= num_asig; cont_2++) {
                //Dataos para que llene el usuario
                System.out.printf("\n%s\n", "DATOS DE LA MATERIA\n");
                System.out.printf("%s%d", "Materia", cont_2);
                System.out.printf("\t%s", "Nombre de la materia:\n");
                nombre_materia = entrada.next();
                System.out.printf("\t%s", "Ingrese calificación del Bimestre 1: ");
                cali_bime1 = entrada.nextDouble();

                entrada.nextLine();
                //Con este ciclo,vamos a pedirle al usario que si ingresa una nota mayor a 20, le pedirá que reingrese ya que se admite notas menos que 20
                if (cali_bime1 > 20) {
                    System.out.printf("\n\t%s", "Reingrese calificacion Bimestre 1: ");
                    cali_bime1 = entrada.nextDouble();
                    entrada.nextLine();//Limpiador de Scanner
                }
                System.out.printf("\t%s", "Ingrese calificación del Bimestre 2: ");
                cali_bime2 = entrada.nextDouble();

                entrada.nextLine();

                if (cali_bime2 > 20) {
                    System.out.printf("\n\t%s", "Reingrese calificacion Bimestre 2: ");
                    cali_bime2 = entrada.nextDouble();
                    entrada.nextLine();//Limpiador de Scanner

                }
                //Operaciones a utilizarse para sacar el promedio de cada reporte
                promedio = (cali_bime1 + cali_bime2) / 2;
                promedio_1 = promedio_1 + promedio;

                final_cadena = String.format("%s%s\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f\n", final_cadena, nombre_materia, cali_bime1, cali_bime2, promedio);

            }
            suma_edad = suma_edad + edad;
            promedio_1 = promedio_1 / num_asig;

            final_cadena = String.format("%s\t\t\t\t\t\t\t\t\t\t\t\t\t%s%.2f\n", final_cadena, "Promedio", promedio_1);

            if (promedio_1 >= 19) {
                final_cadena = String.format("%s%s SOBRESALIENTE ES LA CALIFICACIÓN DE SU PROMEDIO\n", final_cadena, nombre_estudiante);
            } else {
                if (promedio_1 >= 16 && promedio_1 < 19) {
                    final_cadena = String.format("%s%s MUY BUENO ES LA CALIFICACIÓN DE SU PROMEDIO\n", final_cadena, nombre_estudiante);
                } else {
                    if (promedio_1 >= 13 && promedio_1 < 16) {
                        final_cadena = String.format("%s%s BUENO ES LA CALIFICACIÓN DE SU PROMEDIO\n", final_cadena, nombre_estudiante);
                    } else {
                        //Concatenacion Final de la variable 'cadena'.
                        final_cadena = String.format("%s%s REGULAR ES LA CALIFICACIÓN DE SU PROMEDIO\n", final_cadena, nombre_estudiante);
                    }
                }
            }

            
            suma_notastotal = suma_notastotal + promedio_1; 
            

        }
        //Calculo de promedio de edad y notas de los estudiantes ingresados por el usuario
        promedio_edad = suma_edad / cant_estudiantes;
        promedio_notas = suma_notastotal / cant_estudiantes;
        //Impresión de todas las cadenas utilizadas en el programa
        System.out.println(final_cadena);
        System.out.printf("El promedio de edad es: %.2f\n",promedio_edad);
        System.out.printf("El promedio de notas  es: %.2f\n",promedio_notas);
     }
}