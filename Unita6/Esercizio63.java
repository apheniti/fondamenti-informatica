/*Scrivere un metodo pubblico statico che prende come parametro un intero n,
e calcola e restituisce il fattoriale di n.
Prevedere la stampa di un opportuno messaggio nel caso in cui n sia negativo.*/

public class Esercizio63{
	public static void main(String[] args) {
		int a = 2, b = 3, c = 6, d = 12;
		System.out.println("------INIZIO PROVE------");
		System.out.print("Il fattoriale di "+a+ " è: ");
		System.out.println(fattoriale(a));
		System.out.print("Il fattoriale di "+b+ " è:  ");
		System.out.println(fattoriale(b));
		System.out.print("Il fattoriale di "+c+ " è: ");
		System.out.println(fattoriale(c));
		System.out.print("Il fattoriale di "+d+ " è: ");
		System.out.println(fattoriale(d));
	}
	public static String fattoriale(int a){
		String result;
		int temp = a, risultato = 1;
		if(a < 0) result = "ERRORE: il numero è negativo.";
		else
			while(temp>0){
				risultato = risultato*temp;
				temp--;
			}
			result = ""+risultato;
		return result;

	}
}