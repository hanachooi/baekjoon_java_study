import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		int[] str = new int[N];
		
		for(int i = 0; i<M; i++) {
			s = br.readLine().split(" ");
			for(int j= Integer.parseInt(s[0]); j<=Integer.parseInt(s[1]); j++) {
				str[j-1] = Integer.parseInt(s[2]);
			}
		}
		
		for(int m : str) {
			System.out.print(m + " ");
		}
	}
}