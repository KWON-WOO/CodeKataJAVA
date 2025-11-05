class Solution {
    public int solution(int a, int b, int n) {
        return returnValue(n,a,b,0);
    }
    
    //result = 반환받은 콜라 수
    public int returnValue(int num, int a, int b, int result) {
        int r = (num / a) * b;
        if (r != 0) {
            result = returnValue((num % a) + r, a , b, result + r);
        }
        return result;
    }
}
//n은 빈병 수
//a : b 비율로 변환.
//result는 반환받은 콜라 수