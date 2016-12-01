public class Fileupload {
	
	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {
		maxFileSize = 1024 * 1024 * 10; // 10Mb
		maxFileAmount = 10;
	}

	public Fileupload(long size) {
		maxFileSize = size;
		maxFileAmount = 10;
	}

	public Fileupload(int amount) {
		maxFileSize = 1024 * 1024 * 10; // 10Mb
		maxFileAmount = amount;
	}

	public Fileupload(long size, int amount) {
		maxFileSize = size;
		maxFileAmount = amount;
	}
	
	public void upload() {
		System.out.println("���� ���ε� ������ .....");
		System.out.println("�ִ� ���ϻ�����: " + maxFileSize);
		System.out.println("�ִ� ���ϰ���: " + maxFileAmount);
	}

}