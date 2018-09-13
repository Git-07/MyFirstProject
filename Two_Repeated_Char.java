package Learning_Pattern_Package;

import java.util.Scanner;

public class Two_Repeated_Char {
	// among the repeated characters remove one from the String
	public static void main(String[] args) {
		try {			
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			int count = 1;
			int counter = 0;
			int i = 0;
			char[] ch = s.toCharArray();
			while (count < ch.length) {

				if (ch[count] == ch[count - 1]) {
					counter++;
				} else if (ch[count - 1] != ' ') {
					System.out.print(ch[count - 1]);
				}
				if (counter == 1) {
					System.out.print(ch[count]);
					ch[count] = ' ';
					counter = 0;
				}
				count++;
			}
			if (ch[ch.length - 1] != ch[ch.length - 2]) {
				System.out.print(ch[ch.length - 1]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
