package TwoPointers;

public class LeetCode42 {

	public static void main(String[] args) {
		LeetCode42 Object = new LeetCode42();
		
		int[] waterarray = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(Object.Trappingrainwater(waterarray));
	}
	public int Trappingrainwater(int[] waterarray) {
		
		int p1 = 0;
		int p2 = waterarray.length-1;
		int leftmax = 0;
		int rightmax = 0;
		int water = 0;
		
		while(p1 < p2) {
			if(waterarray[p1] <= waterarray[p2]) {
				leftmax = Math.max(leftmax,waterarray[p1]);
				water = water + leftmax-waterarray[p1];
				p1++;
			}else {
				rightmax = Math.max(rightmax,waterarray[p2]);
				water = water + rightmax-waterarray[p2];
				p2--;
			}
		}
		return water;
	}

}
