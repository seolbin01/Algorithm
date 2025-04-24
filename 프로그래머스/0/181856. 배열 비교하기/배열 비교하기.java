class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int length1 = arr1.length;
        int length2 = arr2.length;
        
        if (length1 == length2) {
            int sum1 = 0;
            int sum2 = 0;
            
            for (int i=0;i<length1;i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            
            if (sum1 == sum2) {
                answer = 0;
            } else {
                answer = sum1 > sum2 ? 1 : -1;
            }
            
        } else {
            answer = length1 > length2 ? 1 : -1;
        }
        
        return answer;
    }
}