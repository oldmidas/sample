public class CastingTest {
	public static void main(String[] args) {
		Son person = new Son();
		Father father = (Father) person;

		person.lastName = "Ŵ";
		person.sonName = "�Ƶ�";
		person.sonMethod1();

		Son person2 = (Son) father;
		person2.fatherName = "�ƺ�";
		person2.sonName = "�Ƶ�2";

	}
}