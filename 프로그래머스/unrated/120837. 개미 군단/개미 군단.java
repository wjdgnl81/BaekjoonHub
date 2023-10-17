class Solution {
    public int solution(int hp) {
        int answer = 0;
        int gen = 5;
        int ser = 3;
        int pri = 1;
        int g_d = hp%gen;
        int s_d = g_d%ser;
        
        answer = (hp/gen)+(g_d/ser)+(s_d/pri);
        
        return answer;
    }
}