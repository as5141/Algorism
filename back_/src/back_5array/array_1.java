package back_5array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class array_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		int tmp=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(arr);
		System.out.print(arr[0]+" "+ arr[count-1]);
	}
}
