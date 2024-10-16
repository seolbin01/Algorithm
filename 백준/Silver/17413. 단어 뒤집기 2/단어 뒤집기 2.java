import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        boolean chk = true;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {

            if(c == '<') {

                if(!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    stack = new Stack<>();
                }

                chk = false;
                sb.append(c);
                continue;
            } else if(c == '>') {
                chk = true;
                sb.append(c);
                continue;
            }

            if(chk) {
                if (c != ' ') {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    stack = new Stack<>();
                }
            } else {
                sb.append(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}