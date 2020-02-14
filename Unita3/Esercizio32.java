/*Scrivere una classe Java che implementi un programma esempio per la classe Libro.
La classe deve eseguire le seguenti operazioni:
- legge il titolo di un primo libro e gli autori, e lo memorizza in un oggetto corrispondente
- legge il titolo di un secondo libro e gli autori, e lo memorizza in un oggetto corrispondente
- visualizza il primo libro
- visualizza il secondo libro
- legge il costo del primo libro ed aggiorna l'oggetto corrispondente
- visualizza il primo libro con il prezzo. */

import javax.swing.JOptionPane;

public class Esercizio32{
	public static void main(String[] args){
		String titolo = JOptionPane.showInputDialog("Inserisci il titolo del primo libro");
		String autori = JOptionPane.showInputDialog("Inserisci gli autori del primo libro");
		Libro primo = new Libro(titolo, autori);
		titolo = JOptionPane.showInputDialog("Inserisci il titolo del secondo libro");
		autori = JOptionPane.showInputDialog("Inserisci gli autori del secondo libro");
		Libro secondo = new Libro(titolo, autori);
		primo.stampaLibro();
		System.out.println("********");
		secondo.stampaLibro();
		System.out.println("*******");
		int prezzo = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il prezzo del primo libro"));
		primo.setPrezzo(prezzo);
		primo.stampaLibroPrezzo();
		System.out.println("*******");
		Libro daTastiera = new Libro("", "");
		daTastiera.setTitolo();
		daTastiera.setAutori();
		daTastiera.stampaLibro();
	}
}