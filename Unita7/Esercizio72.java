/*Scrivere un metodo static int[] intersezione(int[] A, int[] B) che restituisce un nuovo array contenente
l'intersezione degli array  e B, cioè tutti e soli i valori presenti sia in A che in B.
Si può assumere che A e B non contengono al loro interno duplicati. */

public class Esercizio72{
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6};
		int[] B = {2, 7, 3, 77, 9, 6};
		int[] C = {25, 2, 0, 1, 4, 3};
		int[] D = intersezione(A, B);
		int[] E = intersezione(C, A);
		stampa(D);
		stampa(E);
	}
	public static int[] intersezione(int[] A, int[] B){
		int count = 0, k=0;
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<B.length; j++){
				if(A[i]==B[j])
					count++;
			}
		}
		int[] result = new int[count];
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<B.length; j++){
				if(A[i]==B[j]){
					result[k]=A[i];
					k++;
				}
			}
		}
		return result;
	}
	protected static void stampa(int[] array){
		for(int i = 0; i<array.length; i++){
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
}