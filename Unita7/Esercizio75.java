/*Scrivere un metodo static int numeroDuplicati(int[] A) che
restituisce il numero di duplicati nell'array A, ovvero
il numero di valori distinti che compaiono più volte
come elementi dell'array.*/

public class Esercizio75{
	public static void main(String[] args) {
		int[] A = {1, 1, 1, 1, 2};
		int[] B = {1, 2, 3, 4, 5, 5};
		int[] C = {};
		System.out.println("Numero duplicati di A: "+numeroDuplicati(A));
		System.out.println("Numero duplicati di B: "+numeroDuplicati(B));
		System.out.println("Numero duplicati di C: "+numeroDuplicati(C));
	}
	public static int numeroDuplicati(int[] A){
		int count = 0;
		if(A.length<=1) return count;
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<A.length; j++){
				if(A[i] == A[j] && i != j){
					count++;
					break;
				}
			}
		}
		return count;
	}
}