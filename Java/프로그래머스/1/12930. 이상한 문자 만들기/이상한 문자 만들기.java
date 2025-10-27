class Solution {
    public String solution(String s) {
        String answer;
        char[] charStr = s.toCharArray();
        int index = 0;
        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] >= 'a') {
                if (index % 2 == 0) {
                    charStr[i] = upperAlphabet(charStr[i]);
                }
                index++;
            } else if (charStr[i] >= 'A') {
                if (!(index % 2 == 0)) {
                    charStr[i] = lowerAlphabet(charStr[i]);
                }
                index++;
            } else index = 0;
        }   
        answer = String.valueOf(charStr);
        return answer;
    }
    
    public char upperAlphabet(char a) {
        return (char)((int)a - 32);
    }
    
    public char lowerAlphabet(char a) {
        return (char)((int)a + 32);
    }
}

// a = 97
// A = 65
// a -> A = -32