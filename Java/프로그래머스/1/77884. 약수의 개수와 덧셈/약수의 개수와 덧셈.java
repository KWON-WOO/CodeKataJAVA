class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int temp;
        for (int i = left; i <= right; i++) {
            temp = 1;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) temp++;
            }
            answer += temp % 2 == 0 ? i: -i;
        }
        return answer;
    }
}