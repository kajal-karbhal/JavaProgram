package programs;

public class ReversString {

	public static void main(String[] args) {
		String str="Revers the string";
		String reversStr=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversStr=reversStr+str.charAt(i);
		}
		
		System.out.println(reversStr);
	}

}
