import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
    
        boolean[] chk = new boolean[n+1];
        
        for (int i=1;i<=n;i++) {
            chk[i] = true;
        }
        
        TreeSet<Integer> lostSet = new TreeSet<>();
        for (int i : lost) {
            lostSet.add(i);
            chk[i] = false;
        }
        
        Set<Integer> resSet = new HashSet<>();
        for (int i : reserve) {
            if (!lostSet.contains(i)) {
                resSet.add(i);
                lostSet.remove(i);
            }
            chk[i] = true;
        }
        
        for (int lo : List.copyOf(lostSet)) {
            if (resSet.contains(lo-1)) {
                chk[lo] = true;
                lostSet.remove(lo);
                resSet.remove(lo-1);
            } else if (resSet.contains(lo+1)) {
                chk[lo] = true;
                lostSet.remove(lo);
                resSet.remove(lo+1);
            }
        }
        
        for (int i=1;i<=n;i++) {
            if (chk[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}