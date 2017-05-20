

/**
 * This solution runs in O(n) time, where n is the number of characters in the given string.
 * 
 * This solution ensures that the string given is all uppercase and accounts for the event
 * where the given string contains an invalid roman numeral character.
 * 
 * Leetcode: https://leetcode.com/problems/roman-to-integer/#/description
 */
public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> numbers = new HashMap<Character, Integer>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int sum = 0;
        
        for(char i : (s.toUpperCase()).toCharArray()) {
            if(numbers.get(i) != null) {
                sum += numbers.get(i);
            } else {
                throw new Exception("Invalid roman numeral character.");
                return 0;
            }
        }
        
        return sum;
        
    }
}