/*Definire una classe Libro per gestire le informazioni associate ad un libro. 
Le informazioni di interesse per un libro sono il titolo, gli autori ed il prezzo. 
I metodi di interesse sono:
- un costruttore che crea un oggetto libro, con titolo ed autori come parametri;
- stampaLibro che stampa l titolo e gli autori di un libro su due linee;
- stampaLibroPrezzo che stampa il titolo, gli autori ed il prezzo di un libro;
- finestraLibro che stampa il titolo e gli autori di un libro su due linee su una finestra di output;
- getTitolo che restituisce il titolo di un libro
- getAutori che restituisce gli autori di un libro
- getPrezzo che restituisce il prezzo di un libro
- setPrezzo che modific il prezzo di un libro con il valore intero passato come argomento. */

public class Esercizio31{
	public static void main(String[] x){
		System.out.println("Questa è una classe di prova per Libro.");
		Libro libro = new Libro("Lezioni di Fondamenti di Informatica", "Calvanese, De Giacomo, Demetrescu, Iocchi, Nardi");
		System.out.println("Prova getTitolo: " +libro.getTitolo());
		System.out.println("Prova getAutori: " +libro.getAutori());
		System.out.println("Prova getPrezzo: " +libro.getPrezzo());
		libro.setPrezzo(16);
		System.out.println("Prova setPrezzo: " +libro.getPrezzo());
		System.out.println("Prova stampaLibro:");
		libro.stampaLibro();
		System.out.println("Prova stampaLibroPrezzo:");
		libro.stampaLibroPrezzo();
		System.out.println("Prova finestraLibro:");
		libro.finestraLibro();
	
	}
}