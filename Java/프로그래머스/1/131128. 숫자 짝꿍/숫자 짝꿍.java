import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        char[] charX = X.toCharArray();
        char[] charY = Y.toCharArray();
        
        Arrays.sort(charX);
        Arrays.sort(charY);
        
        X = new String(charX);
        Y = new String(charY);
        
        int indexX = 0;
        int indexY = 0;
        
        int countX;
        int countY;
        
        for (int i = '0'; i <= '9'; i++) {
            countX = indexX;
            countY = indexY;
            
            indexX = returnIndex((char)i, X, indexX);
            indexY = returnIndex((char)i, Y, indexY);
           
            countX = indexX - countX;
            countY = indexY - countY;
            
            answer = String.valueOf((char)i).repeat(countX < countY?countX:countY) + answer;
        }
        if (answer.equals("")) return "-1";
        if (answer.charAt(0)=='0') return "0";
        return answer;
    }
    public int returnIndex(char c, String str, int index) {
        int count = 0;
        for (int i = index; i < str.length(); i++) {
            if (c == str.charAt(index+count)) count++;
            else break;
        }
        return index+count;
    }
}
// 0 = 48