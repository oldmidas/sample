public class Game_369 { 
	public static void main(String[] args) {  

		for(int a = 0; a < 10; a++){
			for(int b = 0; b < 10; b++){
				if((a == 0) && (b == 0)) {
				continue;

				} else if((b%3 == 0) && (b != 0)){
						if((a%3 == 0) && (a != 0)){
							System.out.println("clap clap");continue;
						}
						System.out.println("clap");continue;
				} else if((a%3 ==0) && (a != 0)){
					System.out.println("clap");continue;
				}
				System.out.println(a+""+b);

			}
		} 

	}
}