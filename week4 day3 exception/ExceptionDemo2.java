import java.io.*;

public class ExceptionDemo2 {

	// reading()�� �ڽ��� ����ϴ� ���๮���� �߻��ϴ� ���ܸ� ó������ �ʴ´�.
	// ��� �߻��� ����Ǵ� ���ܸ� �ٽ� ����������.
	public static void reading() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("mem2o.txt"));
		String text = reader.readLine();
		System.out.println("����: " + text);
	}

	// main()�޼ҵ�� reading()�޼ҵ尡 ������ ���ܿ� ���� ó���� �����ϰ� �ִ�.
	// reading()�޼ҵ�� �ڽ��� ����ϴ� main()���� ����ó�� å���� ���Ѱ��.
	public static void main(String[] args) {
		try {
			reading();

		} catch(FileNotFoundException fnfe) {
			System.out.println("fnfe");
			fnfe.printStackTrace();

		} catch(IOException ioe) {
			System.out.println("ioe");
			ioe.printStackTrace();
		}
	}

	/* JVM���� ���ѱ�⵵ ������
	public static void main(String[] args) throws FileNotFoundException, IOException {
		reading();
	}
	*/

}