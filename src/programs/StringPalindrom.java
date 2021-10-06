package programs;

public class StringPalindrom {

	public static void main(String[] args) {
		System.out.println("aaa is palindrom "+isPalindrom("aaa"));
		System.out.println("abc is palindrom "+isPalindrom("abc"));
		System.out.println("Baba is palindrom "+isPalindrom("Baba"));
		System.out.println("aba is palindrom "+isPalindrom("aba"));


	}

	private static boolean isPalindrom(String text) {
		String reverse=reverse(text);
		if(text.equals(reverse)) {
			return true;
		}

		return false;
	}

	private static String reverse(String input) {
		if(input==null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
	}

}
