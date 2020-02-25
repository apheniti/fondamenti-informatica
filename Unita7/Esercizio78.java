/*Scrivere un predicato static boolean simmetrica(int[][] M)
che restituisce true se la matrice è quadrata e simmetrica
(cioè M[i][j] = M[j][i] e length==length[0]), false altrimenti. */

public class Esercizio78{
	public static void main(String[] args) {
		int[][] A = {{2, 3, 4, 5}, {1, 2, 3, 4}};
		int[][] B = {{12, 23, 54, 25}, {0, 0, 0, 12}};
		int[][] C = {{1, 2}, {2, 1}};
		int[][] D = {{2, 5, 8}, {9, 5, 1}};
		System.out.println("A è simmetrica? "+simmetrica(A));
		System.out.println("B è simmetrica? "+simmetrica(B));
		System.out.println("C è simmetrica? "+simmetrica(C));
		System.out.println("D è simmetrica? "+simmetrica(D));
	}
	public static boolean simmetrica(int[][] M){
		if(M.length!=M[0].length) return false;
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M.length; j++){
				if(M[i][j] != M[j][i]) return false;
			}
		}
		return true;
	}
}