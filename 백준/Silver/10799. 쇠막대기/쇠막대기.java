import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = br.readLine();

            Stack<Character> stack = new Stack<>();

            char past = ' ';
            for (char c : str.toCharArray()) {
                if (c == '(') stack.push(c);
                else {
                    stack.pop();
                    if(past == '(') {
                        count += stack.size();
                    } else {
                        count += 1;
                    }
                }
                past = c;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }
}