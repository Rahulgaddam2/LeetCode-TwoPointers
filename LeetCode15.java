package TwoPointers;

import java.util.*;

public class LeetCode15 {

	public static void main(String[] args) {
		LeetCode15 Object = new LeetCode15();
		int[] array = {3,0,-2,-1,1,2};
		
		System.out.println(Object.threesum(array));
		

	}
	public List<List<Integer>> threesum(int[] array){
		
		if(array == null || array.length < 3) {
			return new ArrayList<>();
		}
		
		Arrays.sort(array);
		Set<List<Integer>> result = new HashSet<>();
		
		for(int i=0; i<array.length-2;i++) {
			int p1=i+1;
			int p2=array.length-1;
			
			int sum = array[i] + array[p1] + array[p2];
			
			while(p1<p2) {
				if(sum == 0) {
					result.add(Arrays.asList(array[i],array[p1],array[p2]));
					p1++;
					p2--;
				}else if(sum < 0) {
					p1++;
				}else {
					p2--;
				}
			}
		}
		
		return new ArrayList<>(result);
	}

}
