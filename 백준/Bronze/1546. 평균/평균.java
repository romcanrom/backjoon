import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(scores).max().getAsInt();
        int sum = Arrays.stream(scores).sum();

        System.out.println((double)sum * 100 / max / N);
    }
}
