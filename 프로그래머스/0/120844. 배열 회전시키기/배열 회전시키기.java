class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];

        if (direction.equals("right")) {
            answer[0] = numbers[len - 1];
            for (int i = 1; i < len; i++) {
                answer[i] = numbers[i - 1];
            }
        } else if (direction.equals("left")) {
            for (int i = 0; i < len - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[len - 1] = numbers[0];
        }

        return answer;
    }
}
