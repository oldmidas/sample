//banking program
//1. ���µ�� ���
	// �̸�, ��й�ȣ, ���� �Աݾ��� �Է¹޾Ƽ� ���¸� �����Ѵ�.
//2. ��ȸ ���
	// �̸�, ���¹�ȣ, �ܾ��� ǥ���Ѵ�. 
//3. ��й�ȣ ������
	//���� ��й�ȣ�� �� ��й�ȣ�� �Է¹޾Ƽ� ��й�ȣ�� �����Ѵ�.
//4. �Աݱ��
	//�Աݾ��� �Է¹޾Ƽ� �ܾ��� ������Ų��.
//5. ��ݱ��
	// ��ݾװ� ��й�ȣ�� �Է¹޾Ƽ� �ܾ��� ���ҽ�Ų��.
//6. ����
	// ���α׷��� �����Ѵ�.

public class Account{
	// �̸� ���¹�ȣ ��й�ȣ �ܾ�
	// �Ӽ� ����
	private String name;
	private String accountNo;
	private int password;
	private int balance;

	//�⺻ ������ ����
	public Account () {}

	//getter / setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}