/*Scrivere un metodo pubblico statico che prende come parmetro un intero positivo n,
e stampa i primi n numeri pari.*/

public class Esercizio62{
	public static void main(String[] args) {
		int a = 2, b = 34, c = 64;
		System.out.println("------INIZIO PROVE------");
		System.out.print("I primi "+a+ " numeri pari: ");
		numeriPari(a);
		System.out.print("I primi "+b+ " numeri pari: ");
		numeriPari(b);
		System.out.print("I primi "+c+ " numeri pari: ");
		numeriPari(c);
	}
	public static void numeriPari(int a){
		int i = 1, count = 0;
		while(count<a){
			if(i%2 == 0){
				System.out.print(i+" ");
				count++;
			}
			i++;
			
		}
		System.out.println();
	}
}