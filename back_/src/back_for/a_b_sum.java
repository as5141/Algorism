package back_for;

import java.util.ArrayList;
import java.util.Scanner;

public class a_b_sum {
	public static void main(String[] args) {
		ArrayList <Integer >sum = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i=0; i<count; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int ab_sum = a+b;
			sum.add(ab_sum);
		}
		for(int i : sum) {
			System.out.println(i);
		}
	}
}
