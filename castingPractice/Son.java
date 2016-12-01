public class Son extends Father {
	String sonName;

	public Son () {}
	
	public Son(String sonName) {
		this.sonName = sonName;
	}

	public void sonMethod1() {
		System.out.println(sonName);
	}
}