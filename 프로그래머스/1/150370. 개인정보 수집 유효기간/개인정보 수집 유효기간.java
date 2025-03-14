import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        // 오늘 날짜 일(day)로 변환
        String[] todayParts = today.split("\\.");   // 그냥 .을 쓰면 임의의 문자로 해석됨
        int todayDate = Integer.parseInt(todayParts[0]) * 12 * 28 + Integer.parseInt(todayParts[1]) * 28 + Integer.parseInt(todayParts[2]);
        
        // 약관 유효기간을 저장하는 Map 생성
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }
        
        // 유효기간 지난 개인정보 저장할 리스트
        List<Integer> expiredList = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] splitPrivacy = privacies[i].split(" ");
            String[] dateParts = splitPrivacy[0].split("\\.");
            int collectedDate = Integer.parseInt(dateParts[0]) * 12 * 28 + Integer.parseInt(dateParts[1]) * 28 + Integer.parseInt(dateParts[2]);
            String termType = splitPrivacy[1];
            
            // 해당 약관의 유효기간을 더하기
            int monthsToAdd = termMap.get(termType);
            int expiryDate = collectedDate + (monthsToAdd * 28);
            
            // 만약 유효기간이 지났다면 리스트에 추가
            if (expiryDate <= todayDate) {
                expiredList.add(i + 1);
            }
        }
        
        // 결과를 int 배열로 변환 후 반환
        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }
}