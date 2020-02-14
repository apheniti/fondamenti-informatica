/* Questa è la classe libro dell'unità 3, per gli esercizi 3.1, 3.2. */
import javax.swing.JOptionPane;

public class Libro{
	String titolo;
	String autori;
	int prezzo;
	public Libro(String t, String a){ // un costruttore che crea un oggetto libro, con titolo ed autori come parametri;
		this.titolo = t;
		this.autori = a;
	}
	public String getTitolo(){ // getTitolo che restituisce il titolo di un libro
		return this.titolo;
	}
	public String getAutori(){ // getAutori che restituisce gli autori di un libro
		return this.autori;
	}
	public int getPrezzo(){ // getPrezzo che restituisce il prezzo di un libro
		return this.prezzo;
	}
	public void setPrezzo(int nuovoPrezzo){ // setPrezzo che modific il prezzo di un libro
		this.prezzo = nuovoPrezzo;
	}
	public void stampaLibro(){ // stampaLibro che stampa l titolo e gli autori di un libro su due linee;
		System.out.println("Titolo: " +this.titolo);
		System.out.println("Autori: " +this.autori);
	}
	public void stampaLibroPrezzo(){ // stampaLibroPrezzo che stampa il titolo, gli autori ed il prezzo di un libro;
		System.out.println("Titolo: " +this.titolo);
		System.out.println("Autori: " +this.autori);
		System.out.println("Prezzo: " +this.prezzo);
	}
	public void finestraLibro(){ // finestraLibro che stampa il titolo e gli autori di un libro su due linee su una finestra di output;
		String libro = this.titolo+'\n'+this.autori;
		JOptionPane.showMessageDialog(null, libro);
		System.exit(0);
	}

/*Eserczio 3.6: modifica le classi Libro e TestoMessaggio deinendo dei metodi statici per la lettura dell'input da tastiera. 
Verificare il comportamento dei metodi modificando i programmi esempio corrispondenti.*/
	public void setTitolo(){
		String newTitolo = titoloDaTastiera();
		this.titolo = newTitolo;
	}
	public void setAutori(){
		String newAutori = autoriDaTastiera();
		this.autori = newAutori;
	}
	public static String titoloDaTastiera(){
		String newTitolo = JOptionPane.showInputDialog("Inserisci il titolo del libro: ");
		return newTitolo;
	}
	public static String autoriDaTastiera(){
		String newAutori = JOptionPane.showInputDialog("Inserisci gli autori: ");
		return newAutori;
	}
	

}