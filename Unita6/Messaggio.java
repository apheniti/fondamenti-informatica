/*Realizzare una classe Java per rappresentare messaggi.
Ogni messaggio è caratterizzato da:
- mittente
- destinatario
- testo del messaggio.
Tutte e tre le informazioni sono rappresentate da stringhe. 
Oltre alle funzionalità di restituzione e modifica di mittente, destinatario e testo, 
i messaggi supportano lo scambio di mittente e destinatario e tre forme di compressione:
- eliminazione degli spazi bianchi all'inizio e alla fine del testo, e
 sostituzione di ciascuna sequenza di spazi bianchi usata per separare parole nel testo 
 con un unico spazio bianco;
- eliminazione di tutte le vocali;
- entrambi. */


public class Messaggio{
	String mittente, destinatario, testo;
	public Messaggio(String m, String d, String t){
		this.mittente=m;
		this.destinatario=d;
		this.testo=t;
	}
	public Messaggio(){
		this.mittente="";
		this.destinatario="";
		this.testo="";
	}
	public void setMittente(String m){
		this.mittente=m;
	}
	public void setDestinatario(String d){
		this.destinatario=d;
	}
	public void setTesto(String t){
		this.testo=t;
	}
	public String getMittente(){
		return this.mittente;
	}
	public String getDestinatario(){
		return this.destinatario;
	}
	public String getTesto(){
		return this.testo;
	}
	public void scambio(){
		String temp = this.mittente;
		this.mittente=this.destinatario;
		this.destinatario=temp;
	}
	public void noSpaziBianchi(){
		for(int i = 0; i<this.testo.length()-1; i++){
			if(this.testo.charAt(0)==' '){
				this.testo = this.testo.substring(1, this.testo.length());
				i=0;
			}
			if(this.testo.substring(i, i+2).equals("  ")){
				this.testo = this.testo.substring(0, i)+this.testo.substring(i+1, this.testo.length());
				i=0;
			}
			if(this.testo.charAt(this.testo.length()-1)==' '){
				this.testo = this.testo.substring(0, this.testo.length()-1);
				i=0;
			}
		}
	}
	public void noVocali(){
		String temp = this.testo.replaceAll("a", "");
		this.testo = temp.replaceAll("e", "");
		temp = this.testo.replaceAll("i", "");
		this.testo = temp.replaceAll("o", "");
		temp = this.testo.replaceAll("u", "");
		this.testo = temp;

	}
	public void compressione(){
		noVocali();
		noSpaziBianchi();

	}
	@Override
	public String toString(){
		return "Mittente: "+this.mittente+'\n'+"Destinatario: "+this.destinatario+'\n'+"Testo: "+this.testo;
	}
}