public class ArrayDemo4 {
	public static void main(String[] args) {
		
		

		//������ �迭�� �� �����ϱ�

		/*
		String[][] groups = new String[2][3];
		groups[0][0] = "Ȳ����";
		groups[0][1] = "����";
		groups[0][2] = "���ؿ�";

		groups[1][0] = "ȫ��ȯ";
		groups[1][1] = "������";
		groups[1][2] = "������";
		*/

		
		String[][] groups = {{"Ȳ����","����","���ؿ�"},{"ȫ��ȯ","������","������"}}; //�� 9~16�� ���� ������ε� ����.

		//������ �迭�� �� ǥ���ϱ�
		/*
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				//System.out.print(groups[i][j] + "\t");
				System.out.printf("(%d, %d) => %s", i, j, groups[i][j] + "\t");
			}
			System.out.println();
		}
		*/

		for (String[] group : groups) {
			for(String name : group) {
				System.out.print(name + "\t");
			}
			System.out.println();
		}


	}
}