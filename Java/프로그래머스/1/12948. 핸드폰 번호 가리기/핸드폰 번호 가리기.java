class Solution {
    public String solution(String phone_number) {
        char[] charArr = phone_number.toCharArray();
        for (int i = 0; i < charArr.length - 4; i++) {
            charArr[i] = '*';
        }
        String answer = String.valueOf(charArr);
        return answer;
    }
}