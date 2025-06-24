package latihan.java;

public class TipeDataArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayString;
		arrayString = new String[3]; // menagtur panjang panjang array sebanyak 3
		
		arrayString[0] = "Daffa";
		arrayString[1] = "Dermawan";
		arrayString[2] = "Ganteng Parah";
	
		System.out.println(arrayString[0]);
		System.out.println(arrayString[1]);
		System.out.println(arrayString[2]);
		
		arrayString[2] = "Ganteng Super";
		System.out.println(arrayString[2]);
		
		// cara selanjutnya menulis array secara langsung (biasa dilakukan jika value sudah diketahui)
		int[] arrayInt = new int[]{
				21,3,12,34,90
		};
		
		long[] arrayLong = {
				9831,3123,31236,56,575,67,5745,45645645645645645L
		};
		
		// operasi di array
		System.out.println(arrayLong[1]); //megambil array tertentu
		
		arrayLong[1] = 0;
		System.out.println(arrayLong[1]); //merubah array tertentu
		
		arrayString[1] = null;
		System.out.println(arrayString[1]); //menghapus mengosongkan data pada array
		
		System.out.println(arrayLong.length); //mengetahui jumlah array
		
		// array dalam array
		String[][] arrayString2d = {
				{"daffa", "dermawan"},
				{"keren", "gokil"},
				{"kece", "parah", "super"},
		};
		
		
		System.out.println(arrayString2d[0][0]); // daffa
		System.out.println(arrayString2d[1][0]); // keren
		System.out.println(arrayString2d[2][1]); // parah
 	}

}
