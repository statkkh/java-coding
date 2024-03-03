

import java.util.Arrays;
import java.util.Stack;

public class Ex0401 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		System.out.println(stack.toString());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString()); // [1, 2, 3]
		System.out.println(stack.peek()); // 3
		System.out.println(stack.toString()); // [1, 2, 3]
		System.out.println(stack.isEmpty()); // false
		System.out.println(stack.search(4)); // 위치반환, 없으면 -1 반환 , 위에서 부터 1,2 3 ~
		System.out.println(stack.contains(2)); // 2포함여부 
		System.out.println(stack.containsAll(Arrays.asList(1,2,4))); // false
		System.out.println(stack.size()); // 3 
	}

}
