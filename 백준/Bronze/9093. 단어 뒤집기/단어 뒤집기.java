import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                for(char c : st.nextToken().toCharArray()) {
                    stack.push(c);
                }
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
            if(i != T-1) sb.append('\n');
        }

        System.out.println(sb);
    }
}