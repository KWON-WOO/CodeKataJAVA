class Solution {
    public int solution(int n) {
        String str = "";
        int answer = 0;
        int count = 1;
        while (n > 0) {
            str = (n % 3) + str;
            n /= 3;
        }
        
        for (char num: str.toCharArray()){
            answer += (num - '0') * count;
            count *= 3;
        }
        return answer;
    }
}