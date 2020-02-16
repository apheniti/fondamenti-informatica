/*Scrivere un programma che legga un intero n
ed una sequenza di interi di lunghezza n, 
e stampa la somma dei postivi
e la somma dei negativi della sequenza.*/

import javax.swing.JOptionPane;

public class Esercizio64{
	public static void main(String[] args) {
		int lunghezza = Integer.parseInt(JOptionPane.showInputDialog("Quanti numeri vuoi inserire?"));
		int counter = 0, sommaPos = 0, sommaNeg = 0;
		int[] memoria = new int[lunghezza];
		while(counter<lunghezza){
			int temp = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero " +(counter+1)));
			memoria[counter] = temp;
			if(temp>0) sommaPos+=temp;
			else sommaNeg+=temp;
			counter++;
		}
		System.out.println("Hai inserito: ");
		for(int i = 0; i<memoria.length; i++){
			System.out.print(memoria[i] + " ");
		}
		System.out.println();
		System.out.println("La somma dei numeri positivi è "+sommaPos);
		System.out.println("La somma dei numeri negativi è "+sommaNeg);
	}
}