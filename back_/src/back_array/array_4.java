package back_array;

import java.util.ArrayList;
import java.util.Scanner;

public class array_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<>();
		int[] inarray = new int[10];
		
		for(int i=0; i<inarray.length;i++) {
			inarray[i] = scan.nextInt()%42;
		}
		
		for(int i=0; i<inarray.length;i++) {
			if(inarray[0] != inarray[i]) {
				if(List.size() == 0) {
					List.add(inarray[0]);
				}
				int count = 0;
				for(int j=0; j<List.size(); j++) {
					if(inarray[i] == List.get(j)) {
						count++;
					}
				}
				if(count == 0) {
					List.add(inarray[i]);
				}
			}
		}
		if(List.size() == 0) {
			List.add(inarray[0]);
		}
		System.out.println(List.size());
	}
}