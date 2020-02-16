/*Realizzare una classe Java per rappresentare messaggi.
Ogni messaggio è caratterizzato da:
- mittente
- destinatario
- testo del messaggio.
Tutte e tre le informazioni sono rappresentate da stringhe. 
Oltre alle funzionalità di restituzione e modifica di mittente, destinatario e testo, 
i messaggi supportano lo scambio di mittente e destinatario e tre forme di compressione:
- eliminazione degli spazi bianchi all'inizio e alla fine del testo, e
 sostituzione di ciascuna sequenza di spazi bianchi usata per separare parole nel testo 
 con un unico spazio bianco;
- eliminazione di tutte le vocali;
- entrambi. */

public class Esercizio615{
	public static void main(String[] args) {
		Messaggio m1 = new Messaggio("", "", "   ciao   sono io    ");
		Messaggio m2 = new Messaggio("", "", "abcdefghijklmnopqrstuvwxyz");
		Messaggio m3 = new Messaggio("", "", "   a   b   c   d   e   f   g   h i j   ");
		System.out.println("PRIMA: ");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		m1.noSpaziBianchi();
		m2.noVocali();
		m3.compressione();
		System.out.println('\n'+"DOPO: ");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());

	}
}