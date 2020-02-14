/*Si vuole realizzare un sistema per la composizione dei messaggi da inviare tramite telefonino.
Ad ogni mesggio corrisponde un codice. Ad esempio TA corrisponde a TI AMO, AMORE. 
Definire la classe TestoMessaggio per la gestione dei messaggi. La classe deve avere un metodo per creare
oggetti TestoMessaggio leggendo il codice e i messaggio completo da tastiera,
un metodo per restituire il codice, ed un metodo per restituire il testo del messaggio. */

public class Esercizio33{
	public static void main(String[] args) {
		TestoMessaggio tm = new TestoMessaggio();
		System.out.println("Il codice è: " +tm.getCodice());
		System.out.println("Il messaggio è: " +tm.getMessaggio());

		Messaggio mex = new Messaggio(tm, "0123456789");
		mex.stampaMessaggio();
		mex.setDestinatario("987654321");
		System.out.println(mex.getDestinatario());

		tm.setCodice();
		tm.setMessaggio();
		tm.stampa();

	}
}