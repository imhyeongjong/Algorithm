import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] my = my_string.split("");
        int[] answer = new int [my.length];
        
        for(int i=0; i<my.length; i++){
            answer[i]=Integer.parseInt(my[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}