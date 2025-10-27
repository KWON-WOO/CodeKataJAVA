class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        long pNum = Long.parseLong(p);
        char[] charStr = t.toCharArray();
        for (int i = 0; i < charStr.length - pSize + 1; i++) {
            String testNum = t.substring(i,i +pSize);
            if (Long.parseLong(testNum) <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}