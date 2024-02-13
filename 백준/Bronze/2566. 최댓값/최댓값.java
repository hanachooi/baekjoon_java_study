import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s[];
		int[][] arr1 = new int[9][9];
		int[] w = new int[3];
		w[0] = 0;
		
		for(int i = 0; i<9; i++) {
			s = br.readLine().split(" ");
			for(int j = 0; j<9; j++) {
				arr1[i][j] = Integer.parseInt(s[j]);
				if(arr1[i][j] >= w[0]) {
					w[0] = arr1[i][j];
					w[1] = i+1;
					w[2] = j+1;
				}
			}
		}
		
		bw.write(w[0] + "\n" + w[1] + " " + w[2]);
		bw.flush();
		
		
	}
}
