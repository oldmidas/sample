/*
	������¸� ǥ���ϴ� Ŭ����
	- �Ӽ�
		������
		���¹�ȣ
		��й�ȣ
		�ܾ�

	- ���
		��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ�
				   ��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ�
				   �ݾ׸�ŭ�� �峼���� ���ҽ�Ű��
				   �ݾ׸�ŭ ���� ��ȯ�Ѵ�.

		�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű��
				   ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.

		��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.

*/

public class Account {

	String owner;
	String accountNumber;
	int password;
	int balance;

	//��ݱ��
	/*
	public int withdraw(int amount, int pwd) {
		if (pwd == password) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println(amount + "�� ����մϴ�.");
				System.out.println("�����ܾ� : " + amount + "��");
				return amount;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�����ܾ� : " + amount + "��");
				return 0;
			}
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return 0;
		}

	}
	*/
	public int withdraw(int amount, int pwd) {
		int money = 0;
		if (pwd == password) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println(amount + "�� ����մϴ�.");
				System.out.println("�����ܾ� : " + balance + "��");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.println("�����ܾ� : " + balance + "��");
			}
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		return money;

	}


	public int withdraw(int amount, int pwd) {
		if (pwd != password) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return 0;
		} 
		if (balance < account) {
			System.out.println("�ܾ��� �����մϴ�.");
		}

		if ((balance - account) >= 100000) {
			System.out.println("�ּ� ���ݾ��� �����մϴ�.");
		}
		balance += amount;
		return amount
			


	}

	
	
	
	//�Աݱ��
	public void deposit(int amount) {
		balance += amount;
		System.out.println("�����ܾ� : " + balance + "��");
		
	}

	//��ȸ���
	public void balance() {
		System.out.println("========================");
		System.out.println("�� �� �� : " + owner);
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("��    �� : " + balance);
		System.out.println("========================");
	}

}