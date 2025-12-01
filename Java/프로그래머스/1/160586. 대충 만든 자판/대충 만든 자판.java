class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; ++i) {
            char[] target = targets[i].toCharArray();
            answer[i] = returnResult(keymap, target);
        }
        return answer;
    }
    
    public int returnResult(String[] keyMap, char[] target){
        int result = 0;
        int min;
        boolean flag;
        for (int i = 0; i < target.length; ++i) {
            flag = false;
            min = 1000;
            for(int j = 0; j < keyMap.length; ++j) {
                char[] key = keyMap[j].toCharArray();
                for (int k = 0; k < key.length; ++k) {
                    
                    if (key[k] == target[i]) {
                        flag = true;
                        min = Math.min(min, k + 1);
                    }
                }
            }
            if (!flag) return -1;
            result += min;
        }
        return result;
    }
}