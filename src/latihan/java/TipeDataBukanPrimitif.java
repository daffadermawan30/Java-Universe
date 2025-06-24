package latihan.java;

public class TipeDataBukanPrimitif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iniINteger = 100;
		Long iniLong = 10000L;
		
		Byte iniByte = null;
		// byte iniByte = 0;
		
		iniByte =100;
		
		System.out.println(iniByte);

		//konversi dari primitif ke bukan primitif
		int iniInt = 100;
		Integer iniObject = iniInt;
		int baru = iniObject;
		
		short iniShort = iniObject.shortValue();
		long iniLong2 = iniObject.longValue();
		float iniFloat = iniObject.floatValue();

		
		Long amount = 10000000L;
	}

}
