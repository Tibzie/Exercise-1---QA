
public class iterationarray2 {
	public static void main(String args[]) {
		int[] arrays = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int iterarray = arrays.length;
		
		for (int i=1; i<=iterarray; i++) {
			System.out.println(i);
		}
		int n = 10;
		for (int i=1; i<=iterarray; i++) {
			System.out.println(i*n);
		}
	}
}
