/*Scrivere un programma che legge da input un numero n
e stampa il fattoriale di tutti i numeri compresi tra 1 a n.*/

import javax.swing.JOptionPane;

public class Esercizio610{
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero: "));
		if(numero < 1) System.out.println("Il numero è minore di uno! :( ");
		else ciclo(numero);
	}
	public static void ciclo(int n){
		System.out.print("I fattoriali dei numeri tra 1 e "+n+" sono: ");
		for(int i=1; i<=n; i++){
			System.out.print("Per "+i+": ");
			fattoriale(i);

		}
	}
	protected static void fattoriale(int fattoriale){
		int risultato = 1;
		for(int i = fattoriale; i>0; i--) risultato *= i;
		System.out.println(risultato);
	}
}