public class CastingTest {
	public static void main(String[] args) {
		Son person = new Son();
		Father father = (Father) person;

		person.lastName = "킴";
		person.sonName = "아들";
		person.sonMethod1();

		Son person2 = (Son) father;
		person2.fatherName = "아빠";
		person2.sonName = "아들2";

	}
}