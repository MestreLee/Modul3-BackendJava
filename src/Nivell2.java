import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		//Array bidimensional: 3 notes per 5 alumnes. Calcular mitjana per cada alumne i dir si aproven o no.
		
		Scanner myObj = new Scanner(System.in);
		
		int[][] notesAlumnes = new int [5][3];
		int notaMitjana;
		
		for (int i = 0; i < notesAlumnes.length; i++) {
			System.out.println("Introdueix les notes de l'alumne " + (i+1));
			for (int j = 0; j < notesAlumnes[i].length; j++) {
				System.out.print("Nota " + (j+1) + " :");
				notesAlumnes[i][j] = myObj.nextInt();
			}
		}
		for (int i = 0; i < notesAlumnes.length; i++) {
			notaMitjana = 0;
			for (int j = 0; j < notesAlumnes[i].length; j++) {
				notaMitjana = notaMitjana + notesAlumnes[i][j];
			}
			notaMitjana = notaMitjana / notesAlumnes[i].length;
			if (notaMitjana < 5) {
				System.out.println("L'alumne " + (i+1) + " no ha aprovat. La seva nota mitjana és de " +notaMitjana);
			} else {
				System.out.println("L'alumne " + (i+1) + " ha aprovat amb una nota mitjana de " +notaMitjana);
			}
		}
 
	}

}
