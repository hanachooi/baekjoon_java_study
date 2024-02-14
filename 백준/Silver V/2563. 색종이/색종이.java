import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[100][100];
		int N = Integer.parseInt(br.readLine());

		for(int m = 0; m<N; m++) {
		String[] s = br.readLine().split(" ");
		for(int i = 0; i<100; i++) {
			for(int j = 0; j<100; j++) {
				if(i >= Integer.parseInt(s[0]) && i < Integer.parseInt(s[0]) + 10 && j >= Integer.parseInt(s[1]) && j < Integer.parseInt(s[1]) + 10) {
					arr[i][j]++;
				}
			}
		}
		}
		// count 의 반환 형식은 long 임. 
		long countNonZero = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value != 0)
                .count();
		System.out.println(countNonZero);
		
	}
}
