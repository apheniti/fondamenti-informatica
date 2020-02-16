/*Scrivere un programma che legge un reale e stampa un messaggio secondo la seguente tabella:
40 < g SUPERALCOLICO
20 < g <= 40 ALCOLICO
15 < g <= 20 LIQUORE
12 < g <= 15 VINO FORTE
10.5 < g <= 12 VINO NORMALE
g <= 10.5 VINO LEGGERO */


public class Esercizio51{
	final static String sa = "SUPERALCOLICO", a = "ALCOLICO", l = "LIQUORE", 
				vf = "VINO FORTE", vn = "VINO NORMALE", vl = "VINO LEGGERO";
	final static double sup = 40, alc = 20, liq = 15, vinof = 12, vinonm = 10.5;
	public static void main(String[] args) {
		double birra = 4.5;
		double sidro = 5, vinoalto = 14;
		double vino = 12, porto = 19, vodka = 37, assenzio = 80;
		System.out.println("La birra è un "+gradazione(birra));
		System.out.println("Il sidro è un "+gradazione(sidro));
		System.out.println("Il vino è un "+gradazione(vino));
		System.out.println("Il vino alto è un "+gradazione(vinoalto));
		System.out.println("Il porto è un "+gradazione(porto));
		System.out.println("La vodka è un "+gradazione(vodka));
		System.out.println("L'assenzio è un "+gradazione(assenzio));

	}

	public static String gradazione(double x){
		if(x<=vinonm)
			return vl;
		else if(x>vinonm && x<=vinof)
			return vn;
		else if(x>vinof && x<=liq)
			return vf;
		else if(x>liq && x<=alc)
			return l;
		else if(x>alc && x<=sup)
			return a;
		else return sa;
	}
}
