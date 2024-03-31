import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        double result = Math.sqrt(n);
        result = (int) result;
        
        if(n%result==0){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}