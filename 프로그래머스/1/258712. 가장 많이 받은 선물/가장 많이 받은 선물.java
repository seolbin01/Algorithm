import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        int[] giftNum = new int[friends.length];   // 선물 지수
        int[][] giftTable = new int[friends.length][friends.length];   // 주고받은 선물 2차원 배열로 나열
        
        for(String gift : gifts) {
            String[] arr = gift.split(" ");
            
            for(int i=0;i<friends.length;i++){
                if(arr[0].equals(friends[i])){
                    giftNum[i]++;
                    giftTable[i][Arrays.asList(friends).indexOf(arr[1])]++;
                } else if(arr[1].equals(friends[i])){
                    giftNum[i]--;
                }
            }
        }
        
        int[] giftNext = new int[friends.length];

        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                if(i == j) continue;
                
                if(giftTable[i][j] > giftTable[j][i]){
                    giftNext[i]++;
                } else if(giftTable[i][j] == giftTable[j][i]) {
                    if(giftNum[i] > giftNum[j]) {
                        giftNext[i]++;
                    }
                }
            }
        }
        
        int max = 0;
        
        for(int n : giftNext) {
            max = Math.max(max, n);
        }
        
        answer = max;
        
        return answer;
    }
}