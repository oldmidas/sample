public class FileuploadApp {
	public static void main(String[] args) {
		Fileupload f1 = new Fileupload();
		f1.upload();

		Fileupload f2 = new Fileupload(100); //파일 100개
		f2.upload();

		Fileupload f3 = new Fileupload(1024*1024*500L); //500메가
		f3.upload();
	}
}