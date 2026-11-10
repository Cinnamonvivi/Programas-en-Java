/******************************************************************************

Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.

*************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a[], b[], c[];
	    a = new int [10];
	    b = new int [10];
	    c = new int [20]; //Contendra a los arreglos a y b 
	    
	    System.out.println("------Llenar arreglo 1 ------");
	    for(int i=0; i<a.length; i++){
	        System.out.print( (i+1)+" Digita un número: ");
	         a[i] = sc.nextInt();
	    }
	    
	    System.out.println("------Llenar arreglo 2 ------");
	    for(int i=0; i<a.length; i++){
	        System.out.print( (i+1)+" Digita un número: ");
	         b[i] = sc.nextInt();
	    }
	    
	    //Mezclar ambos arreglos
	    int j=0;
	    for (int i=0; i<10; i++){
	        c[j] = a[i];
	        j++;
	        c[j] = b[i];
	        j++;
	    }
	    System.out.print("\nEl tercer arreglo es: ");
	    for(int i=0; i<20; i++){
	        System.out.print(c[i] + " ");

	    }


	}
}
