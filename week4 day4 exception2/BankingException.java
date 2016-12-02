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
		※아버지 클래스
		public class Exception extends Throwable {
			public Exception() {}
			public Exception(String message) {
				super(message);
			} 
		}


		※할아버지 클래스
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