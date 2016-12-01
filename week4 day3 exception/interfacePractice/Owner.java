public class Owner {
	private Dog dog;
	public Owner() {}

	public Owner(Dog dog) {
		this.dog = dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void letDogEats() {
		dog.eat();
	}

	public void letDogSleep() {
		dog.sleep();
	}

	public void letDogPoo() {
		dog.poo();
	}

	public void letDogBarks() {
		if (dog instanceof Bark) {
			((Bark)dog).bark();	
		} else {
			System.out.println("Â¢À» ÁÙ ¸ð¸¨´Ï´Ù.");
		}
	}

	public void letDogBites() {
		if (dog instanceof Bite) {
			((Bite)dog).bite();
		} else {
			System.out.println("±ú¹° ÁÙ ¸ð¸¨´Ï´Ù.");
		}
	}


}