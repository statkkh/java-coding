package java_codingtest;

import java.util.*;

public class Ex0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		System.out.println(queue.toString());
		queue.offer(4);
		queue.offer(31);
		
		System.out.println(queue.toString()); // [1, 4, 31]
		System.out.println(queue.peek()); // [1, 4, 31]
		System.out.println(queue.poll()); // 1
		System.out.println(queue.toString()); //[4, 31]
		System.out.println(queue.isEmpty()); //false
		queue.clear(); 
		System.out.println(queue.isEmpty()); //true
		
		
	}

}
