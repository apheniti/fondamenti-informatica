/*Scrivere una classe Appartamento i cui oggetti mantengono le seguenti informazioni:
- un numero che indica la dimensione in metri quadri
- l'indirizzo
- una lista di max. 10 nomi di persone che vi alloggiano.
La classe deve contenere,
oltre al costruttore che imposta dimensione e indirizzo,
un metodo per modificare il nome di uno qualunque degi inquilini
ed un metodo toString per ottenere come stringe il contenuto in oggetto. */

public class Esercizio711{
	public static void main(String[] args) {
		Appartamento app1 = new Appartamento(100, "Via Gramsci");
		System.out.println(app1.toString());	
		app1.inserisciInquilino("Mario");
		System.out.println(app1.toString());
		app1.inserisciInquilino("Sofia");
		app1.inserisciInquilino("Augusto");
		app1.inserisciInquilino("Tommaso");
		app1.inserisciInquilino("Paolo");
		app1.inserisciInquilino("Anna");
		app1.inserisciInquilino("Loretta");
		app1.inserisciInquilino("Claudia");
		app1.inserisciInquilino("Concetta");
		app1.inserisciInquilino("Giuseppe");
		app1.inserisciInquilino("Carlo");
		System.out.println(app1.toString());
	}
	
}