public class CarApp { //App�� ������ main�� ������ �ִ� ������
	public static void main(String[] args) {
		/*
			Car c
				Car��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ���� c�� �����.
				CarŸ��(Ŭ����Ÿ��, ����Ÿ��)�� ���� c(��������)�� �����.

			new Car();
				Car���赵�� �ε��ؼ� ��ü�� �����ϰ�,
				������ ��ü�� ������ �� �ִ� �ּҰ��� ��ȯ�ϴ� �ڵ��̴�.
			
			Car c = new Car();
				Car���赵�� �ε��ؼ� ��ü�� �����ϰ�,
				������ ��ü�� ������ �� �ִ� �ּҰ��� CarŸ���� ���� c�� �����ض�.
		*/


		Car c = new Car();
		System.out.println(c); //Car@15db9742 -> 15db9742 == hash code

		Car c2 = new Car();
		System.out.println(c2); // Car c�ʹ� �ٸ� hash code�� �����ȴ�

		// ������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�
		System.out.println(c.speed);	// c�� �����ϴ� ��ü�� speed �Ӽ��� ��ȸ. ����ӵ� 0
		c.speed = 10;					// c�� �����ϴ� ��ü�� speed�� �Ӽ��� ����. ����ӵ� 10
		c.speedUp();					// c�� �����ϴ� ��ü�� ���Ե� speedUp() ��� �����ϱ�. ����ӵ� 20

	}
}