/*Scrivere un programma che legge da input le lunghezze dei tre lati di un triangolo
e ne determina il tipo usando istruzioni if-else con condizioni complesse. */
import javax.swing.JOptionPane;

public class Esercizio53{
	public static void main(String[] args) {
 		String testo = "Inserisci il valore del lato";
 		double a = Double.parseDouble(JOptionPane.showInputDialog(testo +" a"));
 		double b = Double.parseDouble(JOptionPane.showInputDialog(testo +" b"));
 		double c = Double.parseDouble(JOptionPane.showInputDialog(testo +" c"));
 		System.out.println(confronta(a,b,c));
 	}
 	protected static String confronta(double a, double b, double c){
 		if(a==b && b==c && c==a) return "equilatero";
 		else if(a==b || b==c || a==c) return "isoscele";
 		else return "scaleno";
 	}
}