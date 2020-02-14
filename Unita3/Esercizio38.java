/*Definire un programma di esempio per le classi che realizzi le seguenti operazioni:
- legge il titolo di un primo libro e gli autori, la materia e il corso che lo adotta e lo memorizza in un oggetto corrispondente;
- visualizza il primo libro;
- legge il titolo di un secondo libro e gli autori, e lo memorizza in un oggetto corrispondente;
- legge il genere del seonco libro e crea un terzo oggetto di classe romanzo, memorizzandolo in una variabile;
- visualizza i due oggetti creati per memorizzare il secondo libro;
- legge il costo del primo libro ed aggiorna l'oggetto corrispondente;
- visualizza il primo libro con il prezzo. */
import javax.swing.JOptionPane;

public class Esercizio38{
	public static void main(String[] args) {
		String titolo1 = JOptionPane.showInputDialog("Inserisci il titolo del primo libro: ");
		String autori1 = JOptionPane.showInputDialog("Inserisci gli autori del primo libro: ");
		String materia1 = JOptionPane.showInputDialog("Inserisci la materia del primo libro: ");
		String cdl1 = JOptionPane.showInputDialog("Inserisci il corso di laurea del primo libro: ");
		LibroTestoIngegneria librotestoing = new LibroTestoIngegneria(titolo1, autori1, materia1, cdl1);
		librotestoing.stampaLibro();
		System.out.println("******");
		
		String titolo2 = JOptionPane.showInputDialog("Inserisci il titolo del secondo libro: ");
		String autori2 = JOptionPane.showInputDialog("Inserisci gli autori del secondo libro: ");
		Libro librosemplice = new Libro(titolo2, autori2);

		String genere2 = JOptionPane.showInputDialog("Inserisci il genere del secondo libro: ");
		Romanzo romanzo = new Romanzo(librosemplice.getTitolo(), librosemplice.getAutori(), genere2);

		librosemplice.stampaLibro();
		System.out.println("******");
		romanzo.stampaLibro();
		System.out.println("******");

		int prezzo1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il prezzo del primo libro: "));
		librotestoing.setPrezzo(prezzo1);
		librotestoing.stampaLibroPrezzo();
		
	}
}
