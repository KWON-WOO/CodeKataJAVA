class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        for (int lotto: lottos) {
            for (int win_num: win_nums) {
                if (lotto==win_num) {
                    --answer[0];
                    --answer[1];
                    break;
                } else if (lotto==0) {
                    --answer[0];
                    break;
                }
            }
        }
        answer[0] = answer[0]== 7? 6: answer[0];
        answer[1] = answer[1]== 7? 6: answer[1];
        return answer;
    }
}