public class Car {
	// �Ӽ�(�ʵ�, field) �����ϱ�
	int speed;

	// ���(�޼ҵ�, method) �����ϱ�
	public void speedUp() { // �ʵ�, �������, ������Ʈ, �ν��Ͻ� ����
		speed += 10;
		System.out.println("���� �ӵ�: " + speed + "km"); 
	}
	
	public void speedDown() {
		speed -= 10;
		System.out.println("����ӵ�: " + speed + "km");
	}

}