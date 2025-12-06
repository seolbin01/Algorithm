import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        int bombLength = bomb.length();

        for (char c : str.toCharArray()) {
            stack.push(c);

            if (stack.size() >= bombLength) {
                boolean isBomb = true;

                for (int i=0;i<bombLength;i++) {
                    if (stack.get(stack.size() - bombLength + i) != bomb.charAt(i)) {
                        isBomb = false;
                        break;
                    }
                }

                if (isBomb) {
                    for (int i=0;i<bombLength;i++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        if (result.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(result.toString());
        }
    }
}
