import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//¸Ş´ºÀÌ¸§À» ÀúÀåÇÏ´Â HashSet°´Ã¼ ¸¸µé±â
		HashSet<String> menuset = new HashSet<String>();

		System.out.println(menuset.add("Ã»±¹Àå"));
		System.out.println(menuset.add("µÈÀåÂî°³"));
		System.out.println(menuset.add("µÎºÎÁ¶¸²"));
		System.out.println(menuset.add("ÇÑ¿ìÀ°°³Àå"));
		System.out.println(menuset.add("È²ÅÂÁ¶¸²"));
		System.out.println(menuset.add("Á¦À°ººÀ½"));
		System.out.println(menuset.add("Á¦À°ººÀ½"));
		System.out.println(menuset.add("Á¦À°ººÀ½"));
		System.out.println(menuset.add("Á¦À°ººÀ½"));

		String a = "Á¦À°ººÀ½";
		String b = "Á¦À°ººÀ½";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		int len = menuset.size();
		System.out.println("ÀúÀåµÈ °³¼ö: " + len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}