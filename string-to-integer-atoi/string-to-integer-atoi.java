class Solution {
    public static int myAtoi(String s) {
		s = s.trim();
		Boolean isNegative = false;
		if (s.startsWith("-")) {
			isNegative = true;
		}

		else {
			isNegative = false;
		}

		if (s.startsWith("+") || s.startsWith("-")) {
			s = s.substring(1, s.length());
		}

		char[] characters = s.toCharArray();

		String test = "";
		int countDigits = 0;

		f: for (char c : characters) {

			if (!Character.isDigit(c)) {
				break f;
			}

			else {
				countDigits++;
				test = test + c;
			}
		}

		if (isNegative) {
			test = "-" + test;
		}

		if (countDigits == 0) {
			return 0;
		}

		if (Double.valueOf(test) > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		if (Double.valueOf(test) < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (Integer.valueOf(test));

	}

}