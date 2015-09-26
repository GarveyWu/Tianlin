package Mr;

import java.util.Scanner;

public class StringReorder {

	public static void main(String[] args) {

		int len = 36;
		int[] num = new int[len];
		char charset[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
				'y', 'z' };
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			for (int k = 0; k < len; k++) {
				num[k] = 0;
			}
			boolean flat = false;
			String input = in.nextLine();
			int length = input.length();
			for (int i = 0; i < length; i++) {
				char ch = input.charAt(i);
				if (ch >= '0' && ch <= '9') {
					num[ch - '0']++;
				} else if (ch >= 'a' && ch <= 'z') {
					num[ch - 'a' + 10]++;
				} else {
					flat = true;
					break;
				}
			}
			if (flat) {
				System.out.println("<invalid input string>");
				continue;
			}
			int i = 0;
			while (length > 0) {
				if (i > 35)
					i %= 36;
				if (num[i] > 0) {
					System.out.print(charset[i]);
					num[i]--;
					length--;
				}
				i++;
			}
			System.out.println();
		}
	}
}