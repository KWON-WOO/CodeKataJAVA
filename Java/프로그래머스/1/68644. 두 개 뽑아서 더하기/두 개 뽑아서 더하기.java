import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length * (numbers.length -1) / 2];
        int index = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer[index++] = numbers[i] + numbers[j];
            }
        }
        return Arrays.stream(answer).sorted().distinct().toArray();
    }
}