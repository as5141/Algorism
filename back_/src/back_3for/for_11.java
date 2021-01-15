package back_3for;

import java.util.ArrayList;
import java.util.Scanner;

public class for_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sized = scan.nextInt();
		int[] array = new int[sized];
		ArrayList<Integer> list = new ArrayList<>();
		int number = scan.nextInt();
		for(int i=0;i<sized;i++) {
			array[i] = scan.nextInt();
			if(array[i]<number) {
				list.add(array[i]);
			}
		}
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
