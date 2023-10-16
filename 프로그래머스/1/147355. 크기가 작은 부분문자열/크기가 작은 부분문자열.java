class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long tArr = 0;
        int pLength = p.length();
        
        
        for (int i=0; pLength <= t.length(); i++) {
          tArr=Long.parseLong(t.substring(i, pLength));
            if (tArr<=Long.parseLong(p)){
                answer++;
            }
          pLength++;
        }
        
        return answer;
        
    }
}