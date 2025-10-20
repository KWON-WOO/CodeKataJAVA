class Solution {
    public int solution(int num) {
        long data = num;
        int answer = 0;
        for (int i = 0; i < 500; i++){
            if (data == 1) return answer;
            data = data%2==0 ? data/2 : data * 3 + 1;
            answer++;
        }
        return -1;
    }
}