import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st;
        String cmd = "";
        int num;
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    System.out.println(stack.empty() ? -1 : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(stack.empty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}