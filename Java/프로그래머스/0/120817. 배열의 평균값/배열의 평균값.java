class Solution {
    public double solution(int[] numbers) {
        int count = 0;
        double answer = 0;
        for (int number:numbers) {
            answer += number;
            count++;
        }
        return answer/count;
    }
}