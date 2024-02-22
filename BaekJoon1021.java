

package java_codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1021 {

	public static void main(String[] args) {
		
    // https://www.acmicpc.net/problem/1021        

		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
	
		for(int i = 1 ; i <= n ; i++) {
			q.offer(i);
		}
		
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		for(int i = 0 ; i< m ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for(int t : arr) {
			int index = q.indexOf(t);
			int mid = q.size() / 2;
			
			
			if(index < mid) {
				
				while(t != q.getFirst()) {
					q.addLast(q.removeFirst());
					cnt++;
				}
			}else {
				
				while(t != q.getFirst()) {
					q.addLast(q.removeLast());
					cnt++;
				}
			q.pollFirst();
			}
			System.out.println(cnt);
		}	
	}

}

