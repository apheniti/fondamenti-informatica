/*Una matrice M si dice diagonale se tutti gli elementi M[i][j]
 con i diverso da j valgono 0.
 Scrivere un predicato che restituisce true se M è diagonale,
 false altrimenti. */

public class Esercizio710{
	public static void main(String[] args) {
		int[][] A = {{2, 3, 4, 5}, {1, 2, 3, 4}};
		int[][] B = {{12, 23, 54, 25}, {0, 0, 0, 12}};
		int[][] C = {{1, 2}, {2, 1}};
		int[][] D = {{2, 5, 8}, {9, 5, 1}};
		int[][] E = {{0, 0, 0}, {0, 5, 0}, {0, 0, 9}};
		System.out.println("A è diagonale ? "+diagonale(A));
		System.out.println("B è diagonale ? "+diagonale(B));
		System.out.println("C è diagonale ? "+diagonale(C));
		System.out.println("D è diagonale ? "+diagonale(D));
		System.out.println("E è diagonale ? "+diagonale(E));	
	}
	public static boolean diagonale(int[][] M){
		if(M.length <= 1) return true;
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M[0].length; j++){
				if(M[i][j] != 0 & i!=j) return false;
			}
		}
		return true;
	}
}