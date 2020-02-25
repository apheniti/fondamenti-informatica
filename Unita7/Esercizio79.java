/*Una matrice M si definisce triangolare inferire
se tutti gli elementi M[i][j] con i<j valgono zero.
Scrivere un predicato che restituisce true se M è triangolare inferiore
false altrimenti. */

public class Esercizio79{
	public static void main(String[] args) {
		int[][] A = {{2, 3, 4, 5}, {1, 2, 3, 4}};
		int[][] B = {{12, 23, 54, 25}, {0, 0, 0, 12}};
		int[][] C = {{1, 2}, {2, 1}};
		int[][] D = {{2, 5, 8}, {9, 5, 1}};
		int[][] E = {{0, 0, 0}, {1, 0, 0}};
		System.out.println("A è triangolare inferiore? "+triangolare(A));
		System.out.println("B è triangolare inferiore? "+triangolare(B));
		System.out.println("C è triangolare inferiore? "+triangolare(C));
		System.out.println("D è triangolare inferiore? "+triangolare(D));
		System.out.println("E è triangolare inferiore? "+triangolare(E));
		
	}
	public static boolean triangolare(int[][] M){
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M[0].length; j++){
				if(M[i][j] > 0 && i<j) return false;
			}
		}
		return true;
	}
}