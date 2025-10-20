class Solution {
    public long solution(int a, int b) {
        int min;
        int max;
        long answer = 0;
        
        if (a < b){
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
            
            
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}