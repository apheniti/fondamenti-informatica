/*Un numero intero positivo si dice primo se è divisile solo per 1 e per se stesso.
Scrivere un metodo satico pubblico che. preso in ingresso un intero positivo,
restituisce un booleano che indica se l'intero è primo o meno.*/

public class Esercizio611{
	public static void main(String[] args) {
		System.out.println("Queste sono prove!");
		System.out.println("1 è primo? "+isPrimo(1));
		System.out.println("2 è primo? "+isPrimo(2));
		System.out.println("3 è primo? "+isPrimo(3));
		System.out.println("4 è primo? "+isPrimo(4));
		System.out.println("10 è primo? "+isPrimo(10));
	}

	public static boolean isPrimo(int n){
		if(n==1 || n==2) return true;
		int i = 2;
		while(i < n){
			if(n%i==0) return false;
				i++;
		}
		return true;
	}
}