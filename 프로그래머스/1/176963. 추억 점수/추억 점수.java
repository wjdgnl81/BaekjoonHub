class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int sum=0;
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            String[] inPhoto = photo[i];
            for(int j = 0; j<inPhoto.length; j++){
                for (int k =0; k< name.length; k++){
                    if (photo[i][j].equals(name[k])){
                        sum += yearning[k];
                    }
                }
            }
                answer[i]=sum;
                sum=0;
        }
        
        return answer;
    }
}