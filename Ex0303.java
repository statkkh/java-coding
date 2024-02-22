package java_codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0303 {
	// 백준 2164 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0 ; i <= n ; i++) {
			queue.offer(i);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}

}
