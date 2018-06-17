
public class FinallyBlock {

	public static void main(String... ar) {
		try {
			FinallyBlock ob = new FinallyBlock();
		} catch (Exception e) {
			System.out.println("Exception caught" + e);
		} finally {
			System.out.println("A finally block is executed irrespective of an exception is thrown or not");
		}

	}
}
