/*Scrivere un programma che legge da input le tre lunghezze de tre lati di un triangolo
 e ne determina il tipo utilizzando il seguente algoritmo:
 - confrontare i lati a coppia contando quante coppie sono uguali
 - if (le coppie uguali sono 0) è scaleno
 - else if (le coppie uguali sono 1) è isoscele
 - else è equilatero */

import javax.swing.JOptionPane;

 public class Esercizio52{
 	public static void main(String[] args) {
 		String testo = "Inserisci il valore del lato";
 		double a = Double.parseDouble(JOptionPane.showInputDialog(testo +" a"));
 		double b = Double.parseDouble(JOptionPane.showInputDialog(testo +" b"));
 		double c = Double.parseDouble(JOptionPane.showInputDialog(testo +" c"));
 		System.out.println(confronta(a,b,c));
 	}
 	public static String confronta(double a, double b, double c){
 		int count=0;
 		String risultato = "";
 		if(a==b) count++;
 		if(a==c) count++;
 		if(b==c) count++;
 		switch(count){
 			case 0: risultato = risultato +"scaleno"; break;
 			case 1: risultato = risultato+"isoscele"; break;
 			default: risultato = risultato+"equilatero"; break;
 		}
 		return risultato;
 	}
 }