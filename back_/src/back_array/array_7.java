package back_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList List = new ArrayList();
		int count = Integer.parseInt(scan.nextLine());
		String[] Student_S = null;
		int Student_num = 0;
		double Student_avg = 0.000;
		int sum = 0;
		int avg = 0;
		
		for(int number=0; number<count; number++) {
			String A = scan.nextLine();
			Student_S = A.split(" ");
			int[] Student = new int[Student_S.length];
			for(int i=0;i<Student_S.length;i++) {
				System.out.println(Student_S[i]);
				Student[i] = Integer.parseInt(Student_S[i]);
			}
			//여기서 Student[0]은 학생수
			for(int i=1; i<Student.length; i++) {
				sum += Student[i];
			}
			avg = sum/Student[0];
			for(int i=1; i<Student.length; i++) {
				if(avg < Student[i]) {
					Student_num++;
					System.out.println("평균이상 학생수 : "+Student_num);
				}
			}
			Student_avg = Student_num/Student[0];
			System.out.println("Student_avg : "+Student_avg);
			List.add(Student_avg);
		}
		for(int i=0; i<List.size(); i++) {
			System.out.printf("%.3f",List.get(i));
			System.out.println();
		}
	}
}
//문제 avg 부분