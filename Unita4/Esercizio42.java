/*Scrivere un predicato public static boolean traboccoSomma(byte x, byte y) 
che restituisce true se x+y provoca overflow, false altrimenti. 
SUGGERIMENTO: assegnare dapprima x e y a due varabili short. 
Poi, effettuando la somma con quelle variabili, restituire una espressione boolean
che verifica se il risultato può entrare in un byte, cioè in [-129, 128] */

import javax.swing.JOptionPane; 

public class Esercizio42{
	final static int MIN = -129;
	final static int MAX = 128;
	public static void main(String[] args) {
		byte a = Byte.parseByte(JOptionPane.showInputDialog("Inserisci il byte a: "));
		byte b = Byte.parseByte(JOptionPane.showInputDialog("Inserisci il byte b: "));
		boolean trabocco = traboccoSomma(a, b);
		System.out.println("Overflow: " +trabocco);
	}
	public static boolean traboccoSomma(byte x, byte y){
		short sx = (short)x, sy = (short)y;
		boolean trabocco = false;
		if(sx+sy < MIN || sx+sy > MAX)
			trabocco = true;
		return trabocco;
	}
}