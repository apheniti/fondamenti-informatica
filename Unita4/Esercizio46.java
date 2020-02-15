/*Scrivere una classe Prodotto per manteere informazioni su una partita di prodotto stoccata in magazzino.
Ogni prodotto Prodotto è caratterizzato da nome del prodotto e numero di pezzi di quel prodotto stoccati in magazzino.
Si implementino i metodi caricaPezzi (per effettuare un'aggiunta di pezzi alla partita) 
e scaricaPezzi (per effettuare una rimozione di pezzi alla partita)
e il metodo toString che restituisce una stringa con le informazioni su una partita di un prodotto.*/

public class Esercizio46{
	public static void main(String[] args) {
		Prodotto lampadina = new Prodotto("Lampadina 60 Watt");
		System.out.println("Prima delle operazioni... " +lampadina);
		lampadina.caricaPezzi(1000);
		lampadina.scaricaPezzi(100);
		System.out.println("Dopo le operazioni... " +lampadina);
	}
}