package back_4while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class while_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> List = new ArrayList<>();
		StringTokenizer st;
		int breaknum = 0;
		while(breaknum == 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) {
				break;
			}
			List.add(a+b);
		}
		for(int i : List){
			System.out.println(i);
		}
	}
}


