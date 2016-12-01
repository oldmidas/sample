public class OwnerCommand {
	public static void main(String[] args) {

		Dog myDog = new StrongDog();
		Owner harry = new Owner(myDog);

		harry.letDogBites();

		//==========================

		Dog myDog2 = new StupidDog();
		harry.setDog(myDog2);

		harry.letDogBites();
	}
}