package back_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class while_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> List = new ArrayList<>();
		StringTokenizer st;
		int count=5;
		while(count >=1) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			List.add(a+b);
			count--;
		}
		for(int i : List) {
			System.out.println(i);
		}
	}
}
