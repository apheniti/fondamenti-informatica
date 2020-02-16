/*Scrivere un programma che legga da input un intero e stampa tutti i suoi fattori primi. 
Ad esempio, se l'intero immesso è 220, il programma deve stampare 2, 2, 5, 11. */

import javax.swing.JOptionPane;

public class Esercizio614{
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero: "));
		System.out.print("I fattori di "+numero+" sono: ");
		stampaFattori(numero);
	}
	public static void stampaFattori(int numero){
		int i = 2;
		while(i<=numero){
			if(isPrimo(numero)){
				System.out.println(numero);
				break;
			}
			if(numero%i == 0 & isPrimo(i)){
				System.out.print(i+" ");
				numero = numero/i;
			}
			else i++;
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
