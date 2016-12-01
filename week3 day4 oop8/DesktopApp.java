public class DesktopApp {
	public static void main(String[] args){
	
	OpticalMouse m = new OpticalMouse();
	BallMouse m2 = new BallMouse();

	Desktop pc = new Desktop();

	pc.setMouse(m2);
	

	pc.running();
	pc.painting();
	pc.cleaning();
	}
}