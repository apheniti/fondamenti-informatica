/*Scrivere un programma che legge 10 interi qualunque e ne stampa il minimo. */

import javax.swing.JOptionPane;

public class Esercizio61{
	public static void main(String[] args) {
		int count = 0, mintemp=Integer.MAX_VALUE;
		int[] arrayInseriti = new int[10];
		while(count<10){
			int inseritoDaUtente = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero "+(count+1)));
			if(inseritoDaUtente<mintemp) mintemp = inseritoDaUtente;
			arrayInseriti[count] = inseritoDaUtente;
			count++;
		}
		String inseriti = "";
		for(int i = 0; i<arrayInseriti.length-1; i++){
			inseriti = inseriti+arrayInseriti[i]+", ";
		}
		inseriti = inseriti+arrayInseriti[arrayInseriti.length-1]+".";
		System.out.println("Hai inserito: "+inseriti);
		System.out.println("Il minimo tra i numeri inseriti è: " +mintemp);

	}
}