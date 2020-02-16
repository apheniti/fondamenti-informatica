/*Scrivre un metodo pubblico statico che. presi come parametri una stringa ed un intero d,
restituisca la stringa opportunamete decodificata.
La decodifica è ottenuta sostituendo ciascun carattere con il carattere che ha
codice pari al codice del carattere da sostituire decrementato di d.*/

public class Esercizio66{
	public static void main(String[] args) {
		String prova = "Nel mezzo del cammin...";
		int d = 10;
		String result = decodifica(prova, d);
		System.out.println(result);
	}

	public static String decodifica(String stringa, int d){
		String result = "";
		for(int i = 0; i<stringa.length(); i++){
			int carattere = (int)(stringa.charAt(i));
			int newCarattere = carattere-d;
			System.out.println((char)newCarattere);
			result += (char)newCarattere;
		}
		return result;
	}
}