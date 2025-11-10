class Solution {
    public int[] solution(int[] answers) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] numbers3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (numbers1[i%(numbers1.length)] == answers[i])count1++;
            if (numbers2[i%(numbers2.length)] == answers[i])count2++;
            if (numbers3[i%(numbers3.length)] == answers[i])count3++;
        }
        int max = Math.max(Math.max(count1, count2),count3);
        int max_count = 0;
        
        if (count1 == max) max_count++;
        if (count2 == max) max_count++;
        if (count3 == max) max_count++;
        
        int[] answer = new int[max_count];
        int index = 0;
        
        if (count1 == max) answer[index++] = 1;
        if (count2 == max) answer[index++] = 2;
        if (count3 == max) answer[index++] = 3;
        
        return answer;
    }
}