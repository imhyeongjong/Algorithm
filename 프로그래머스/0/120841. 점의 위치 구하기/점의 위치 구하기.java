class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int i=0;
        int j=1;
        if(dot[i]>0&&dot[j]>0){
            answer=1;
        }else if(dot[i]<0 && dot[j]>0){
            answer=2;
        }else if(dot[i]<0 && dot[j]<0){
            answer=3;
        }else if(dot[i]>0 && dot[j]<0){
            answer=4;
        }
        return answer;
    }
}