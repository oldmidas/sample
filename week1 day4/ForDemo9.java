import java.util.Random;

public class ForDemo9 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int i=1; i<=10; i++) {

			int dice1 = random.nextInt(5) + 1;
			int dice2 = random.nextInt(5) + 1;

			System.out.printf("(%d, %d)\n", dice1, dice2);

			}



	}
}