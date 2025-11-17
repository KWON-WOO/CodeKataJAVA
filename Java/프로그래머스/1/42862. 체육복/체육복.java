import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        boolean [] checkLost = new boolean[lost.length];
        boolean [] checkReserve = new boolean[reserve.length];
      
        Arrays.sort(lost);
        Arrays.sort(reserve);

        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    checkLost[i] = true;
                    checkReserve[j] = true;
                    break;
                }
                    
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            if (checkLost[i]) continue;
            
            for (int j = 0; j < reserve.length; j++) {
                if (checkReserve[j]) continue;
                if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
                    checkLost[i] = true;
                    checkReserve[j] = true;
                    break;
                } 
            }
        }
        for (int i = 0; i < checkLost.length; i++) {
            if (checkLost[i]) ++answer;
        }
        return answer; 
    } 
}
