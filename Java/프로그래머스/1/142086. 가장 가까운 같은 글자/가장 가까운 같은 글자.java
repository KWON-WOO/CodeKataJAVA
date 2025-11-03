class Solution {
    public int[] solution(String s) {
        char[] charStr = s.toCharArray();
        int[] answer = new int[s.length()];
        int count;
        for (int i = charStr.length - 1; i >= 0; --i) {
            count = 0;
            for (int j = i - 1; j >= 0; j--) {
                count++;
                if (charStr[i] == charStr[j]){
                    answer[i] = count;
                    break;
                }
            }
            answer[i] = answer[i] == 0 ? -1 : answer[i];
        }
        return answer;
    }
}