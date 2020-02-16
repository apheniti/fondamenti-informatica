/*Scrivere un programma che legge da input una linea contenente una domanda a risposta SI/NO
senza simboli di punteggiatura, e stampa una risposta alla domanda in base alle seguenti regole:
- se la frase INIZIA e FINISCE con una vocale, la risposta è FORSE
- se l'ultima lettera della frase è A, I o U, la risposta è SI
- se l'ultima lettera della frase è E o O, la risposta è NO
- se l'ultima lettera della frase è un carattere diverso da A,E,I,O,U la risposta è NON SO. */

import javax.swing.JOptionPane;

public class Esercizio55{
	final static String forse = "FORSE", si = "SI", no = "NO", boh = "NON SO";
	public static void main(String[] args) {
		String domanda = JOptionPane.showInputDialog("Inserisci la domanda: ");
		System.out.println(calcolaRisposta(domanda));
	}

	protected static String calcolaRisposta(String d){
		char prima = d.charAt(0), ultima = d.charAt(d.length()-1);
		if((prima == 'a' || prima == 'e' || prima == 'i' || prima == 'o' || prima == 'u') &&
			(ultima == 'a' || ultima == 'e' || ultima == 'i' || ultima == 'o' || ultima == 'u'))
			return forse;
		else if(ultima == 'a' || ultima == 'i' || ultima == 'u')
			return si;
		else if(ultima == 'e' || ultima == 'o')
			return no;
		else return boh;
	}
}