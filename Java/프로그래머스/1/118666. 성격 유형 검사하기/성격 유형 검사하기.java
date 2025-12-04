class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] result = new int[]{0, 0, 0, 0};
        for (int i = 0; i < choices.length; ++i) {
            if (survey[i].contains("R")){
                result[0] += resultOfChoice(survey[i], 'R', choices[i]);
            } else if (survey[i].contains("C")){
                result[1] += resultOfChoice(survey[i], 'C', choices[i]);
            } else if (survey[i].contains("J")){
                result[2] += resultOfChoice(survey[i], 'J', choices[i]);
            } else {
                result[3] += resultOfChoice(survey[i], 'A', choices[i]);
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