public class BankingException extends Exception {
	
	private String errorCode;

	public BankingException() {}

	public BankingException(String message) {
		super(message);
	}
	public BankingException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	/*
		�ؾƹ��� Ŭ����
		public class Exception extends Throwable {
			public Exception() {}
			public Exception(String message) {
				super(message);
			} 
		}


		���Ҿƹ��� Ŭ����
		public class Throwable {
			private String message;
			
			public Throwable() {}
			public Throwable(String message) {
				this.message = message;
			}

			public String getMessage() {
				return message;
			}
		}

	*/
}