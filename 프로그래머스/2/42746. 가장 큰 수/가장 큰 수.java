import java.util.*;

class Solution {
    public String solution(int[] numbers) {
       StringBuilder answer = new StringBuilder();
        
       String[] nums = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 붙였을 때 크기 비교
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        if (nums[0].equals("0")) {
            return "0";
        }

        for (String s : nums) {
            answer.append(s);
        }

        return answer.toString();
    }
}