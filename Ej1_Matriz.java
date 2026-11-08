/******************************************************************************

Matriz de dimensiones aleatorias entre 2 y 5, pedir al usuario un valor y llenar
el renglon 0 con ese valor, luego llenar el renglon 1 con el valor ingresado +1
y asi sucesivamente. Mostrar la matriz

*******************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random r = new Random();

        int ren = r.nextInt(4) + 2; // (max - min + 1)) + min;
        int col = r.nextInt(4) + 2;

        int[][] matriz = new int[ren][col];

        System.out.print("Ingresa un valor: ");
        int n = read.nextInt();

        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = n + i;
            }
        }

        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        read.close();
    }
}