package back_4while;

import java.util.Scanner;

public class while_3 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		String[] origin = new String[2];
		int[] intS = new int[2];
		String[] Str = new String[2];
		String[] Str2 = new String[2];
		String sums="";
		String tmp="";
		String first = "";
		int sum = 0;
		int count = 0;
		
		while(tmp.equals("")) {
			first = scan.nextLine();
			if(Integer.parseInt(first) >= 0) {
				if(Integer.parseInt(first) <= 99) {
					tmp = "x";
				}
			}
		}
		
		while(true) {
			if(first != "x") {
				if(Integer.parseInt(first) <= 10) {
					first="0"+first;
				}
				Str = SArray(first);
				origin = SArray(first);
				for(int i=0; i<=1; i++) {
					intS[i] = Integer.parseInt(Str[i]);
					sum += intS[i];
				}
				first = "x";
			}
			else {
				//10이 안되면 앞에 0 붙여줌
				if(sum < 10) {
					sums = "0"+sum;
				}
				else {
					sums = Integer.toString(sum);
				}
				Str2 = SArray(sums);
				sum = Integer.parseInt(Str[1]) + Integer.parseInt(Str2[1]);
				tmp = Str[1];
				Str[1] = Str2[1];
				if(origin[0].equals(tmp)) {
					if(origin[1].equals(Str[1])) {
						break;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}
	static String[] SArray(String sums) {
		String[] temp = new String[2];
		temp[0] = sums.substring(0,1);
		temp[1] = sums.substring(1,2);
		return temp;
	}
	
}
