package back_6fun;

import java.util.Scanner;

public class fun_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cou = scan.nextInt();
		int[] arr = new int[cou];
		long sum =0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		sum = Test.sum(arr);
		
		System.out.println(sum);
		//해당 Test만 문제 풀이
	}
}

class Test{
	static long sum (int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}
	


