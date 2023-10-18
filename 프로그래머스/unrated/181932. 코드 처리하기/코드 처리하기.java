class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        int mod = 0;
        
        for(int i=0; i<code.length(); i++){
            char codeChar = code.charAt(i);
            if(mod==0){
                if(codeChar=='1'){
                    mod=1;
                    continue;
                }else{
                    if(i%2==0){
                    ret+=codeChar;
                    }
                }
            }else if(mod==1){
                if(codeChar=='1'){
                    mod=0;
                    continue;
                }else{
                    if(i%2!=0){
                    ret+=codeChar;
                    }
                }               
            }
        }
        if(ret==""){
            ret="EMPTY";
        }
        answer=ret;
        return answer;
    }
}