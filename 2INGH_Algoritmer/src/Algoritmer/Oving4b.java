package ovinger_Algoritmer;

import java.util.Scanner;
import java.util.Stack;

/* 
* Oppgave 2: 5-2 s109
*  Programmet skal kunne lese en vanlig kildekodefil, for å sjekke
*  bruken av parenteser, klammer og krøllparenteser. Prøv f.eks. å sjekke programmet
*  fra forrige øving.
*  Tips: En stakk kan komme godt med her. . .
*  Prøv ut grundig. Programmet skal kunne håndtere vanlig kildekode. Det skal godta
*  alle programmer uten nøstingsfeil, og varsle om alle som har det.
*  
*  Lag en algoritme som sjekker om et program har riktig antall og nøsting av () [] og {},
*  dvs at enhver venstreparentes kan koples med en tilhørende høyreparentes, og at uttrykk av typen ([)] ikke forekommer.
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
					System.out.println("Feil i nøstingen 1");
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
					System.out.println("Feil i nøstingen 2");
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
					System.out.println("Feil i nøstingen 3");
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
