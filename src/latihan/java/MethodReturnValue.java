package latihan.java;

public class MethodReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 20;
		var b = 50;
		var c = sum(a,b);
		System.out.println(c);
		
		var val1 = 12;
		var ops = "-";
		var val2 = 20;
		var total = calc(val1, ops, val2);
		System.out.println(total);
				
	}

	static int sum (int value1, int value2){
		var total = value1 + value2;
		return total;
	}
	
	static int calc (int val1, String ops, int val2) {
		switch(ops) {
		case "+" : 
			return val1 + val2;
		case "-" : 
			return val1 - val2;
		case "/" : 
			return val1 / val2;
		case "*" : 
			return val1 * val2;
		default:
			return 0;
		}
	}
}
