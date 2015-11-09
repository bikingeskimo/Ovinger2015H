package Algoritmer.Oving4;

import java.util.Scanner;

/*
 * @Author: Roger
 * 
 * 
 * Oppgave 1: 4.3-5 s91
 * 	Finn kompleksiteten for programmet, funksjon av antall personer og lengden p� intervallet mellom dem
 * 	Et lite tips: hvis listen din har en �slutt�, som blir et �spesialtilfelle�, har du neppe
 * 	gjort dette rett.
 * 
 * Bruk ei sirkul�r liste to � l�se Josephus problem:
 * 
 * Romerne var i ferd med � fange 40 soldater samt Josephus. Soldatene ville heller beg� selvmord enn � overgi seg. 
 * De besluttet at alle skulle stille seg i en sirkel, og s� skulle hver tredje person drepes inntil det ikke var flere igjen.
 * Josephus ville ikke d�, s� han regnet raskt ut hvor han m�tte stille sg for � bli den siste to � beg� selvmord, og dermed slippe � gj�re det
 * 
 * Lag et program som finner ut hvor Josephus b�r st�, avhengig av hvor mange personer som er med, og hvor stort intervall man bruker.
 * 
 * Eksempel: Hvis 10 personer st�r i ringen, og hver fjerde drepes, f�r man f�lgende
 * 1 2 3 _4_ 5 6 7 _8_ 9 10
 * 1 _2_ 3 5 6 _7_ 9 10
 * 1 _3_ 5 6 9 _10_
 * 1 5 6 _9_
 * 1 5 6
 * _1_ 5 6
 * 5 _6_
 * 5
 * 
 * 
*/

public class Oving4 {
	private Soldier current;
	
	private static class Soldier{
		private int data;
		private Soldier next;
		private Soldier previous;
		
		public Soldier(int number) {
			next = previous = null;
			data = number;
		}
		
		public String toString() {
			return String.valueOf(data);	
		}
	}
	
	public Oving4(int n, int k) {
		start(n);
		remove(k, n);
	}
	
	public void start(int n) {
		Soldier temp_soldier = null;
		
		for (int i = 1; i < n + 1; i++) {
			Soldier soldier = new Soldier(n);
			
			soldier.data = i;
			
			if (i == 1) {
				current = soldier;
				temp_soldier = soldier;
				continue;
			}
			temp_soldier.next = soldier;
			soldier.previous = temp_soldier;
			
			temp_soldier = soldier;
			
			if (i == n) {
				soldier.next = current;
				current.previous = soldier;
				continue;
			}
		}
	}
	
	public void remove(int k, int n) {
		if ((k > 1 && k < n)) {
			Soldier x;
			int i = 0;

		
			for (x = current; x.next != x && x.previous != x; x = x.next) {
				if (i == k -1) {
					x.previous.next = x.next;
					x.next.previous = x.previous;
					
					System.out.println("Soldier " + x.data+ " is no more.");
					i = 0;
					continue;
				}
				i++;
			}
			System.out.println("Last remaining soldier is " + x.data);
		}else {
		      System.err.println("Parameter must be between 1 and n ");
		  }
	}
	public static void main(String[] args) {
		int number, interval;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of soldiers: ");
		number = input.nextInt();
		
		System.out.print("Enter spacing of kills: ");
		interval = input.nextInt();
		
		new Oving4(number, interval);
	}
	
}
