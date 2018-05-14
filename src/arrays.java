

public class arrays {
	public static int TwoInt() {
		
		int[] arrays = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		
		for(int num : arrays) {
			if (num == 0) {
				System.out.println("one of the values is 0");
			}
			sum = sum+num;
		}
		return sum;
		
	}
	public static void main(String args[]) {
		System.out.println(TwoInt());
	}
}

