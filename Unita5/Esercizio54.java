/*Scrivere un programma che legge da input i coefficienti a,b,c 
e calcola gli zeri dell'equazione ax^2+bx+c=0.
A seconda del segno del discriminante b^2-4ac il programma deve stampare
- le due soluzioni reali distinte
- la soluzione reale doppia
- o le due soluzioni complesse coniugate.*/

import javax.swing.JOptionPane;

public class Esercizio54{
	public static void main(String[] args) {
		String testo = "Inserisci il coefficiente";
		int a = Integer.parseInt(JOptionPane.showInputDialog(testo+" a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(testo+" b"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(testo+" c"));
		double segno = discriminante(a,b,c);
		if(segno > 0){
			double res1 = (-b+Math.sqrt(segno))/(2*a);
			double res2 = (-b-Math.sqrt(segno))/(2*a);
			System.out.println("I risultati sono reali e distinti: ");
			System.out.println(res1);
			System.out.println(res2);
			}
		if(segno == 0){
			double res = -b/(2*a);
			System.out.println("I risultati sono reali e coincidono: ");
			System.out.println(res);
		}
		if(segno < 0){
			double discr = -segno;
			double sqr = Math.sqrt(discr);
			String res1 = -b+"+"+sqr+"i";
			String res2 = -b+"-"+sqr+"i";
			System.out.println("I risultati sono complessi e coniugati: ");
			System.out.println(res1);
			System.out.println(res2);
		}
	}	
	protected static double discriminante(int a, int b, int c){
		double risultato = Math.pow(b,2)-4*a*c;
		return risultato;
	}
		
}