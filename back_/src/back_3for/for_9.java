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
//���� 1�̶�� ī��Ʈ - 1 �� �ϰ� �������� �ٸ� ������ �ְ� ���� �ش� ������ 0 �̻��̸� �� ����ŭ ���� �ֱ�