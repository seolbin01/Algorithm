import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        Arrays.sort(arr);

        Map<Character, Integer> hm = new HashMap<>();

        for (char c : arr) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = new TreeSet<>(hm.keySet());

        int count = 0;
        boolean chk = true;

        String temp;

        if (arr.length % 2 == 0) {
            for (char key : keySet) {

                if (hm.get(key) % 2 == 1) {
                    chk = false;
                    break;
                }
                sb.append(String.valueOf(key).repeat(hm.get(key)/2));
            }

            if (chk) {
                temp = sb.reverse().toString();
                sb.reverse();
                sb.append(temp);
            }

        } else {
            char middle = 0;

            for (char key : keySet) {

                if (hm.get(key) % 2 == 1) {
                    if (count == 0) {
                        count++;
                        middle = key;
                    } else {
                        chk = false;
                        break;
                    }
                }

                sb.append(String.valueOf(key).repeat(hm.get(key)/2));
            }
            
            if (chk) {
                temp = sb.reverse().toString();
                sb.reverse();
                sb.append(middle);
                sb.append(temp);
            }
        }

        if (chk) {
            System.out.println(sb);
        } else {
            System.out.println("I'm Sorry Hansoo");
        }
    }
}