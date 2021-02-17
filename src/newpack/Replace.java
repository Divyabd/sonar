package newpack;

import util.ScannerValidate;

public class Replace {

	public static void main(String[] args) {
		String str = ScannerValidate.getString();

		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == '*' || arr[j] == '*') {
				} else if (str.charAt(j) == str.charAt(i)) {
					arr[j] = '*';
					break;
				} else {
				}

			}
		}
		for (int s = 0; s < str.length(); s++) {
			System.out.print(arr[s]);
		}

	}

}
