import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true){
                boolean chk = true;
                Stack<Character> stack = new Stack<>();
                String str = br.readLine();

                if(str.equals(".")) break;

                for(int j=0;j<str.length();j++){
                    if(str.charAt(j) == '('){
                        stack.push('(');
                    }
                    else if(str.charAt(j) == '['){
                        stack.push('[');
                    }
                    else if(str.charAt(j) == ')'){
                        if(!stack.isEmpty() && stack.peek() == '('){
                            stack.pop();
                        }
                        else{
                            chk = false;
                            break;
                        }
                    }
                    else if(str.charAt(j) == ']'){
                        if(!stack.isEmpty() && stack.peek() == '['){
                            stack.pop();
                        }
                        else{
                            chk = false;
                            break;
                        }
                    }
                }
                if(!stack.isEmpty()) chk = false;

                if(chk) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}