package back_5array;

import java.util.Arrays;
import java.util.Scanner;

public class array_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double[] array = new double[count];
		double A=0;
		double sum =0;
		
		for(int i=0; i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		A = array[array.length-1];
		for(int i=0; i<array.length;i++) {
			array[i] = (array[i]/A) * 100;
			sum += array[i];
		}
		System.out.println(round((sum/count),6));
	}
	public static double round(double number, int n) {
		double m = Math.pow(10.0, n);
		return Math.round(number * m)/m;
	}
}
