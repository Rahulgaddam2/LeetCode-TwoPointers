package TwoPointers;

import java.util.Arrays;

public class LeetCode167 {

    public static void main(String[] args) {
        LeetCode167 Object = new LeetCode167();
        
        int[] array = {2, 7, 11, 15};
        int target = 9;
        
        int[] finalarray = Object.Twosum(array, target);
        
        System.out.println(Arrays.toString(finalarray));
    }

    public int[] Twosum(int[] array, int target) {
        
        int p1 = 0;
        int p2 = array.length - 1;
        
        
        while (p1 < p2) {
            int sum = array[p1] + array[p2];
            
            if (sum == target) {
                return new int[] {p1, p2}; 
            } 
            else if (sum > target) {
                p2--; 
            } 
            else {
                p1++; 
            }
        }
        
        return new int[] {}; 
    }
}
