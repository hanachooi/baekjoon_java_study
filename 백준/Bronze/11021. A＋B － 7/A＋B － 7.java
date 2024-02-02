import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] sb = new int[N];
		int m = 0;
		
		for(int i =1; i<=2*N; i = 2+i) {
			String[] s = br.readLine().split(" ");
			sb[m] = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
			m++;
		}
		
		for(int i=1; i<=N; i++) {
			System.out.println("Case #" + i + ": " + sb[i-1]);
		}
	}
}