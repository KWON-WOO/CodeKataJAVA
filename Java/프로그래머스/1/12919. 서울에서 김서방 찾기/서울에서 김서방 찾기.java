class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        for (String point: seoul) {
            if (point.equals("Kim"))
                return "김서방은 "+i+"에 있다";
            i++;
        }
        return "";
    }
}