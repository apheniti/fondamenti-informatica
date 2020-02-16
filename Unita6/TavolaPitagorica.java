/*Modificare il programma per la stampa della tavola pitagorica
In modo da ottenere un incolonnamento corretto.*/

public class TavolaPitagorica{
	static final int NMAX = 10;
	public static void main(String[] args){
		int riga, colonna;

		for(riga=1; riga <= NMAX; riga++){
			for(colonna=1; colonna <= NMAX; colonna++){
				int res = riga*colonna;
				if(res<10) System.out.print(" ");
				if(colonna==NMAX & riga<NMAX) System.out.print(" ");
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
}