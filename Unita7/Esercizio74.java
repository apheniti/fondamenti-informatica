/*Scrivere un predicato static boolean arrayUguali(int[] A, int[] B)
che restituisce true se gli array A e B sono uguali,
cioè hanno tutti gli elementi corrispondenti uguali, false altrimenti.*/

public class Esercizio74{
	public static void main(String[] args) {
		int[] A = {3, 4, 5, 6};
		int[] B = {1, 2, 3, 4,};
		int[] C = {3, 4, 5, 7};
		int[] D = {};
		int[] E = A;
		System.out.println("A e B sono uguali? " +arrayUguali(A, B));
		System.out.println("B e C sono uguali? " +arrayUguali(B, C));
		System.out.println("A e C sono uguali? " +arrayUguali(A, C));
		System.out.println("C e D sono uguali? " +arrayUguali(C, D));
		System.out.println("A e D sono uguali? " +arrayUguali(A, D));
		System.out.println("B e D sono uguali? " +arrayUguali(B, D));
		System.out.println("A e E sono uguali? " +arrayUguali(A, E));

	}
	public static boolean arrayUguali(int[] A, int[] B){
		if(A.length!=B.length) return false;
		else
			for(int i = 0; i<A.length; i++){
				if(A[i]!=B[i]) return false;
			}
		return true;
	}
}