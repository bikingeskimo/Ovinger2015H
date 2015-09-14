package ovinger_Algoritmer;

/**
 * 
 * 2.2-3
 * x^n kan defineres ved x^n = {	1					når n=0
 * 									x*(x^2) (n-1)/2		når n=oddetall
 * 									(x^2)^(n/2)			når n=partall		}
 * 
 * Programmer dette, og sammenlikn tidsforbruket ved stor n med det fra oppgave a. 
 * Kan du forklare forskjellen?
 * 
 * 
 * 
 * @author Roger
 *
 */
public class Oving2b {
	public static void main(String[] args) {
		double number = 1.001;
		int n = 80000;
		
		double solution1 = 0.0;
		
		long start = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			solution1 = calc1(number, n);
		}	
		long time = (System.nanoTime() - start);
		
		
		System.out.println("Egen algoritme: (" + number + ", " + n + ")" + " = " + solution1);
		System.out.println("Tid: " + time/1000 + " microsekunder");
		
		long start2 = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			solution1 = Math.pow(number, n);
		}	
		long time2 = (System.nanoTime() - start2);
		
		
		System.out.println("Egen algoritme: (" + number + ", " + n + ")" + " = " + solution1);
		System.out.println("Tid: " + time2/1000 + " microsekunder");
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
		if (n % 2 == 0) {								// partall hvis sant
			return calc1(number * number, n/2);
		}else {											// oddetall hvis ikke
			return (number * calc1(number * number, (n - 1)/2));
		}
	}
	
}
