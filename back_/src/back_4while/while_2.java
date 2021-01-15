package back_4while;

import java.io.IOException;
import java.util.Scanner;

public class while_2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
	}
}
