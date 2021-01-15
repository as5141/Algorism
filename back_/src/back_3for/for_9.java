package back_3for;

import java.util.Scanner;

public class for_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int s=0;
		for(int i=0;i<count;i++) {
			s++;
			for(int j=0;j<s;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//만약 1이라면 카운트 - 1 을 하고 나머지를 다른 변수에 넣고 만약 해당 변수가 0 이상이면 그 값만큼 공백 주기