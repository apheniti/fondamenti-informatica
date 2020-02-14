/*Scrivere un programma di esempio, che usa le due classi TestoMessaggio e Messaggio.
Il programma deve:
- contenere un metodo statico per la lettura di un numero telefonico da input
- inizializzare una variabile di classe String che corrisponde al numero telefonico del mittente
- leggere il testo di un messaggio ed il codice, e memorizzarli in un oggetto di classe TestoMessaggio
- leggere il numero di telefono del destinatario
- creare un oggetto di classe Messaggio
- visualizzare l'oggetto di classe Messaggio.*/

import javax.swing.JOptionPane;

public class Esercizio35{
	public static void main(String[] args) {
		String mittente = "0123456789";
		TestoMessaggio tm = new TestoMessaggio();
		String destinatario = inputNumero();
		Messaggio mex = new Messaggio(tm, mittente, destinatario);
		mex.stampa();
	}
	public static String inputNumero(){
		String numero = JOptionPane.showInputDialog("Inserisci il numero di telefono: ");
		return numero;
	}
}