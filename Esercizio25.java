/*Risolvere l'esercizio 2.4 usando la classe StringBuffer.*/

import java.util.Scanner;

public class Esercizio25{
	public static void main(String[] args){

		StringBuffer originale = new StringBuffer();
		StringBuffer invertita = new StringBuffer();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String:");
		originale.append(input.nextLine());
		System.out.println("The String you entered is: " +originale);
		invertita.append(originale.charAt(originale.length()-1));
		invertita.append(originale.subSequence(1, originale.length()-1));
		invertita.append(originale.charAt(0));
		System.out.println("The new String is: " +invertita);
	}

}
