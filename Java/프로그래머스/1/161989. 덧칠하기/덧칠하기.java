class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int visit = 0;
        for(int s: section) {
            if (s > visit) {
                visit = s + m - 1;
                ++answer;
            }
        }
        return answer;
    }
}