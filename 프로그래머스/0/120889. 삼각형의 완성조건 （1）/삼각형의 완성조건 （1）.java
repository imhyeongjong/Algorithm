import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int result=0;
        Arrays.sort(sides);
        
        for(int i=0; i<sides.length; i++){
            result=sides[0]+sides[1];
        }
        if(result==sides[2] || result<sides[2]){
            answer=2;
        }else{
            answer=1;
        }
        return answer;
    }
}