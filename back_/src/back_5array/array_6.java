package back_5array;

import java.util.Scanner;

public class array_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Scount = scan.nextLine();
		int count = Integer.parseInt(Scount);
		String[] Sarray1 =null;
		String A = null;
		int[] Score = new int[count];
		String O = "O";
		String X = "X";
		
		for(int i=0; i<count; i++) {
			int count1 = 0;
			 A = scan.nextLine();
			Sarray1 = A.split("");
			for(int j=0;j<Sarray1.length;j++) {
				if(Sarray1[j].equals(O)) {
					count1++;
					Score[i] += count1;
				}else if(Sarray1[j].equals(X)) {
					count1 = 0;
				}
			}
		}
			
		for(int i=0; i<Score.length; i++) {
			System.out.println(Score[i]);
		}
	}
}
