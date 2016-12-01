import java.util.*;

public class PostingApp {
	public static void main(String[] args) {
		Posting p = new Posting(1, "이벤트", "크리스마스 시즌 이벤트", new Date());
		System.out.println("글번호: " + p.getNo());
		System.out.println("제  목: " + p.getTitle());
		System.out.println("작성일: " + p.getPrettyRegdate());

		/*
		System.out.println(p.getRegdate());
		System.out.println(p.getPrettyRegdate());
		*/
	}
}