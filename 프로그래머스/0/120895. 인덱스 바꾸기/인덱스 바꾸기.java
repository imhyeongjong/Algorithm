class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] result = my_string.split("");
        String temp = result[num1];
        result[num1] = result[num2];
        result[num2] = temp;
        for(int i=0; i<result.length; i++){
            answer+=result[i];
        }
        return answer;
    }
}