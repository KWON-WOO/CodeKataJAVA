class Solution {
    public int[] solution(long n) {
        int digit = 1;
        long max = 10;
        while(true) {
            if (n >= max){
                digit++;
                max *= 10;
            }else 
                break;
            
        }
        int[] answer = new int[digit];
        for (int i = 0; i < digit; i++) {
            answer[i] = (int)(n%10.0);
            n /=10;
        }
        return answer;
    }
}