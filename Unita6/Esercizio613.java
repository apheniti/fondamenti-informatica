/*Scrviere un programma che legge da input un intero n 
e stampa i primi n numeri primi (1 non è un numero primo)*/
import javax.swing.JOptionPane;

public class Esercizio613{
	public static void main(String[] args) {
		int numeri = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero: "));
		stampaPrimi(numeri);
	}
	public static void stampaPrimi(int numeri){
		int counter = 0, i = 2;
		while(counter<numeri){
			if(isPrimo(i)){
				System.out.print(i+" ");
				counter++;
			}
			i++;
		}
	}
	public static boolean isPrimo(int n){
		if(n==1 || n==2) return true;
		int i = 2;
		while(i < n){
			if(n%i==0) return false;
				i++;
		}
		return true;
	}

}