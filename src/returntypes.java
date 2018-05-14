
public class returntypes {
	public static void main(String args[]) {
		Something("Hello World");
		System.out.println(Newmethod());
	}
	public static void Something(String world) {
		System.out.println(world);
	}
	public static String Newmethod() {
		return ("Hello World");
	}
}
