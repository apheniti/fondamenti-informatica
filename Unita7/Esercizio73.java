/*Scrivere un metodo static double[][] traspostaMatrice (double[][] A) che restituisce 
una nuova matrice ottenuta come trasposta della matrice A. 
La matrice trasposta di A si ottiene scambiando le righe con le colonne,
il che equivale a scambiare A[i][j] con A[j][i] per ogni coppia di indici validi i e j. */

public class Esercizio73{
	public static void main(String[] args) {
		double[][] A = {{2, 3, 4, 5}, {1, 2, 3, 4}};
		double[][] B = {{12, 23, 54, 25}, {0, 0, 0, 12}};
		System.out.println("PROVA: TRASPOSTA DI A: ");
		stampa(traspostaMatrice(A));
		System.out.println("PROVA: TRASPOSTA DI B: ");
		stampa(traspostaMatrice(B));
	}
	protected static void stampa(double[][] A){
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static double[][] traspostaMatrice(double[][] A){
		double[][] trasposta = new double[A[0].length][A.length];
		for(int i = 0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){
				trasposta[j][i] = A[i][j];

			}
		}
		return trasposta;
	}
}