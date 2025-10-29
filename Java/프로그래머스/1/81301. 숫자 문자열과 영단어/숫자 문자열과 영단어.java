class Solution {
    
    public int solution(String s) {
        int checkNum;
        int checkNumStr;
        int result = 0;
        String num = "";
        
        for (int i = 0; i < s.length(); i++) {
            checkNumStr = transStr(num + s.charAt(i));
            
                if (checkNumStr == -1) {
                    checkNum = transChar(s.charAt(i)); 
                    if (checkNum >= 0) {
                        result = result * 10 + checkNum;  
                    } else num += s.charAt(i);
                } else {
                    result = result * 10 + checkNumStr;
                    num = "";
                } 
            
        }
        return result;
    }
    public int transChar(char c) {
        if (c <= '9') {
            return c - '0';
        }
        else return -1;
        
    }
    
    public int transStr(String s){
        int result = switch (s){
            case "zero" -> 0;
            case "one" -> 1;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            default -> -1;
        };
        return result;
    }
}