class Solution {
    public String solution(String s, int n) {
        char[] charStr = s.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            charStr[i] = caesar(charStr[i], n);
        }
        String answer = String.valueOf(charStr);
        return answer;
    }
    public char caesar(char c, int n) {
        int lowerLimit = 'z';
        int upperLimit = 'Z';
        int result = c + n;
        if (c >= 'a'){
            result = result > lowerLimit ? result - lowerLimit + 'a' - 1 : result;
        } else if (c >= 'A'){
            result = result > upperLimit ? result - upperLimit + 'A' - 1: result;
        } else result = c;
        return (char)result;
    }
}