/*Realizzare una classe Java per rappresentare date, sulle quali sono definite le seguenti funzionalità:
- creazione di una data, dati giorno, mese e anno;
- restituzione di giorno, mese e anno;
- veriica se una data è uguale ad un'altra data;
- verfica se una data precede un'altra data;
- verifica se l'anno di una data è bisestile;
- calcolo della data del giorno successivo;
*/

public class Data{
	int giorno;
	int mese;
	int anno;
	final int GENNAIO = 1, FEBBRAIO = 2, MARZO = 3, APRILE = 4, MAGGIO = 5,
			GIUGNO = 6, LUGLIO = 7, AGOSTO = 8, SETTEMBRE = 9,
			OTTOBRE = 10, NOVEMBRE = 11, DICEMBRE = 12;
	public Data(int g, String m, int a){
		this.giorno=g;
		this.mese=meseToInt(m);
		this.anno=a;
	}
	public Data(){
		giorno = 0;
		mese = 0;
		anno = 0;
	}
	protected int meseToInt(String m){
		if(m.toUpperCase().equals("GENNAIO")) return GENNAIO;
		if(m.toUpperCase().equals("FEBBRAIO")) return FEBBRAIO;
		if(m.toUpperCase().equals("MARZO")) return MARZO;
		if(m.toUpperCase().equals("APRILE")) return APRILE;
		if(m.toUpperCase().equals("MAGGIO")) return MAGGIO;
		if(m.toUpperCase().equals("GIUGNO")) return GIUGNO;
		if(m.toUpperCase().equals("LUGLIO")) return LUGLIO;
		if(m.toUpperCase().equals("AGOSTO")) return AGOSTO;
		if(m.toUpperCase().equals("SETTEMBRE")) return SETTEMBRE;
		if(m.toUpperCase().equals("OTTOBRE")) return OTTOBRE;
		if(m.toUpperCase().equals("NOVEMBRE")) return NOVEMBRE;
		if(m.toUpperCase().equals("DICEMBRE")) return DICEMBRE;
		else return 0;
	}
	protected String intToMese(int m){
		switch(m){
			case 1: return "Gennaio";
			case 2: return "Febbraio";
			case 3: return "Marzo";
			case 4: return "Aprile";
			case 5: return "Maggio";
			case 6: return "Giugno";
			case 7: return "Luglio";
			case 8: return "Agosto";
			case 9: return "Settembre";
			case 10: return "Ottobre";
			case 11: return "Novembre";
			default: return "Dicembre";
		}
	}
	public int getGiorno(){
		return this.giorno;
	}
	public int getMese(){
		return this.mese;
	}
	public int getAnno(){
		return this.anno;
	}
	public void setGiorno(int x){
		this.giorno=x;
	}
	public void setMese(String m){
		this.mese=meseToInt(m);
	}
	public void setMese(int m){
		this.mese=m;
	}
	public void setAnno(int a){
		this.anno=a;
	}
	@Override
	public String toString(){
		return this.giorno+" "+intToMese(this.mese)+" "+this.anno;
	}
	public boolean equals(Data data){
		return this.giorno==data.getGiorno() && this.mese==data.getMese() && this.anno==data.getAnno();
	}
	public boolean precede(Data data){
		if(this.anno<data.getAnno()) return true;
		if(this.anno>data.getAnno()) return false;
		else
			if(this.mese<data.getMese()) return true;
			if(this.mese>data.getMese()) return false;
			else
				if(this.giorno<data.getGiorno()) return true;
				return false;
	}
	public boolean bisestile(){
		return this.anno%4 == 0;
	}
	public Data giornoDopo(){
		Data giornoDopo = new Data();
		if(this.giorno<28 || (this.giorno == 28 & this.mese==FEBBRAIO & bisestile())){
			giornoDopo.setGiorno(this.giorno+1);
			giornoDopo.setMese(this.mese);
			giornoDopo.setAnno(this.anno);
		}
		else if((this.giorno == 28 & this.mese==FEBBRAIO) || (this.giorno == 29 & this.mese == FEBBRAIO) || (this.giorno == 30 & (this.mese == APRILE || this.mese == GIUGNO || this.mese == SETTEMBRE || this.mese == NOVEMBRE))
			|| (this.giorno == 31 & (this.mese == GENNAIO || this.mese == MARZO || this.mese == MAGGIO || this.mese == LUGLIO || this.mese == AGOSTO || this.mese == OTTOBRE))){
			giornoDopo.setGiorno(1);
			giornoDopo.setMese(this.mese+1);
			giornoDopo.setAnno(this.anno);
		}
		else if(this.giorno == 31 && this.mese == DICEMBRE){			
			giornoDopo.setGiorno(1);
			giornoDopo.setMese(GENNAIO);
			giornoDopo.setAnno(this.anno+1);
		}
		return giornoDopo;
	}
}