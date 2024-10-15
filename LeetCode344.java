package TwoPointers;

public class LeetCode344 {

	public static void main(String[] args) {
		LeetCode344 Object = new LeetCode344();
		
			
		char[] s = {'l','u','h','a','r'};
		
		Object.ReverseString(s);
		
		System.out.println(s);
		
		

	}
	public void ReverseString(char[] s) {
		
		
		
		int length = s.length;
		
		for(int i=0; i<length/2; i++) {
			char temp = s[i];
			s[i] = s[length - i - 1];
			s[length - i - 1] = temp;
		}
	}

}
