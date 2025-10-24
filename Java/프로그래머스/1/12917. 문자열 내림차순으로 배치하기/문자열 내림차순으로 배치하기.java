import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char []charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length; i++){
            answer += charArr[charArr.length - i - 1];
        }
        return answer;
    }
}