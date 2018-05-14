
public class conditionals {
	public static void main(String args[]) {

		System.out.print(TwoInt(2, 3, true));
	}
	public static int TwoInt(int a, int b, boolean c) {
		int sum = a + b;
		int mul = a * b;
		if(c == true) {
			return sum;
		} else {
			return mul;
		}
	}
}