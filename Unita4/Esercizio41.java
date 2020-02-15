/*Scrivere una funzione: public static double convertiLireEuro(int x) che, 
dato un importo in Lire x, restituisce il corrispondente importo in euro. */

import javax.swing.JOptionPane; 

public class Esercizio41{
	final static double TASSO = 1927.36;
	public static void main(String[] args) {
		int lire = Integer.parseInt(JOptionPane.showInputDialog("Inserisci le lire da convertire: "));
		double euro = convertiLireEuro(lire);
		System.out.println("Il risultato è: " +euro +".");
		double arrotonda = arrotonda(euro);
		System.out.println("...che arrotondato fa: " +arrotonda+" euro.");
	}
	public static double convertiLireEuro(int x){
		double euro = x/TASSO;
		return euro;
	}
	protected static double arrotonda(double e){
		double temp = Math.pow(10, 2);
		return Math.round(e*temp)/temp;
	}
}