
/**
  * Problem: Given an array of integers, every element appears twice except for one. Find that single one.
  * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
  *
  * Solution:
  * this's my logic: 
  * we need to find the single one, we can use HashMap<Integer, Integer> to store the frequency of each element, 
  * when the frequencies of one item is 2, we delete this key from HashMap. 
  * After we finish scanning the array, there's only one entry in the HashMap, the key of this entry is answer.
  * The time complexity is O(n), space complexity is O(n).
  * 
  * How else we can do?
  * From basic bit operation, a ^ a = 0, a ^ 0 = a.
  * If there's only one element appears once, then if let a[0]^a[1]^...a[n-1], the twice of elements will become 0,
  * this operation result is our answer.
  */
  
  
public class Solution {
    public int singleNumber(int[] A) {
        // we know, a^a == 0
        int len = A.length;
        if (len < 1)
            return -1;
        for (int i = 1; i < len; i++)
            A[0] = A[0]^A[i];
        return A[0];
    }
}
