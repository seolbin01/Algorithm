import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] height = new int[N];
        for (int i=0;i<N;i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];

        Deque<int[]> stack = new ArrayDeque<>();

        for (int i=0;i<N;i++) {
            int h = height[i];

            while (!stack.isEmpty() && stack.peek()[1] < h) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = stack.peek()[0];
            }

            stack.push(new int[]{i + 1, h});
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            sb.append(result[i]).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
