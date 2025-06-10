import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();
        
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
