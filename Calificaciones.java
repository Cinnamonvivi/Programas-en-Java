
 /******************************************************************************
 Calificaciones de alumnos
 *******************************************************************************/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double arra[] = new double[10], p = 0, s = 0;
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < arra.length; i++) {

            System.out.print("Escribe la calificación del alumno número " + (i + 1) + ": ");
            arra[i] = read.nextDouble();

            if (arra[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
            s += arra[i];
        }

        System.out.println("★ Las calificaciones ingresadas fueron: ");

        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }

        p = s / arra.length;

        double max = arra[0];
        double min = arra[0];

        for (int i = 1; i < arra.length; i++) {

            if (arra[i] > max) {
                max = arra[i];
            } else if (arra[i] < min) {
                min = arra[i];
            }
        }

        System.out.println("˚‧︵‿₊ RESULTADOS ₊‿︵‧˚");

        System.out.println("★ El promedio total es de: " + p);
        System.out.println("★ La calificación más alta fue: " + max);
        System.out.println("★ La calificación más baja fue: " + min);
        System.out.println("★ Aprobados: " + aprobados);
        System.out.println("★ Reprobados: " + reprobados);

    }
}
