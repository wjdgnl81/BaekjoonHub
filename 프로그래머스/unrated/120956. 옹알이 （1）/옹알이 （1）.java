import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String arr = "(aya|ye|woo|ma)*";
        
        for(int i =0; i<babbling.length; i++){
            if(babbling[i].matches(arr)){
                answer += 1;
            }
        }
        
        return answer;
    }
}