import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String s;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			s = br.readLine();
			sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}