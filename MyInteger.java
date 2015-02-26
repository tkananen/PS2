package MainPackage;
import java.lang.Integer;

public class MyInteger {
// This was all testing to ensure that the program works as it is supposed to.  Feel free to uncomment and run.
//  public static void main(String[] args) {
//		MyInteger integer2 = new MyInteger(2);
//		MyInteger integer3 = new MyInteger(3);
//		MyInteger integer4 = new MyInteger(4);
//		int compare = 5;
//		char[] array = { '1', '2', '3', '0' };
//		String name = "1233";
//
//		System.out.println(integer2.isEven());
//		System.out.println(integer3.isOdd());
//		System.out.println(integer3.isPrime());
//		System.out.println(integer4.isPrime());
//		System.out.println(isEven(4));
//		System.out.println(isOdd(3));
//		System.out.println(isPrime(4));
//		System.out.println(isEven(integer2));
//		System.out.println(isOdd(integer3));
//		System.out.println(isPrime(integer3));
//		System.out.println(isPrime(integer4));
//		System.out.println(integer4.equals(compare));
//		System.out.println(integer4.equals(integer3));
//		System.out.println(parseInt(array));
//		System.out.println(parseInt(name));
//
//	}
//
	private int value;
	

	public MyInteger(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (value % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		for (int j = 2; j < value; j++) {
			if (value % j == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int b) {
		if (b % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int b) {

		if (b % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int b) {
		for (int j = 2; j < b; j++) {
			if (b % j == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger n) {
		if (n.getValue() % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(MyInteger n) {
		if (n.getValue() % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(MyInteger n) {
		for (int j = 2; j < n.getValue(); j++) {
			if (n.getValue() % j == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int b) {
		if (value == b)
			return true;
		else
			return false;
	}

	public boolean equals(MyInteger n) {
		if (value == n.getValue())
			return true;
		else
			return false;
	}

	public static int parseInt(char[] k) {
		int a = 0;
		int m = k.length - 1;
		for (int j = 0; j < k.length; j++) {
			int number = k[j]-48;
			a = (int)(a+(number * (Math.pow(10, m--))));
		}
		return a;
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}

}
