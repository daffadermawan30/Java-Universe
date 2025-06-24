package latihan.java;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var nilai = 70;
		var absen = 90;
		
		if(nilai >= 75 && absen >= 75){
			System.out.println("anda lulus Pak!");
		} else {
			System.out.println("anda harus ulang semester dek!!!");
		}
		
		if(nilai >= 80 && absen >= 80) {
			System.out.println("Nilai anda 'A'");
		} else if (nilai >= 70 && absen >= 70) {
			System.out.println("Nilai anda 'B'");
		} else if (nilai >= 60 && absen >= 60) {
			System.out.println("Nilai anda 'C'");
		} else if (nilai >= 50 && absen >= 50) {
			System.out.println("Nilai anda 'D'");
		} else {
			System.out.println("Nilai anda 'E'");
		}
	}
}
