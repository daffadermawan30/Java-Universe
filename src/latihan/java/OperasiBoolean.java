package latihan.java;

public class OperasiBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var absen = 70;
		var nilaiAkhir = 80;
		
		boolean lulusAbsen = absen >= 75;
		boolean lulusNilaiAkir = nilaiAkhir >= 75;
		
		var lulus = lulusAbsen && lulusNilaiAkir;
		System.out.println(lulus);
	}
}
