package Algoritmer.Oving2;
/**
 * 2.1-1
 * x^n kan defineres ved x^n = { 1 x		n�r n=0
 * 								*x^(n-1) 	n�r n>0		}
 * 
 * Programmer dette ved hjelp av rekursjon, og kontroller at svarene blir riktige
 * @author Roger
 *
 */
public class Oving2 {
	public static void main(String[] args) {
		double number = 1.001;
		int[] exponent = {350,500,1000,1500,2000,2500,3000,3500,4000};
		double solution1 = 0, solution2 = 0;
		int runder = 1, runder2 = 1;
		
		for (int i = 0; i < exponent.length; i++) {
			long start = System.nanoTime();
			while (System.nanoTime() - start < 8000000) {
				solution1 = calc1(number, exponent[i]);
				runder++;
			}
			long time = ((System.nanoTime() - start)/runder);
			
			long start2 = System.nanoTime();
			while (System.nanoTime() - start < 80000000) {
				solution2 = Math.pow(number, exponent[i]);
				runder2++;
			}
			long time2 = ((System.nanoTime() - start2)/runder2);
			
			System.out.println("Egen algoritme: (" + number + ", " + exponent[i] + ")" + " = " + solution1);
			System.out.println("Tid: " + time + " ns");
			System.out.println("Math.pow algoritme: (" + number + ", " + exponent[i] + ")" + " = " + solution2);
			System.out.println("Tid: " + time2 + " ns \n \n");
		}
	}
	/**
	 * En rekursiv algoritme som regner ut et tall med eksponent
	 * Inn: double tall, integer eksponent
	 * UT: double tall
	 */
	public static double calc1 (double number, int n){
		if (n == 0) {									// basis
			return 1;
		}
		return number * calc1(number, n - 1);				//rekursiv algoritme, kaller seg selv
	}
}