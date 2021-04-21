import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Nivell1 {

	public static void main(String[] args) {
		/*Fase 1
		Crea sis variables tipus string buides. 
		Demana per consola que s’introdueixin els noms.  
		Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat. 
		Mostra per consola el nom de les 6 ciutats. */
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6 = "";
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digues sis ciutats:");
		ciutat1 = myObj.nextLine();
		ciutat2 = myObj.nextLine();
		ciutat3 = myObj.nextLine();
		ciutat4 = myObj.nextLine();
		ciutat5 = myObj.nextLine();
		ciutat6 = myObj.nextLine();

		System.out.println(ciutat1 + " " + ciutat2 + " " + ciutat3 + " " + ciutat4 + " " + ciutat5 + " " + ciutat6);

		
		/*Fase 2
		Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats). 
		Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.*/
		
		String[] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
		
		Arrays.sort(arrayCiutats);
		
		System.out.println(Arrays.toString(arrayCiutats));
		
		/*Fase 3
		Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats 
		en un nou array(ArrayCiutatsModificades). 
		Mostreu per consola l’array modificat i ordenat per ordre alfabetic.*/
		
		//String[] arrayCiutats = {"Barcelona", "Madrid"};
		
		String[] arrayCiutatsModificades = new String[arrayCiutats.length];
		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutatsModificades[i] = arrayCiutats[i];
		}
		
		for(int i = 0; i < arrayCiutatsModificades.length; i++) {
			for(int j = 0; j < arrayCiutatsModificades[i].length(); j++) {
				if (arrayCiutatsModificades[i].charAt(j) == 'A' || arrayCiutatsModificades[i].charAt(j) == 'a') {
					arrayCiutatsModificades[i] = arrayCiutatsModificades[i].substring(0, j)
			              + '4'
			              + arrayCiutatsModificades[i].substring(j + 1);
				}
			}
		}
		
		System.out.println(Arrays.toString(arrayCiutatsModificades));
		
		/*Fase 4
		Creeu un nou array per cada una de les ciutats que tenim. 
		La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).  
		Ompliu els nous arrays lletra per lletra. 
		Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).*/
		
		int maxCiutatLength = 0;
		
		for (String i : arrayCiutats) {
			if (i.length() >= maxCiutatLength) {
				maxCiutatLength = i.length();
			}
		}
			
		char[][] arrayCaracters = new char[arrayCiutats.length][maxCiutatLength];
		
		for(int i = 0; i < arrayCiutats.length; i++) {
			for(int j = 0; j < arrayCiutats[i].length(); j++) {
				arrayCaracters[i][j] = arrayCiutats[i].charAt(j);
			}
		}
		for(int i = 0; i < arrayCaracters.length; i++){
	        System.out.println(arrayCaracters[i]);
	    }
		
		/*ArrayList<ArrayList<Character>> x = new ArrayList<ArrayList<Character>>();
	    
	    for(int i = 0; i < arrayCiutats.length; i++) {
	        x.add(new ArrayList<Character>());
			for(int j = 0; j < arrayCiutats[i].length(); j++) {
	           x.get(i).add(j, arrayCiutats[i].charAt(j));

			}
					
		}
	    for(int i = 0; i < x.size(); i++){
	        System.out.println(x.get(i));
	    }*/
		
	}

}
