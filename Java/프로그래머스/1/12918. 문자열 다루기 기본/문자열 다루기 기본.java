class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (!(s.length()== 4 || s.length() == 6))
            return false;
        char[] charArr = s.toCharArray();
        for (char character: charArr) {
            if (!(character <= '9' && character >= '0')) {
                return false;
            }
        }
        return true;
    }
}