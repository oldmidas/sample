public class ContactApp {
	public static void main(String[] args) {

		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 23;
		c1.name = "È«±æµ¿";
		c1.phone = "010-1234-1234";
		c1.email = "hong@gil.dong";

		c2.no = 25;
		c2.name = "±èÀ¯½Å";
		c2.phone = "010-5678-5678";
		c2.email = "kim@yu.shin";

		c1.call();
		c2.call();

		/*
		Contact[] contacts = new Contact[10];
		contacts[0] = c1;
		contacts[1] = c2;
		*/

	}
}