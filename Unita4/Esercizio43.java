/*SCrivere un programma che legga da tastiera due numeri interi e stampi su schermo:
- la loro media aritmetica (diviso 2)
- la loro media geometrica (la radice quadrata del loro prodotto)
- il massimo e il minimo dei due */

import javax.swing.JOptionPane;

public class Esercizio43{
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un intero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un altro intero: "));
		double mediaAritmetica = ((double)a+(double)b)/2;
		double mediaGeometrica = Math.sqrt(Math.pow(a, 2)*Math.pow(b, 2));
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		System.out.println("I due interi sono: " +a+ " e " +b);
		System.out.println("La loro media aritmetica è " +mediaAritmetica);
		System.out.println("La loro media geometrica è " +mediaGeometrica);
		System.out.println("Il minimo è " +min);
		System.out.println("Il massimo è " +max);


	}
}