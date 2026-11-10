/******************************************************************************
Leer los datos correspondientes a dos tablas de 12 elementos numericos
y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3
de A, otros 3 de B,etc.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int A[] = new int[12];
        int B[] = new int[12];
        int C[] = new int[24];

        // Llenar arreglo A
        System.out.println("-----Arreglo A-----");
        for(int i = 0; i < A.length; i++) {
            System.out.print((i+1) + " Digita el número: ");
            A[i] = read.nextInt();
        }

        // Llenar arreglo B
        System.out.println("-----Arreglo B-----");
        for(int i = 0; i < B.length; i++) {
            System.out.print((i+1) + " Digita el número: ");
            B[i] = read.nextInt();
        }

        // Arreglo C: mezcla de A y B
        int j = 0;

        for(int i = 0; i < 12; i += 3) {

            for(int k = 0; k < 3; k++) {
                C[j] = A[i+k];
                j++;
            }

            for(int k = 0; k < 3; k++) {
                C[j] = B[i+k];
                j++;
            }
        }

        // Mostrar arreglo C
        System.out.println("-----Arreglo C-----");

        for(int m = 0; m < C.length; m++) {
            System.out.print(C[m] + " ");
        }
    }
}
