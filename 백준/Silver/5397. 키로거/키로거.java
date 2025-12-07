import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0;i<T;i++) {
            String str = br.readLine();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (char c : str.toCharArray()) {
                if (c == '<') {
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                } else if (c == '>') {
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                } else if (c == '-') {
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                } else {
                    left.push(c);
                }
            }

            StringBuilder result = new StringBuilder();
            while (!left.isEmpty()) {
                right.push(left.pop());
            }
            while (!right.isEmpty()) {
                result.append(right.pop());
            }

            System.out.println(result);
        }
    }
}
