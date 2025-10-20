class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int result = 0;
        for (char num: Integer.toString(x).toCharArray()) {
            result += num - '0';
        }
        if (x % result != 0) answer = false;
        return answer;
    }
}