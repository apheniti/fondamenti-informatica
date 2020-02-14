/*classe di appoggio per l'esercizio 3.3 */

import javax.swing.JOptionPane;

public class TestoMessaggio{
	String codice;
	String messaggio;
	public TestoMessaggio(){
		this.codice = JOptionPane.showInputDialog("Inserisci il codice del messaggio: ");
		this.messaggio = JOptionPane.showInputDialog("Inserisci il messaggio: ");
	}
	public String getCodice(){
		return this.codice;
	}
	public String getMessaggio(){
		return this.messaggio;
	}
	public void stampa(){
		System.out.println("Codice: " +this.codice);
		System.out.println("Messaggio: " +this.messaggio);
	}
	/*Eserczio 3.6: modifica le classi Libro e TestoMessaggio deinendo dei metodi statici per la lettura dell'input da tastiera. 
	Verificare il comportamento dei metodi modificando i programmi esempio corrispondenti.*/
	public void setCodice(){
		this.codice = codiceDaTastiera();
	}
	public void setMessaggio(){
		this.messaggio = messaggioDaTastiera();
	}
	public static String codiceDaTastiera(){
		return JOptionPane.showInputDialog("Inserisci il codice: ");
	}
	public static String messaggioDaTastiera(){
		return JOptionPane.showInputDialog("Inserisci il messaggio: ");
	}
}