

/**
 * This solution runs in O(n) time, where n is the number of characters in the given string.
 * 
 * This solution ensures that the string given is all uppercase and accounts for the event
 * where the given string contains an invalid roman numeral character.
 * 
 * Leetcode: https://leetcode.com/problems/roman-to-integer/#/description
 */


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
        boolean skip = false;
        char[] roman = (s.toUpperCase()).toCharArray();
        for(int j = 0; j < s.length(); j++) {
            char i = roman[j];
            if(skip) {
                skip = false;
                continue;
            }
            
            if(numbers.get(i) != null) {
                if(i == 'I' && j+1 < s.length()) {
                    if(roman[j+1] == 'V') {
                        sum += 4;
                        skip = true;
                    } else if(roman[j+1] == 'X') {
                        sum += 9;
                        skip = true;
                    } else {
                        sum += 1;
                    }
                } else if(i == 'X' && j+1 < s.length()) {
                    if(roman[j+1] == 'L') {
                        sum += 40;
                        skip = true;
                    } else if(roman[j+1] == 'C') {
                        sum += 90;
                        skip = true;
                    } else {
                        sum += 10;
                    }
                } else if(i == 'C' && j+1 < s.length()) {
                    if(roman[j+1] == 'D') {
                        sum += 400;
                        skip = true;
                    } else if(roman[j+1] == 'M') {
                        sum += 900;
                        skip = true;
                    } else {
                        sum += 100;
                    }
                } else {
                    sum += numbers.get(i);
                }
            } else {
                System.out.println("Invalid roman numeral character detected.");
                return 0;
            }
        }
        return sum;       
    }
}