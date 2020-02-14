/*Estendere la classe Libro definendo altre classi: 
- per i libri di testo in cui viene specificata anche la materia cui si riferisce il testo
- per libri di testo della Facoltà di ngegneria in cui è specificato anche il corso di laurea in cui il testo è adottato
- per i romanzi per i quali viene specificato il genere. */

public class LibroTesto extends Libro{
	String materia;
	public LibroTesto(String t, String a, String m){
		super(t,a);
		this.materia = m;
	}
	public String getMateria(){
		return this.materia;
	}
	public void setMateria(String m){
		this.materia = m;
	}

	@Override
	public void stampaLibro(){
		super.stampaLibro();
		System.out.println("Materia: " +this.materia);
	}
	@Override
	public void stampaLibroPrezzo(){ // stampaLibroPrezzo che stampa il titolo, gli autori ed il prezzo di un libro;
		super.stampaLibroPrezzo();
		System.out.println("Materia: " +this.materia);
	}
	
}