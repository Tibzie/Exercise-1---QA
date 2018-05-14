
public class conditionals2 {
	public static void main(String args[]) {

		System.out.print(TwoInt(0, 0, true));
	}
	public static int TwoInt(int a, int b, boolean c) {
		int sum = a + b;
		int mul = a * b;
		if (a == 0 && b != 0) {
			return b;
		} else if (b == 0 && a != 0) {
			return a;
		} else if (a == 0 && b == 0) {
			System.out.println("wrong numbers");
		}
		if(c == true) {
			return sum;
		} else {
			return mul;
		} 
	}
}
