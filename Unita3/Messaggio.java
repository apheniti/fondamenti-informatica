/*Un messaggio deve contenere il numero da chiamare, il mittente ed il testo del messaggio.
Definire una classe Messaggio con:
- un metodo che crea un'istanza a partire da un oggetto di classe TestoMessaggio e due stringhe che rappresentano il numero di telefono del mittente e destinatario
- un metodo che crea un'istanza a partire da un oggetto di classe TestoMessaggio ed una stringa che rappresenta il numero di telefono del mittente
- un metodo che crea un'istanza a partire da un oggetto di classe TestoMessaggio
- un metodo che riceve come parametro il numero di telefono del destinatario ed aggiorna il destinatario del messaggio
- un metodo per la stampa del messaggio. */

public class Messaggio{
	String destinatario;
	String mittente;
	String testo;
	public Messaggio(TestoMessaggio tm, String m, String d){
		this.destinatario=d;
		this.mittente=m;
		this.testo = tm.getMessaggio();
	}
	public Messaggio(TestoMessaggio tm, String m){
		this.destinatario = "";
		this.mittente = m;
		this.testo = tm.getMessaggio();
	}
	public Messaggio(TestoMessaggio tm){
		this.destinatario="";
		this.mittente="";
		this.testo = tm.getMessaggio();
	}
	public void setDestinatario(String d){
		this.destinatario=d;
	}
	public String getDestinatario(){
		return this.destinatario;
	}
	public void stampaMessaggio(){
		System.out.println(this.testo);
	}
	public void stampa(){
		System.out.println("mittente: " +this.mittente);
		System.out.println("destinatario: " +this.destinatario);
		System.out.println("testo: " +this.testo);
	}
	

}