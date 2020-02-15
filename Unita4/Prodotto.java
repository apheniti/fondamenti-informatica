/*Scrivere una classe Prodotto per manteere informazioni su una partita di prodotto stoccata in magazzino.
Ogni prodotto Prodotto è caratterizzato da nome del prodotto e numero di pezzi di quel prodotto stoccati in magazzino.
Si implementino i metodi caricaPezzi (per effettuare un'aggiunta di pezzi alla partita) 
e scaricaPezzi (per effettuare una rimozione di pezzi alla partita)
e il metodo toString che restituisce una stringa con le informazioni su una partita di un prodotto.*/

public class Prodotto{
	String nome;
	int numeroProdotto;

	public Prodotto(String n){
		this.nome=n;
		numeroProdotto=0;
	}

	public void caricaPezzi(int x){
		this.numeroProdotto += x;
	}
	public void scaricaPezzi(int x){
		this.numeroProdotto -= x;
	}

	@Override
	public String toString(){
		return this.nome+", "+this.numeroProdotto+" pz.";
	}
}