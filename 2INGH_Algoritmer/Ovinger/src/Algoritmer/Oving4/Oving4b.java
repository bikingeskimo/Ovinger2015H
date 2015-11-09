package Algoritmer.Oving4;

import java.util.Scanner;
import java.util.Stack;

/* 
* Oppgave 2: 5-2 s109
*  Programmet skal kunne lese en vanlig kildekodefil, for � sjekke
*  bruken av parenteser, klammer og kr�llparenteser. Pr�v f.eks. � sjekke programmet
*  fra forrige �ving.
*  Tips: En stakk kan komme godt med her. . .
*  Pr�v ut grundig. Programmet skal kunne h�ndtere vanlig kildekode. Det skal godta
*  alle programmer uten n�stingsfeil, og varsle om alle som har det.
*  
*  Lag en algoritme som sjekker om et program har riktig antall og n�sting av () [] og {},
*  dvs at enhver venstreparentes kan koples med en tilh�rende h�yreparentes, og at uttrykk av typen ([)] ikke forekommer.
* 
*/

public class Oving4b {
	private String data;
	
	public Oving4b(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}

	public static Boolean checkText(String data) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < data.length(); i++) {
			switch (data.charAt(i)) {
			
			case '{': stack.push('{');break;
			case '[': stack.push('[');break;
			case '(': stack.push('(');break;
			
			case '}':												//put in stack, find connecting "}" and remove from stack
				if (stack.empty()) {
					return false;
				}
				if (stack.peek() == '{') {
					stack.pop();
					break;
				}else {
					System.out.println("Feil i n�stingen 1");
					return false;
				}
				
			case ']':
				if (stack.empty()) {
					return false;
				}
				if (stack.peek() == '[') {							//put in stack, find connecting "]" and remove from stack
					stack.pop();
					break;
				}else {
					System.out.println("Feil i n�stingen 2");
					return false;
				}
				
			case ')':												//put in stack, find connecting ")" and remove from stack
				if (stack.empty()) {
					return false;
				}
				if (stack.peek() == '(') {
					stack.pop();
					break;
				}else {
					System.out.println("Feil i n�stingen 3");
					return false;
				}
			}
		}
		if (stack.empty()) {
			System.out.println("The stack is empty, code is good! :D ");
			return true;
		}else {
			System.out.println("The stack is not empty, code is not good");
			return false;
		}
	}
	
	public static void main(String[] args) {
		String text;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text to be scanned: ");
		text = input.next();
		
		checkText(text);
		
		new Oving4b(text);
		
	}
}
