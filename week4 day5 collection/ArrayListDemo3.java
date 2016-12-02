import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		// �⺻�ڷ��� ���� �����ϴ� ArrayList�����
		// �⺻�ڷ��� Ÿ�Կ� �����Ǵ� WrapperŬ���� Ÿ���� ArrayList�� Ÿ������ �����Ѵ�.
		// ArrayList<Integer>, ArrayList<Double>, ...

		// ������ ������ �����ϴ� ArrayList �����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(12));
		numbers.add(23);	//numbers.add(new Integer(23));	// ����ڽ�
		numbers.add(16);	//numbers.add(new Integer(16));	// ����ڽ�
		numbers.add(5);		//numbers.add(new Integer(5));	// ����ڽ�

		/*
			ArrayList���� �ϳ� ������ Integer��ü�� ���������
			��� ������ int Ÿ���̸� �ڵ����� Integer��ü�� ����� �������� ������.
		*/

		int e1 = numbers.get(0);	//int e1 = x.intValue <-- Integer x = numbers.get(0);	// �����ڽ�
		int e2 = numbers.get(1);	//int e2 = numbers.get(1).intValue();	// �����ڽ�
		int e3 = numbers.get(2);	//int e3 = numbers.get(2).intValue();	// �����ڽ�
		int e4 = numbers.get(3);	//int e4 = numbers.get(3).intValue();	// �����ڽ�

		System.out.println(e1 + ", " + e2 + ", " + e3 + ", " + e4);

		for (int num : numbers) {
			System.out.println(num);
		}

	}
}