import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int total = 0;

        Stack<Character> stack = new Stack<>();

        for (int i=0;i<n;i++) {

            stack.clear();

            String str = br.readLine();

            if (str.length() % 2 == 1) {
                continue;
            }

            char[] arr = str.toCharArray();

            for (int k=0;k<arr.length;k++) {

                if (stack.isEmpty() || stack.peek() != arr[k]) {
                    stack.push(arr[k]);
                } else  {
                    stack.pop();
                }

                if (k == arr.length - 1 && stack.isEmpty()) {
                    total++;
                }
            }

        }

        System.out.println(total);
    }
}