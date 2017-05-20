import java.util.*;

/**
    This solution uses a hashmap data-structure to check for duplicates.
    This solution runs in O(n) runtime, because we have to check each element in the array
    in the worst case.
    
    Accessing and modifying in a hashtable is a O(1) operation.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
    
    for(int i : nums) {
        if(numbers.get(i) == null) {
            numbers.put(i, 1);
        } else {
            return true;
        }
    }
    
    return false;

    }
}