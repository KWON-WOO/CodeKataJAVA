class Solution {
    public double solution(int[] arr) {
        int count = 0;
        double answer = 0;
        for (int num: arr) {
            answer += num;
            count++;
        }
        return answer/count;
    }
}