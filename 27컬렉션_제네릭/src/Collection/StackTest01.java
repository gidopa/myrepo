/*
 	스택은 Last in First Out       LIFO
 	
 */
package Collection;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("HI");
		stack.push(2321);
		stack.push("JAVA");
		System.out.println(stack);
				
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
