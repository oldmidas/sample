public class Aapp {
	public static void main(String[] args) {

		// System.out.println(A.x);  // �����̴�, x�� static ������ �ƴϱ� ������ ��ü(A A = new A();)�� �ҷ��;߸� ����� �� �ִ�.


		System.out.println(A.y); //static ����� Ŭ������.���� Ŭ������.�޼ҵ�() �������� ���. �ٷ� ��� �����ϴ�.

		// ����(static) ���� y�� �� �Ҵ��ϱ�
		// AŬ������ ����ؼ� ���� ��� ��ü�� �������� y���� �����Ѵ�.
		A.y = 0;

		


		// A�� ����� ������� a1,a2,a3 ��ü���� ����(static)������ y�� ���� ����! ������ x�� ��ü���� �ٸ� ���� ������ �ִ�.
		// y���� ��µǱ�� ������, y���� ��������� ������ �� �ִ�. �׷��� a1.y���� ������δ� ���� �ʴ� ���� ����. �׳� A.y�� �������� ����.
		A a1 = new A();
		//a1.x = 10;
		System.out.println("\n��ü a1�� y�� : " + a1.y + "\t\t��ü a1�� x�� : " + a1.x); 

		A a2 = new A();
		//a2.x = 20;
		System.out.println("\n��ü a2�� y�� : " + a2.y + "\t\t��ü a2�� x�� : " + a2.x); 

		A a3 = new A();
		//a3.x = 30;
		System.out.println("\n��ü a3�� y�� : " + a3.y + "\t\t��ü a3�� x�� : " + a3.x); 
	}
}