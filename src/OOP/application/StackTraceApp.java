package OOP.application;


public class StackTraceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		try {
			sampleError();
		} catch (RuntimeException exception) {
			exception.printStackTrace();
		}
		
	}
	
	public static void sampleError() {
		try {
		String[] names = {
			"daffa", "dermawan"
		};
		
		System.out.println(names[100]);
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}

}
