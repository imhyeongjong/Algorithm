class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] result = my_string.split("");
        for(int i=0; i<result.length; i++){
            if(result[i]==result[i].toUpperCase()){
                answer+=result[i].toLowerCase();
            }else{
                answer+=result[i].toUpperCase();
            }
        }
        return answer;
    }
}