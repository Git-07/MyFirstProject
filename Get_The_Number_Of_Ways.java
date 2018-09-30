package Learning_Pattern_Package;

import java.util.Scanner;

public class Get_The_Number_Of_Ways {

	public static int getTheNumberOfWays(int number) {
		int divider = 3;
		int sum = 0;
		int i = 1;
		int temp = number;
		if (number > 2) {
			while (temp >=3) {
				
				temp = number - divider * i;
				sum = sum + (temp * i) + 1;
				i++;
			}
		} else {

			return 1;
		}
		return sum + 1;
	}
	
	public static void main(String[] ar){
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		System.out.println(getTheNumberOfWays(number));
	}
}
