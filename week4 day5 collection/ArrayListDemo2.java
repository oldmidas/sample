import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		while (true) {
			System.out.println("1.��� 2.��ȸ 0.����");
			System.out.print("����>");
			int menu = sc.nextInt();


				if (menu == 1) {
					System.out.print("����� �̸��� �Է��ϼ���: ");
					String name = sc.next();
					names.add(name);

				} else if (menu == 2) {
					for (String temp : names) {
							System.out.println(temp);
						}
				} else if (menu == 0) {
					break;
				}			
			
		}
	}
}