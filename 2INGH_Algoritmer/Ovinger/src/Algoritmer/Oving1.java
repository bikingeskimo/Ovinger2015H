/**
 * Created by Roger on 17.08.2015.
 * 
 * 1-1 lag og implementer en algoritme som finner hvilket kjøps og salgstidspunkt som produserer mest inntjening
 * Sjekk at algoritmen virker
 * 
 * Tabell
 * Dag		1	2	3	4	5	6	7	8	9
 * Kursf	-1	3	-9	2	2	-1	2	-1	-5
 * 
 * Fasit: kjøp dag 3, selg dag 7
 * 
 * 
 * 
*
 * 1-2: Analyser algoritmen. Finn kompleksiteten for tidsforbruket. Bruk Ö-notasjon om mulig, eller ihvertfall O-notasjon
 * 
 * 1-3: Legg inn tidsmåling i programmet, og prøvekjør med tallrekker av ulik lengde.
 * 
 * -1, 3, -9, 2, 2, -1, 2, -1, -5
 */


public class Oving1 {
	public static void main(String[] args) {
		int[] rates = { -5, -1, 2, -1, 2, 2, -9, 3, -1, 3, 6/*-1, 3, -9, 2, 2, -1, 2, -1, -5 */};
		int[] res = null;
		
		int start = 100, laps=1;
		
		long startTime = System.nanoTime(), time=0;
		
		for (int elements = start; elements < 1000*start; elements *= 2) {
			//res = new int[elements];
			//res = makeRandomArray(elements, max, min);
			
			
		
		
			while (System.nanoTime()-startTime<10000000) {
				
				laps++;
			}
			time = (System.nanoTime() - startTime)/laps;
			
		}
		res = getRes(rates, rates.length);
		System.out.println("Kjøpt på dag nr:  " + res[0]);
		System.out.println("Solgt på dag nr:  " + res[1]);
		System.out.println("Fortjeneste : " + (res[1] - res[0]));
		System.out.println("Programmet brukte: " + time + " nanosekunder, på " + laps + " runder");
		
	}
	
	public static int[] getRes(int[] array, int n){
		int begin = 0;
		int maxDiff = 0;
		int pointer = 0;
		int[] minmaxDay = new int[2];
	
		for (int i = 1; i < n; i++) {
			array[i] = array[i-1] + array[i];
		}
		
		for (int i = 0; i < n; i++){
			begin = array[i];
			for (int j = i; j < n; j++) {
				if (array[j] > begin){
					pointer = (array[j] - begin);
					if (pointer > maxDiff) {
						maxDiff = pointer;
						minmaxDay[0] = i+1;
						minmaxDay[1] = j+1;
						
					}
					
				}
			}
			
		}
		return minmaxDay;
	}
	public static int[] makeRandomArray(int elements, int max, int min) {
		java.util.Random random = new java.util.Random();
		int[] array = new int[elements];
		
		for (int i = 0; i < elements; i++) {
			array[i] = random.nextInt((max-min) + 1) + min;
		}
		return array;
	}
}

