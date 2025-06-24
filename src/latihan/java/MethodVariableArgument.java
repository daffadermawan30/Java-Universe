package latihan.java;

public class MethodVariableArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var name = "Daffa Dermawan";
		int nilai[] = {
			80, 82, 90, 100, 97, 100	
		};
		
		sayCongrats(name, nilai);
		System.out.println("\n");
		sayCongrats("Rimuru", 90,21,12,0,100,20);
	}

//	static void sayCongrats (String name, int[] values) {
	static void sayCongrats (String name, int... values) {
		// mencari nilai rata rata
		int total = 0; 
		for (var value : values) {
			total += value;
		}
		int finalValue = total / values.length;
		
		if (finalValue >= 75) {
			System.out.printf("selamat %s kamu lulus \nnilai rata - rata kamu adalah %d", name, finalValue);
		} else {
			System.out.printf("Maaf %s kamu gagal, silahkan mencoba lagi \nnilai rata - rata kamu adalah %d", name, finalValue);
		}
	}
}
