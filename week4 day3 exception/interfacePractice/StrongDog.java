public class StrongDog implements Dog, Bark, Bite {
	public void eat() {
		System.out.println("´Æ¸§ÇÏ°Ô ¹ä¸Ô±â");
	}

	public void sleep() {
		System.out.println("À§¾öÀÖ°Ô ÀáÀÚ±â");
	}

	public void poo() {
		System.out.println("¾ö¼÷ÇÏ°Ô ½Î±â");
	}

	public void bark() {
		System.out.println("¿Ð! ¿Ð! À¸¸£··.. ¿Ð! ¿Ð!");
	}

	public void bite() {
		System.out.println("»ç³³°Ô ¹°±â");
	}
}