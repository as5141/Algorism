package back_3for;

import java.util.Scanner;

public class for_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int s=0;
		for(int i=0;i<count;i++) {
			s++;
			if((count-s)!=0) {
				for(int c=0;c<(count-s);c++) {
					System.out.print(" ");
				}
			}
			for(int j=0;j<s;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

