import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>(); //<포켓몬 번호, 개수>
        for(int n : nums) map.put(n, map.getOrDefault(n,0)+1);
        
        int cnt = nums.length/2;
        
        if (map.size() > cnt) answer = cnt;
        else answer = map.size();
        
        return answer;
    }
}