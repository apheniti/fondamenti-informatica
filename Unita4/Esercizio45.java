/*Scrivere un predicato public static boolean pari(long x) 
che restituisce true se il numero x è pari, false altrimenti.*/

public class Esercizio45{
	public static void main(String[] args) {
		System.out.println("Prove perché sono pigra: ");
		long a = 2, b = 3, c = 1234567, d = 9876543, e = 1239043126; 
		System.out.println(a+" è pari? " +pari(a));
		System.out.println(b+" è pari? " +pari(b));
		System.out.println(c+" è pari? " +pari(c));
		System.out.println(d+" è pari? " +pari(d));
		System.out.println(e+" è pari? " +pari(e));
	}

	public static boolean pari(long x){
		boolean pari;
		if(x % 2 == 0) pari = true;
		else pari = false;
		return pari;
	}
}
