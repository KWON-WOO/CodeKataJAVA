class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {100,100,-1,-1};
        for (int i = 0; i < wallpaper.length; ++i) {
            for (int j =0; j < wallpaper[i].length(); ++j) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = answer[0] < i ? answer[0] : i;
                    answer[1] = answer[1] < j ? answer[1] : j;
                    answer[2] = answer[2] > i ? answer[2] : i+1;
                    answer[3] = answer[3] > j ? answer[3] : j+1;
                }
            }
        }
        return answer;
    }
}