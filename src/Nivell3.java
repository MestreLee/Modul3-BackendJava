import java.util.Scanner;
public class Nivell3 {

	public static void main(String[] args) {
		// Tenint N, crear seqüència de Fibonacci fins a N
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Digues un número:");
		int n = myObj.nextInt();
		int[] fib = new int [n];
		for (int i = 0; i < n; i++) {
			if (i < 2){
                fib[i] = i;
            }else{
                fib[i] = fib[i-1] + fib[i-2];
            }      
		}
		for (int i = 0; i < n; i++) {
			System.out.print(fib[i] + " ");
		}
	}

}
