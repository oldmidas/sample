public class MethodDemo2 {
	
	public static void displayGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			//System.out.println(dan + "	*	" + i + "  =  " + (i*dan));
			System.out.printf("%d * %d = %d\n", dan, i, (i*dan));
		}
	}

	public static void main(String[] args) {
		displayGugudan(8);

		displayGugudan(199);

		for (int i = 1; i <= 1000; i++) {
			if (i%9 == 0) {
				displayGugudan(i);
			} else {
				continue;
			}
		}
	}

}