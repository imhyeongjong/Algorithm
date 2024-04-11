import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int num = numbers.length;
        Arrays.sort(numbers);
        return numbers[0]*numbers[1] > numbers[num-1]*numbers[num-2] ? numbers[0]*numbers[1] : numbers[num-1]*numbers[num-2];
    }
}