package latihan.java;

public class RecursiveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var factor = factorialLoop(5);
		System.out.println(factor);
		
		var factorial = factorialMethod(5);
		System.out.println(factorial);
		
		recursiveProblem(1000);
	}

	static int factorialLoop(int value) {
		var result = 1;
		for (int i=1; i <= value; i++) {
			result*=i;
		}
		return result;
	}
	
	static int factorialMethod(int value) {
		if (value == 1) {
			return 1;
		} else {
			return value * factorialMethod(value - 1);
		}

	}
	
	static void recursiveProblem(int value) {
		if (value == 0) {
			System.out.println("selesai");;
		} else {
			System.out.println("perulangan recursive ke - " + value);
			recursiveProblem(value-1);
		}
	}
}
