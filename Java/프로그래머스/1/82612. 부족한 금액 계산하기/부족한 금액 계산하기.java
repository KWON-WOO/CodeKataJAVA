class Solution {
    public long solution(int price, int money, int count) {
        long result = money;
        long answer;
        for (int i = 1; i <= count; i++) {
            result -= (price * i);
        }
        if (result >= 0) return 0;
        else answer = -(result);
        return answer;
    }
}