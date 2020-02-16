/*Realizzare una classe Java per rappresentare date, sulle quali sono definite le seguenti funzionalità:
- creazione di una data, dati giorno, mese e anno;
- restituzione di giorno, mese e anno;
- veriica se una data è uguale ad un'altra data;
- verfica se una data precede un'altra data;
- verifica se l'anno di una data è bisestile;
- calcolo della data del giorno successivo;
*/

public class Esercizio56{
	public static void main(String[] args) {
		Data d1 = new Data(12, "Gennaio", 2020);
		Data d2 = new Data(12, "Gennaio", 2020);
		Data d3 = new Data(10, "Dicembre", 2019);
		Data d4 = new Data(28, "Febbraio", 2019);
		Data d5 = new Data(28, "Febbraio", 2020);
		Data d6 = new Data(29, "Febbraio", 2020);
		Data d7 = new Data(31, "Gennaio", 2020);
		Data d8 = new Data(31, "Dicembre", 999);
		System.out.println("D1: "+d1.toString());
		System.out.println("D2: "+d2.toString());
		System.out.println("D3: "+d3.toString());
		System.out.println("D1 è uguale a D2? "+d1.equals(d2));
		System.out.println("D1 è uguale a D3? "+d1.equals(d3));
		System.out.println("D1 precede D2? "+d1.precede(d2));
		System.out.println("D2 precede D1? "+d2.precede(d1));
		System.out.println("D1 precede D3? "+d1.precede(d3));
		System.out.println("D3 precede D1? "+d3.precede(d1));
		System.out.println("D2 precede D3? "+d2.precede(d3));
		System.out.println("D3 precede D2? "+d3.precede(d2));
		System.out.println("Il " +d1.getAnno()+" è bisestile? " +d1.bisestile());
		System.out.println("Il " +d2.getAnno()+" è bisestile? " +d2.bisestile());
		System.out.println("Il " +d3.getAnno()+" è bisestile? " +d3.bisestile());
		System.out.println("Il giorno successivo al " +d1.toString()+" è il " +d1.giornoDopo());
		System.out.println("Il giorno successivo al " +d2.toString()+" è il " +d2.giornoDopo());
		System.out.println("Il giorno successivo al " +d3.toString()+" è il " +d3.giornoDopo());
		System.out.println("Il giorno successivo al " +d4.toString()+" è il " +d4.giornoDopo());
		System.out.println("Il giorno successivo al " +d5.toString()+" è il " +d5.giornoDopo());
		System.out.println("Il giorno successivo al " +d6.toString()+" è il " +d6.giornoDopo());
		System.out.println("Il giorno successivo al " +d7.toString()+" è il " +d7.giornoDopo());
		System.out.println("Il giorno successivo al " +d8.toString()+" è il " +d8.giornoDopo());
	}
}