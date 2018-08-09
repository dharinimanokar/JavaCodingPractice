package recursion;

public class CodingBatRecursion1SSolutions {
	public int factorial(int n) {
		if (n < 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;

		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {

		if (bunnies == 0)
			return 0;
		else {
			int sum = bunnies % 2 == 0 ? 3 : 2;
			return sum + bunnyEars2(bunnies - 1);
		}
	}

	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}

		return rows + triangle(rows - 1);
	}

	public int sumDigits(int n) {
		if (n / 10 == 0) {
			return n;
		}
		int sum = n % 10;
		;
		sum = sum + sumDigits(n / 10);
		return sum;
	}

	public int count7(int n) {
		if (n / 10 == 0 && n % 10 == 0) {
			return 0;
		}
		int counter = 0;
		if (n % 10 == 7) {
			counter++;
		}

		return counter + count7(n / 10);
	}

	public int count8(int n) {
		if (n != 8 && n % 8 == 0 && n / 8 == 0) {
			return 0;
		}
		int counter = 0;

		if (n % 10 == 8) {
			if ((n / 10) % 10 == 8)
				counter += 2;
			else
				counter++;
		}

		return counter + count8(n / 10);
	}

	public int powerN(int base, int n) {
		if (n == 1)
			return base;
		return base * powerN(base, n - 1);
	}

	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		int count = 0;
		if (str.substring(0, 1).equals("x")) {
			count++;
		}
		return count + countX(str.substring(1));
	}

	public int countHi(String str) {
		if (str.length() <= 1) {
			return 0;
		}
		int count = 0;
		if (str.substring(0, 2).equals("hi")) {
			count++;
		}
		return count + countHi(str.substring(1));
	}

	public String changeXY(String str) {
		if (str.contains("x")) {
			str = str.replaceFirst("x", "y");
			return changeXY(str);
		}
		return str;
	}

	public String changePi(String str) {

		if (str.contains("pi")) {
			str = str.replace("pi", "3.14");
			return changePi(str);
		} else
			return str;

	}

	public String noX(String str) {
		if (str.contains("x")) {
			str = str.replaceFirst("x", "");
			return noX(str);
		}
		return str;
	}

	public boolean array6(int[] nums, int index) {
		if (nums.length == 0) {
			return false;
		}
		if (index == nums.length)
			return false;

		if (nums[index] == 6)
			return true;

		return array6(nums, index + 1);
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length)
			return 0;
		int count = 0;
		if (nums[index] == 11) {
			count++;
		}
		return count + array11(nums, index + 1);

	}

	public boolean array220(int[] nums, int index) {
		/*
		 * if(index >= nums.length - 1) return false; if(nums[index] * 10 ==
		 * nums[index+1]) return true; return array220(nums, index + 1);
		 */

		if (index >= nums.length - 1)
			return false;
		if (nums[index] * 10 == nums[index + 1])
			return true;
		return array220(nums, index + 1);
	}

	public String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		if (str.length() <= 2) {
			return str.charAt(0) + "*" + str.charAt(1);
		}
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	public String pairStar(String str) {
		if (str.length() <= 1) {

			return str;
		}

		if (str.charAt(0) == str.charAt(1)) {

			return str.substring(0, 1) + "*" + pairStar(str.substring(1));
		}
		return str.substring(0, 1) + pairStar(str.substring(1));
	}

	public String endX(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.charAt(0) == 'x') {
			return endX(str.substring(1)) + 'x';
		}
		return str.charAt(0) + endX(str.substring(1));
	}

	public int countPairs(String str) {
		int count = 0;
		if (str.length() <= 2) {
			return count;
		}
		if (str.charAt(0) == str.charAt(2)) {
			count++;
		}
		return count + countPairs(str.substring(1));
	}

	public int countAbc(String str) {
		int count = 0;
		if (str.length() < 3)
			return 0;
		if (str.substring(0, 3).contains("abc")) {
			count++;

		} else if (str.substring(0, 3).contains("aba")) {
			count++;

		}
		return count + countAbc(str.substring(1));
	}

	public int count11(String str) {
		int count = 0;
		if (str.contains("11")) {
			count++;
			str = str.replaceFirst("11", "");
			return count + count11(str);
		} else
			return count;

	}

	public String stringClean(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String s = "";
		if (str.substring(0, 1).equals(str.substring(1, 2))) {
			str = str.replaceFirst(str.substring(0, 2), str.substring(1, 2));

		} else {
			s = str.substring(0, 1);
			str = str.substring(1);
		}

		return s + stringClean(str);
	}

	public int countHi2(String str) {
		int count = 0;
		if (!str.contains("hi")) {
			return count;
		}

		if (str.contains("hi")) {
			int index = str.indexOf("hi");
			if (index == 0 || str.charAt(index - 1) != 'x') {
				count++;
				str = str.replaceFirst("hi", "");
			}
			str = str.replaceFirst("xhi", "");

		}
		return count + countHi2(str);
	}

	public String parenBit(String str) {

		if (str.length() == 1)
			return str;
		if (str.substring(0, 1).equals("(")) {
			return str.substring(0, str.indexOf(")") + 1);
		} else {
			str = str.substring(1);
			return parenBit(str);

		}

	}

	public boolean nestParen(String str) {
		if (str.length() == 0) {
			return true;
		}

		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		}
		return false;

	}

	public int strCount(String str, String sub) {
		int count = 0;
		if (str.contains(sub)) {
			count++;
			str = str.replaceFirst(sub, "");
			return count + strCount(str, sub);

		}
		return count;
	}

	public boolean strCopies(String str, String sub, int n) {
		if (n <= 0)
			return true;
		if (str.length() < sub.length())
			return false;
		if (str.substring(0, sub.length()).equals(sub)) {
			return strCopies(str.substring(1), sub, n - 1);
		}

		return strCopies(str.substring(1), sub, n);
	}

	public int strDist(String str, String sub) {
		int stLen = str.length();
		int sbLen = sub.length();
		if (stLen < sbLen)
			return 0;
		if (str.substring(0, sbLen).equals(sub)) {
			if (str.substring(stLen - sbLen, stLen).equals(sub))
				return stLen;
			return strDist(str.substring(0, stLen - 1), sub);
		}
		return strDist(str.substring(1), sub);
	}

}
