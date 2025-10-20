class Solution {
    public long solution(long n) {
        long answer = 0;
        String numStr = Long.toString(n);
        char[] num = numStr.toCharArray();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    swap(num,i,j);
                }
            }
        }
        answer = Long.parseLong(new String(num));
        return answer;
    }
    public void swap(char [] a, int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];
    }
}