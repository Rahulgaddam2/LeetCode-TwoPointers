package TwoPointers;

import java.util.Arrays;  // Import Arrays for printing the array

public class LeetCode977 {

    public static void main(String[] args) {
        LeetCode977 Object = new LeetCode977();
        
        int[] array = {-4, -1, 0, 3, 10};
        
        
        int[] finalArray = Object.SquaresofaSortedArray(array);
        
        
        System.out.println(Arrays.toString(finalArray));
    }

    public int[] SquaresofaSortedArray(int[] array) {
        int[] result = new int[array.length];

        
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }

        int p1 = 0;
        int p2 = array.length - 1;

        
        for (int j = result.length - 1; j >= 0; j--) {
            if (array[p1] > array[p2]) {
                result[j] = array[p1];
                p1++;
            } else {
            	if(array[p1] < array[p2])
                result[j] = array[p2];
                p2--;
            }
        }

        return result;
    }
}
