import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        
        // Count the frequency of each element in the array
        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        
        // Find the element that appears more than n / 2 times
        int n = nums.length;
        for (int key : res.keySet()) {
            if (res.get(key) > n / 2) {
                return key;
            }
        }
        
        return -1; // This line will never be reached if the input guarantees a majority element.
    }
}
