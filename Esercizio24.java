/*Scrivere un programma Java che legga da input una stringa non vuota 
  e stampi la stringa ottenuta invertendo la prima e l'ultima lettera.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Esercizio24{
	public static void main(String[] args){
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader myInput = new BufferedReader(reader);
		String originale = new String();
		try{
			originale = myInput.readLine();
		}catch(IOException e){
			System.out.println("Error: "+e);
		}
		String invertita = originale.substring(originale.length()-1)+originale.substring(1, originale.length()-1)+originale.substring(0,1);
		System.out.println("Hai scritto: " +originale);
		System.out.println("La stringa invertita: " +invertita);
	}
}