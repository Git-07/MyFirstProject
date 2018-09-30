package Learning_Pattern_Package;

public class Get_The_Minimum_Index {
	public static int getTheIndex(int[] answers) {
		int l = 0, j = -1;
		while (l < answers.length) {
			int mark1 = 0, mark2 = 0;
			for (int i = 0; i <= j; i++) {

				if (answers[i] == 1) {
					mark1 = mark1 + 1;
				} else {
					mark1 = mark1 - 1;
				}
			}
			for (int k = j + 1; k < answers.length; k++) {
				if (answers[k] == 1) {
					mark2 = mark2 + 1;
				} else {
					mark2 = mark2 - 1;
				}
			}
			if (mark1 > mark2) {
				break;

			} else if (mark1 <= mark2) {
				l++;
				j++;
			}
			System.out.println(mark1);
			System.out.println(mark2);
		}

		return j;
	}

	public static void main(String[] args) {
		int[] answers = { 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		System.out.println(getTheIndex(answers));
	}

}
