import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int current = 1;
        boolean chk = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (current <= num) {
                stack.push(current++);
                sb.append('+').append('\n');
            }

            if (stack.peek() == num) {
                stack.pop();
                sb.append('-').append('\n');
            } else {
                chk = false;
                break;
            }
        }

        if (chk) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}