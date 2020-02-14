/*Estendere la classe Libro definendo altre classi: 
- per i libri di testo in cui viene specificata anche la materia cui si riferisce il testo
- per libri di testo della Facoltà di ngegneria in cui è specificato anche il corso di laurea in cui il testo è adottato
- per i romanzi per i quali viene specificato il genere. */

public class Romanzo extends Libro{
	String genere;
	public Romanzo(String t, String a, String g){
		super(t, a);
		this.genere=g;
	}
	public void setGenere(String g){
		this.genere=g;
	}
	public String getGenere(){
		return this.genere;
	}
	@Override
	public void stampaLibro(){
		super.stampaLibro();
		System.out.println("Genere: " +this.genere);
	}
	@Override
	public void stampaLibroPrezzo(){ // stampaLibroPrezzo che stampa il titolo, gli autori ed il prezzo di un libro;
		super.stampaLibroPrezzo();
		System.out.println("Genere: " +this.genere);
	}
}