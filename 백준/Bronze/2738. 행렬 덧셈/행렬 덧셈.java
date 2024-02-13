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
		
		String[] s = br.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		int[][] arrSum = new int[N][M];
		
		for(int i = 0; i<N; i++) {
			s = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				arr1[i][j] = Integer.parseInt(s[j]);
			}
		}
		for(int i = 0; i<N; i++) {
			s = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				arr2[i][j] = Integer.parseInt(s[j]);
				arrSum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		Arrays.stream(arrSum)
        .forEach(row -> {
            Arrays.stream(row)
                    .forEach(cell -> System.out.print(cell + " "));
            System.out.println();
        });
	}
}