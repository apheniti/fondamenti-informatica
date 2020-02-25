/*Scrivere un metodo static int[] rimuoviDuplicati(int[] A)
che restituisce un nuovo array ottenuto dall'array A
rimuovendo tutti i duplicati. */

import java.io.*;
import java.util.*;

public class Esercizio76{
	public static void main(String[] args) {
		int[] A = {1, 1, 1, 1, 2};
		int[] B = {1, 2, 3, 4, 5, 5};
		int[] C = {};
		System.out.println("----PROVA: A----");
		stampa(rimuoviDuplicati(A));
		System.out.println("----PROVA: B----");
		stampa(rimuoviDuplicati(B));
		System.out.println("----PROVA: C----");
		stampa(rimuoviDuplicati(C));
	}
	public static int[] rimuoviDuplicati(int[] A){
		Set<Integer> noDuplicates = new HashSet<Integer>();
		for(int i = 0; i<A.length; i++){
			noDuplicates.add(A[i]);
		}
		int[] noDup = new int[noDuplicates.size()];
		int index = 0;
		for(int e: noDuplicates){
			noDup[index] = e;
			index++;
		}
		return noDup;
	}
	protected static void stampa(int[] A){
		System.out.print("{ ");
		for(int i = 0; i<A.length; i++){
			System.out.print(A[i]+" ");
		
		}
		System.out.println("}");
	}

}