/*Scrivere un metodo pubblico statico che, presi come parametri una stringa s e un carattere c,
restituisca la lunghezza della più lunga sequenza di caratteri di c consecutivi in s.*/

public class Esercizio67{
	public static void main(String[] args) {
		String stringa1 = "Ammaccabanane";
		String stringa2 = "AAABBBCCCAAAAAAPAA";
		String stringa3 = "Scrivere un metodo pubblico";
		System.out.println(stringa1 +" contiene al più "+contiene(stringa1,'a')+" a");
		System.out.println(stringa1 +" contiene al più "+contiene(stringa1,'m')+" m");
		System.out.println(stringa2 +" contiene al più "+contiene(stringa2,'a')+" a");
		System.out.println(stringa2 +" contiene al più "+contiene(stringa2,'c')+" c");
		System.out.println(stringa3 +" contiene al più "+contiene(stringa3,'a')+" a");
	}
	public static int contiene(String str, char c){
		String stringa = str.toLowerCase();
		int result = 0, temp = 0;
		for(int i = 0; i<stringa.length(); i++){
			char attuale = stringa.charAt(i);
			if(attuale == c) {
				temp++;
				if(result < temp) result=temp;
			}
			else temp = 0;
		}
		return result;
	}
}