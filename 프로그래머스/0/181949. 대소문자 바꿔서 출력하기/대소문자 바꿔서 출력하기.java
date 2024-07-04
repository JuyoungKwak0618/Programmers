import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
      char[] b = a.toCharArray();
		String str = "";
		for(int i = 0; i < b.length; i++) {
			if(Character.isUpperCase(b[i])) {
				str += Character.toLowerCase(b[i]);
			} else {
				str += Character.toUpperCase(b[i]);
			}
			
		}
		System.out.println(str);
	}
}
