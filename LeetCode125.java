package TwoPointers;

public class LeetCode125 {

	public static void main(String[] args) {
		LeetCode125 Object = new LeetCode125();
		
		
		String s = "A man, a plan, a canal: Panama";
		
		System.out.println(Object.ValidPalindrome(s));

	}
	public boolean ValidPalindrome(String s) {
		
		String l = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		
		int p1 = 0;
		int p2 = l.length()-1;
		
		while(p1<=p2) {
			
			if(l.charAt(p1) != l.charAt(p2)) {
				return false;
			}else {
				p1++;
				p2--;
			}
		}
		
		return true;
	}

}
