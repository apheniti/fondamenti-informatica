/*Scrivere una classe Appartamento i cui oggetti mantengono le seguenti informazioni:
- un numero che indica la dimensione in metri quadri
- l'indirizzo
- una lista di max. 10 nomi di persone che vi alloggiano.
La classe deve contenere,
oltre al costruttore che imposta dimensione e indirizzo,
un metodo per modificare il nome di uno qualunque degi inquilini
ed un metodo toString per ottenere come stringe il contenuto in oggetto. */

public class Appartamento{
	double dimensione;
	String indirizzo;
	String[] persone = new String[10];
	public Appartamento(double d, String i){
		this.dimensione=d;
		this.indirizzo=i;
		for(int j = 0; j<this.persone.length; j++){
			this.persone[j] = "";
		}
	}
	public double getDimensione(){ return this.dimensione; }
	public String getIndirizzo(){ return this.indirizzo; }
	public void setDimensione(double dim){ this.dimensione=dim; }
	public void setIndirizzo(String ind){ this.indirizzo=ind; }
	public String toString(){ 
		String stringa = "";
		for(int j = 0; j<this.persone.length; j++){
			stringa = stringa+persone[j]+"; ";
		}
		return "Indirizzo: "+getIndirizzo()+"; Dimensione: "+getDimensione()+"; Persone: "+stringa;
	}
	public void modificaInquilino(String vecchio, String nuovo){
		for(int j = 0; j<this.persone.length; j++){
			if(this.persone[j].equals(vecchio)) this.persone[j] = nuovo;
		}
	}
	public void inserisciInquilino(String nuovo){
		for(int j = 0; j<this.persone.length; j++){
			if(this.persone[j].equals("")){ 
				this.persone[j] = nuovo;
				break;
			}
		}
	}
}