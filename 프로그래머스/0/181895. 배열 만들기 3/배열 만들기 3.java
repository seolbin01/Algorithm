import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new LinkedList<>();
        
        for (int[] a : intervals) {
            for (int i=a[0];i<=a[1];i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}