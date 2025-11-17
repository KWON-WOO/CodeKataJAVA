import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int [] students = new int[n];
        
        
        
        for (int i = 0; i < n; i++) {
            students[i] = 0;
        }
        
        for (int l: lost) {
            --students[l - 1];    
        }
        
        for (int r: reserve) {
            ++students[r - 1];    
        }

        for (int l = 0; l < n; l++) {
            if (students[l] == -1){
                if (l - 1 >= 0 && students[l - 1] >= 1) {
                    --students[l - 1];
                    ++students[l];
                } else if (l + 1 < n && students[l + 1] >= 1) {
                    ++students[l];
                    --students[l + 1];
                } else --answer;
            }
        }
        return answer; 
    } 
}
