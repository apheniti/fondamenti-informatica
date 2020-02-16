/*Il valore di PIGRECO può essere calcolato con la serie PIGRECO = 4-4/3+4/5-4/7+4/9+... 
Scrivere un metodo pubblico statico che prende come parametro un intero n 
e calcola e restituisce il valore di PIGRECO
approssimato ai primi n termini della serie.*/

import javax.swing.JOptionPane;

public class Esercizio65{
	public static void main(String[] args) {
		int cifre = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero di cifre a cui approssimare: "));
		int counter=0;
		double i = 1, valore = 0;
		while(counter<cifre){
			if(counter%2==0) valore -= 4/i;
			else valore += 4/i;
			System.out.println(i+", "+valore);
			counter++;
			i+=2;
			
		}
		System.out.println("Il valore di PIGRECO per "+cifre+" cifre è: "+valore);
	}
}