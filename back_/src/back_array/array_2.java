package back_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 9;
		int[] arr = new int[count];
		int index=0;
		int max=0;
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}