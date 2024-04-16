class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String [] result = cipher.split("");
        
        for(int i=code-1; i<result.length; i+=code){
            answer+=result[i];
        }
        return answer;
    }
}