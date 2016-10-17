// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;


 
public class MathLab04st
{
	static int max;

	public static void main(String args[]) 
	{
		System.out.println("\nMathLab04\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		max = MAX;
		computePrimes(primes);
		displayPrimes(primes);
	}


	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		for(int j = 0; j < max; j++){
			primes[j] = true;
		}
		
		
		for(int i = 2; i < max/2; i++){
			if(primes[i]){
				for(int k = i*2; k <max; k+=i){
					primes[k] = false;
				}
			}
		}
		System.out.println("done");
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for (int q = 1; q < max; q++){
			if(primes[q])
			System.out.println(q);
		}
	}
	
}



