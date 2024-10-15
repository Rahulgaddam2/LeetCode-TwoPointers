package TwoPointers;

public class LeetCode11 {

	public static void main(String[] args) {
		
		LeetCode11 Object = new LeetCode11();
		
		int[] array = {1,8,6,2,5,4,8,3,7};
		
		System.out.println(Object.Containerwithmostwater(array));

	}
	public int Containerwithmostwater(int[] array) {
		
		int p1 = 0;
		int p2 = array.length-1;
		int max = 0;
		
		while(p1<p2) {
			
			int area = Math.min(array[p1], array[p2]) * (p2-p1);
			max = Math.max(max, area);
			
			if(array[p1] < array[p2]) {
				p1++;
			}else {
				p2--;
			}
		}
		return max;
	}

}
