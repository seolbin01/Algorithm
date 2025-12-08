import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int total = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i=0;i<N;i++) {
            String str = br.readLine();;
            String[] arr = str.split(" ");

            if (arr[0].equals("1")) {
                int A = Integer.parseInt(arr[1]);
                int T = Integer.parseInt(arr[2]);

                stack.push(new int[]{A, T});
            }

            if (!stack.isEmpty()) {
                stack.peek()[1]--;

                if (stack.peek()[1] == 0) {
                    total += stack.peek()[0];
                    stack.pop();
                }
            }
        }

        System.out.println(total);
    }
}
