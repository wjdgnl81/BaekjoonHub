class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int length = common.length;
        int check = 0;
        int sequence = common[1]-common[0];
        int ratio = 0;
        if (common[0]!=0){
         ratio = common[1]/common[0];
        }
        if(common[2]-common[1]==sequence){
            check=1;
        }else if(common[2]/common[1]==ratio){
            check=0;
        }

        if(check==1){
            //등차수열일때
            answer=common[length-1]+sequence;
        }else if(check==0){
            //등비수열일때
            answer=common[length-1]*ratio;
        }
        return answer;
    }
}