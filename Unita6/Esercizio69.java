/*Scrivere un metodo statico pubblico che,
preso come parametro un intero compreso tra 1 e 9,
stampa una piramide di numeri di altezza h.
esempio: per h=4 deve stampare
   1  
  121 
 12321  
1234321
*/

public class Esercizio69{
	public static void main(String[] args) {
		System.out.println("INIZIO PROVE:");
		System.out.println("h = 1");
		piramide(1);
		System.out.println("h = 2");
		piramide(2);
		System.out.println("h = 3");
		piramide(3);
		System.out.println("h = 4");
		piramide(4);
	}
	public static void piramide(int altezza){
		for(int riga = 1; riga<=altezza; riga++){
			for(int i = 1; i<=altezza-riga; i++){
				System.out.print(" ");
			}
			for(int i=1; i<=riga; i++){
				System.out.print(i);
			}
			for(int i = 1; i<riga*2-1; i++){
				if(riga-i > 0) System.out.print((riga-i));	
			}
			System.out.println();
		}
	}
}