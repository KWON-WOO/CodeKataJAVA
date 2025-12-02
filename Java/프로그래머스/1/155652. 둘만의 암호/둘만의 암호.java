import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        char[] answer = new char[s.length()];
        Set<Character> skipSet = new HashSet<>();
        int count;
        int answerChar;
        for (char c: skip.toCharArray()) {
            skipSet.add(c);
        }
        
        for (int i = 0; i < s.length(); ++i) {
            count = 0;
            answerChar = s.charAt(i);
            while(count < index) {
                ++answerChar;
                if (answerChar > 'z') answerChar -= 26;
                if(!skipSet.contains((char)answerChar)) ++count;
            }
            answer[i] = (char)answerChar;
        }
        return String.valueOf(answer);
    }
}