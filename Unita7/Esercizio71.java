/*Scrivere un metodo static double prodottoScalare(double[] A, double[] B)
che calcola il prodotto scalare degli array A e B, assumendo che essi abbiano
lo stesso numero di elementi (cioè A.length = B.length). 
Il prodotto scalare di A per B è ottenuto come la somma dei prodotti
A[i] * B[i] per ogni i. */

public class Esercizio71{
	public static void main(String[] args) {
		double[] A = {1.5, 2, 3, 4, 5.5, 6};
		double[] B = {7, 8.5, 9, 2, 1, 6};
		double[] C = {1, 1, 1, 1, 1};
		double[] D = {1, 1, 1, 1, 1};

		System.out.println("La somma di A e B è "+prodottoScalare(A,B));
		System.out.println("La somma di C e D è "+prodottoScalare(C, D));

	}
	public static double prodottoScalare(double[] A, double[] B){
		double result = 0;
		for(int i = 0; i<A.length; i++){
			result += A[i]*B[i];
		}
		return result;
	}
}