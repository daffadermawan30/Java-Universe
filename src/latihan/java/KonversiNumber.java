package latihan.java;

public class KonversiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte iniByte = 10;
		short iniShort = iniByte;
		int iniInt = iniShort;
		
		int iniInt2 = 1000;
		byte iniByte2 = (byte) iniInt2;
		
		System.out.println(iniByte2);
		
		// hasil mengulang karena byte hanya sampai 128
	}

}
