import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String[] words = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            for (int i = 0; i < morse.length; i++) {
                if (w.equals(morse[i])) {
                    sb.append((char) (i + 'a'));
                    break;
                }
            }
        }

        return sb.toString();
    }
}
