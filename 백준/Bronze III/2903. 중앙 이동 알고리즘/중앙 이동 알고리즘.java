import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		// 각변의 중앙과, 각 사각형의 중앙에 점을 직음.
		// 점은 최초로 한번만 찍음. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Math math = null;
		
		// 변의 개수
		//int m = (int)math.pow(2, N-1);
		int m;
		int sum = 4;
		for(int i = 0; i<N; i++) {
			m = (int)math.pow(2, i);
			sum = sum + 2*m*(m+1) + (int)math.pow(m, 2);
		}
		System.out.println(sum);
		
	}
}