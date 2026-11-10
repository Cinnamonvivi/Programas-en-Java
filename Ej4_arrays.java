/******************************************************************************

Leer 10 números enteros, guardarlos en un arreglo. Debemos 
mostrarlos en el siguiente orden: El primero, el último, el segundo, el
penúltimo, el tercero, etc..

*************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] numeros = new int [10];
	        for(int i = 0; i<numeros.length; i++){
		        System.out.print((i+1) + " Digita un número: ");
		        numeros[i] = sc.nextInt();
	        }
	        for (int i = 0; i < 5; i++) {
                System.out.println("numero "+(i+1)+" :"+numeros[i]);
                System.out.println("numero "+(10-i)+" :"+numeros[9-i]);
            }
	    

	}
}
