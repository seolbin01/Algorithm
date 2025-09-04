class Solution {
    public String solution(String my_string, int[] indices) {
        char[] chars = my_string.toCharArray();
        
        for (int idx : indices) {
            chars[idx] = ' ';
        }
        
        return new String(chars).replace(" ", "");
    }
}
