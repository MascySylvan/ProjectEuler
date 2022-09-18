package euler.commons;

public class StringUtility {
	
	public static boolean isEmpty(String s) {
		if (s == null) {
			return true;
		} else if (s.length() == 0) {
			return true;
		}
		
		return false;
	}

	public static boolean isPalindrome(String s) {
		
		if (!isEmpty(s) ) {
			String s1 = s.toUpperCase();
			String s2 = "";
			
			for (int i = s1.length() - 1; i >= 0; i--) {
				s2 += s1.charAt(i);
			}
			
			return s1.equalsIgnoreCase(s2);
		}
		
		return false;
	}
}
