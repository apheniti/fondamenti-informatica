/*Scrivere una funzione public static char ultimoCarattere(String s)
che restituisce l'ultimo carattere della stringa s passata come parametro.*/

public class Esercizio410{
	public static void main(String[] args) {
		String a = "Questa è una stringa";
		String b = "Una stringa questa potrebbe essere";
		String c = "Il futuro";
		String d = "Non so cosa mettere a questi test";
		System.out.println("L'ultimo carattere di ''"+a+ "'' è: " +ultimoCarattere(a));
		System.out.println("L'ultimo carattere di ''"+b+ "'' è: " +ultimoCarattere(b));
		System.out.println("L'ultimo carattere di ''"+c+ "'' è: " +ultimoCarattere(c));
		System.out.println("L'ultimo carattere di ''"+d+ "'' è: " +ultimoCarattere(d));
	}
	public static char ultimoCarattere(String s){
		return s.charAt(s.length()-1);
	}
}