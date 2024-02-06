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
		
		for(int i=0; i<N; i++) {
			str[i] = i+1;
		}
		
		int tmp;
		
		for(int i = 0; i<M; i++) {
			
			s = br.readLine().split(" ");
			// 인덱스를 0부터 잡아서, 받은 값의 -1을 해야함. 
			// tmp = Integer.parseInt(s[0]); 이렇게 되면, 배열의 바뀐 값이 반영되지 않음. 
			tmp = str[Integer.parseInt(s[0]) - 1];
			str[Integer.parseInt(s[0])-1] = str[Integer.parseInt(s[1])-1];
			str[Integer.parseInt(s[1])-1] = tmp;
			
		}
		
		for(int m : str) {
			System.out.print(m + " ");
		}
	}
}