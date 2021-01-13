package back_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ujin_for_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int T = Integer.parseInt(br.readLine());
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      for (int i = 1; i<=T; i++) {
	         int A = Integer.parseInt(br.readLine());
	         int B = Integer.parseInt(br.readLine());
	         bw.write(A+B+"\n");         
	      }        
	      bw.flush();
	      bw.close();
	}
}

//이렇게 고치면 백준 알고리즘에서 런타임 안뜸
//public class ujin_for_4 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      int T = Integer.parseInt(br.readLine());
//	      StringTokenizer st;
//	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	      for (int i = 1; i<=T; i++) {
//	    	 st = new StringTokenizer(br.readLine());
//	         int A = Integer.parseInt(st.nextToken());
//	         int B = Integer.parseInt(st.nextToken());
//	         bw.write(A+B+"\n");         
//	      }        
//	      bw.flush();
//	      bw.close();
//	}
//}
