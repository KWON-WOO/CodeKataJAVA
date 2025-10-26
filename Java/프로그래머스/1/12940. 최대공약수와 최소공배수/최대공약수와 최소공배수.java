class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int num1 = n;
        int num2 = m;
        
        for (int i = 1; i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                answer[0] = i;
            }
        }
        
        while (true) {
            if (num1 > num2) num2 += m;
            else if (num1 < num2) num1 += n;
            else {
                answer[1] = num1;
                break;
            }
        }
        return answer;
    }
}