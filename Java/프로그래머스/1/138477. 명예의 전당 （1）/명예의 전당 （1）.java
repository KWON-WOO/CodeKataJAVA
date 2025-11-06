import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hof = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            hof.add(score[i]);
            if (hof.size() > k) {
                hof.poll();
            }
            answer[i] = hof.peek();
        }

        return answer;
    }
}


//k번째 안에 들어야 명예의 전당에 오름
//k일까지는 모두가 올라감.
//k일 이후 k등 가수보다 점수가 높아야 전당 오름.
//