/*Scrivere un programma Java che crei un oggetto String che rappresenta il proprio nome
  e stampi il primo e l'ultimo carattere della stringa.*/

public class Esercizio21{
	public static void main(String[] args){
		String nome = "apheniti";
		String stampa = nome.substring(0,1)+nome.substring(nome.length()-1);
		System.out.println(stampa);
	}
}