import java.util.*;

public class PostingApp {
	public static void main(String[] args) {
		Posting p = new Posting(1, "�̺�Ʈ", "ũ�������� ���� �̺�Ʈ", new Date());
		System.out.println("�۹�ȣ: " + p.getNo());
		System.out.println("��  ��: " + p.getTitle());
		System.out.println("�ۼ���: " + p.getPrettyRegdate());

		/*
		System.out.println(p.getRegdate());
		System.out.println(p.getPrettyRegdate());
		*/
	}
}