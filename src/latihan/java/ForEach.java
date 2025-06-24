package latihan.java;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {
				"daffa", "dermawan", "ganteng",
				"tapi", "dingin", "dan", "baik"
		};
		
		// ini jadul
		for (int i = 0 ;i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// papa mau 3
		for (var arr:array) {
			System.out.println(arr);
		}
	}

}
