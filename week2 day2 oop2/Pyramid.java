public class Pyramid {
	public static void main(String[] args) {
//     *
//    ***
//   *****
//  *******
// *********
//***********
		int pyramid = 6;


		for (int i = 0; i < pyramid; i ++) {
			for (int j = 1; j < pyramid - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
				
			}
			/*if (i == 5) {
					break;
			}*/
			System.out.println();
		}

		
//***********	'*'11	' '0
// *********	'*'9	' '1
//  *******		'*'7	' '2
//   *****		'*'5	' '3
//    ***		'*'3	' '4
//     *		'*'1	' '5


		for (int i = 0; i < pyramid; i ++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < ((pyramid * 2) - (i*2)) - 1; k++) {
				System.out.print("*");
				
			}
			if (i == 5) {
					break;
			}
			System.out.println();
		}
		

	}
}