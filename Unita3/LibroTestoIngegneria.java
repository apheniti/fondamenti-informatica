/*Estendere la classe Libro definendo altre classi: 
- per i libri di testo in cui viene specificata anche la materia cui si riferisce il testo
- per libri di testo della Facoltà di ngegneria in cui è specificato anche il corso di laurea in cui il testo è adottato
- per i romanzi per i quali viene specificato il genere. */

public class LibroTestoIngegneria extends LibroTesto{
	String corsoDiLaurea;
	public LibroTestoIngegneria(String t, String a, String m, String c){
		super(t,a,m);
		this.corsoDiLaurea=c;
	}
	public String getCorsoDiLaurea(){
		return this.corsoDiLaurea;
	}
	public void setCorsoDiLaurea(String c){
		this.corsoDiLaurea=c;
	}
	@Override
	public void stampaLibro(){
		super.stampaLibro();
		System.out.println("Corso di Laurea: " +this.corsoDiLaurea);
	}
	@Override
	public void stampaLibroPrezzo(){ // stampaLibroPrezzo che stampa il titolo, gli autori ed il prezzo di un libro;
		super.stampaLibroPrezzo();
		System.out.println("Corso di Laurea: " +this.corsoDiLaurea);
	}
}