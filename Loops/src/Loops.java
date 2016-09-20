public class Loops {
	public static void main(String[] args) {	
		square(5);
	}
	
	static void loop(int y) {
		for (int x = 1; x <= y; x++) {
			System.out.println(x);
		}
	}
	
	/**
	 * square: 
	 * @param y
	 */
	
	static void square(int y) {
		for (int x = 1; x <= y; x++){
			for (int z = 0; z < x; z++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
