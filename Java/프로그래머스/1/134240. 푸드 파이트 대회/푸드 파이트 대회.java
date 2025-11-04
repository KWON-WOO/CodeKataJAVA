class Solution {
    public String solution(int[] food) {
        int cal = 1;
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer += String.valueOf(cal);
            }
            cal++;
        }
        answer += '0';
        for (int i = answer.length() - 2; i >= 0; i--) {
            answer += answer.charAt(i);
        }
        
        return answer;
    }
}