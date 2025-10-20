class Solution {
    public int solution(int num) {
        long data = num;
        int answer = 0;
        int i = 0;
        while(true){
            if (i == 500) {
                answer = -1;
                break;
            }
            else if (data == 1) break;
            else{
                if (data % 2 == 0)
                    data /= 2;
                else
                    data = data * 3 + 1;
                answer++;
                i++;
            }
        }
        return answer;
    }
}