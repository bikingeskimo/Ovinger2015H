package ovinger_Algoritmer;

public class Oving3 {

	
	public static void main(String[] args) {
		double gap = 2.8;
		int numberOfElements = 200000;
		int antRunder = 1;
		int max = 500000;
		int min = -500000;
		
		int[] array = makeRandomArray(numberOfElements, max, min);
		
		double start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 100) {
			int[] arrayCopy = array;
			shellsort(arrayCopy, gap);
			antRunder++;
		}
		double time = ((System.currentTimeMillis() - start)*10)/antRunder;		
		shellsort(array, gap);

		
		System.out.println("Gap: " + gap + "		Elementer: " + numberOfElements + "\nTidsbruk: " + time + " ms" + "\nSortert: " + isSorted(array));
		
	}
	
	public static int[] shellsort(int[] array, double gap){
		int s = array.length / 2; 						//Prøv ut ulike måter å forandre S på
		while (s > 0) {
			for (int i = s; i < array.length; i++) {
				int j = i, move = array[i];
				while (j >= s && move < array[j-s]) {
					array[j] = array[j-s];
					j -= s;
				}
				array[j] = move;
			}
			s = (s == 2) ? 1 : (int)(s / gap);		// Prøv med andre tall enn 2.2
		}
		return array;
	}
	
	public static int[] makeRandomArray(int numberOfElements, int max, int min) {
		java.util.Random random = new java.util.Random();
		int[] array = new int[numberOfElements];
		
		for (int i = 0; i < numberOfElements; i++) {
			array[i] = random.nextInt((max-min) + 1) + min;
		}
		return array;
	}
	
	public static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length -1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
