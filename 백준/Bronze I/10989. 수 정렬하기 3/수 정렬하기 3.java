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
		
		int[] array = new int[N];		// 수열의 원소 : N개
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int[] result = new int[N];	// 정렬 될 배열 
 
		int[] counting = new int[10001];	// 수의 범위 : 0 ~ 30
		
		for(int i=0; i<array.length; i++) {
			counting[array[i]]++;
		}

		for(int i=0; i<counting.length-1; i++) {
			counting[i+1] += counting[i];
		}
		
		for(int i=array.length - 1; i>=0; i--) {
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		// 정렬된 배열
		for(int i = 0; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		bw.flush();
		System.out.println();
	}
 
}