/*Scrivere un programma che legga da input un intero n e stampa tutti i numeri primi compresi tra 1 e n.*/

import javax.swing.JOptionPane;

public class Esercizio612{
	public static void main(String[] args) {
		int numeri = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un intero: "));
		stampaPrimi(numeri);
	}
	public static void stampaPrimi(int n){
		int i = 1;
		while(i<=n){
			if(isPrimo(i)) System.out.print(i+" ");
			i++;
		}
	}
	public static boolean isPrimo(int n){
		if(n==1 || n==2) return true;
		int i = 2;
		while(i < n){
			if(n%i==0) return false;
				i++;
		}
		return true;
	}
}