package latihan.java;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sama seperti while loop hanya saja kondisi baru akan di cek setelah melakukan perulangan
		// sehingga dengan do while loop kita pasti akan mendapat 1 perulangan
		
		var counter = 100;
		do {
			System.out.println("ini perulangan ke-"+counter);
			counter--;
		} while (counter <= 10);
	}

}
