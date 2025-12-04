class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] types = {'R','C','J','A'};
        int[] result = new int[]{0, 0, 0, 0};
        for (int i = 0; i < choices.length; ++i) {
            for (int j = 0; j < types.length; ++j) {
                if (survey[i].contains(String.valueOf(types[j]))){
                    result[j] += resultOfChoice(survey[i], types[j], choices[i]);
                    break;
                }
            }
        }
        
        answer += result[0] >= 0 ? "R" : "T";
        answer += result[1] >= 0 ? "C" : "F";
        answer += result[2] >= 0 ? "J" : "M";
        answer += result[3] >= 0 ? "A" : "N";
        
        return answer;
    }
    public int resultOfChoice(String str, char c, int num){
        if (str.charAt(0) == c) return 4 - num;
        return num - 4;
    }
}