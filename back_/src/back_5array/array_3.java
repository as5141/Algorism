package back_5array;

import java.util.Scanner;

public class array_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 9;
		int[] arr = new int[count+1];
		String[] arrS = null;
		int[] check = new int[count+1];
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		String sum = Integer.toString(A*B*C);
		arrS = sum.split("");//여긴 잘드감
		
		for(int i=0;i<=count;i++) {
			arr[i] = i;
		}
		for(int i=0;i<=count;i++) {
			for(int j=0; j<arrS.length;j++) {
				if(arr[i] == Integer.parseInt(arrS[j])) {
					check[i] += 1;
				}
			}
		}
		for(int i : check) {
			System.out.println(i);
		}
	}
}
