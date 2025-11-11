class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int result;
        int num;
        int count;
        for (int i = 2; i <= number; i++) {
            num = i;
            count = 0;
            result = 1;
            for (int j = 2; num != 1;) {
                if (num % j == 0) {
                    ++count;
                    num /= j;
                } else {
                    ++j;
                    result *= (count + 1);
                    count = 0;
                }
            }
            result *= (count + 1);
            answer += result > limit ? power : result;
        }
        return answer;
    }
}