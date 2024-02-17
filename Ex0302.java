package java_codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0302 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		ArrayQueue queue = new ArrayQueue(5);
		
		while(true){
			System.out.println(String.format("현재 수: %d / %d", args));
			System.out.println("1 : enq(add), 2 : deque(poll) , 3 : peek, 4 : clear, 5 : 종료 ");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				System.exit(0);
				break;
			}
			
			int x;
			
			switch(num) {
				case 1:
					System.out.println("데이터 : ");
					x = sc.nextInt();
					queue.add(x);
					break;
				case 2:
					x = queue.poll();
					System.out.println("나간 데이터 : ");
									
					break;	
				case 3:
					x = queue.peek();
					System.out.println("첫 번째 데이터 : ");
					break;
				case 4:
					queue.clear();
					break;
				case 5:
					queue.dump();
					break;								
			}

		}
	}

}

// 배열로 큐형태로 만들기

class ArrayQueue{
	private int max; // 큐의 최대용량
	private int front; // 첫번째 요소의 커서
	private int rear; // 마지막 요소의 커서
	private int cnt; // 현재 데이터의 수
	private int[] queue; // 큐
	
	
	public ArrayQueue(int capacity) {
		this.max = capacity;
		this.cnt = this.front = this.rear = 0;
		this.cnt = 0;
		
		try {
			queue = new int[this.max];
			
		}catch(Exception e){
			this.max = 0;
			System.out.println(max);
//			e.printStackTrace();
		}
		
	}
	
	public int add(int x) {
	
		if(cnt >= max) {
			System.out.println("Queue if Full");
			return x;
		} 
		
		queue[rear++] = x;
		cnt++;
		if(rear == max) rear = 0;
	
		return x;
	}	
	
	public int peek() {

		if(cnt <= 0) {
			System.out.println("Queue is Empty");
		}

		return queue[front];
	}
	
	public int poll() {
		
		if(cnt < 0) {
			cnt = 0;
			System.out.println("Queue is Empty");
		} 
		
		int x = queue[front++];
		cnt--;
		
		if(front == max) front = 0;
		return 0;
	}
	
	public void clear() {
		this.rear = this.front = this.cnt = 0;
	}
	
	public boolean isEmpty() {
		return this.cnt <= 0;
	}
	
	public int capacity() {
		return this.max;
	}
	
	public boolean isFull() {
		
		return this.cnt >= max;
	}
	
	public int size() {
		return this.cnt;
	}

	public void dump() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(Arrays.toString(queue));
	}
}
