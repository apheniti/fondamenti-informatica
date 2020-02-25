/*Dire cosa calcola il seguente metodo: */

public class Esercizio77{
	public static void main(String[] args) {
		int[] A = {1, 1, 1, 1, 2};
		int[] B = {1, 2, 3, 4, 5, 5, 6, 7};
		int[] C = {};
		System.out.println("MISTERO! " +mistero(A));
		System.out.println("MISTERO! " +mistero(B));
		System.out.println("MISTERO! " +mistero(C));
	}
	public static int mistero(int[] A){
		int x = 0;
		for(int i = 0; i<A.length; i++){
			if(A[i] % 2 == 1) x++;
		}
		return x;
	}
}

/* Il numero di int dispari dell'array. */