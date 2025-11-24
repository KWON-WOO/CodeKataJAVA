class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int keyChar = 0;
        char[] str = s.toCharArray();
        for (char c: str) {
            if (count == 0) keyChar = c;
            count += keyChar == c ? 1 : -1;
            if (count == 0) answer++;
        }
        return count != 0 ? answer + 1 : answer;
    }
}