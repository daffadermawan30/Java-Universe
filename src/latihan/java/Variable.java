package latihan.java;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		name = "Daffa Dermawan";
		
		System.out.println(name);
		
		int age = 22;
		String address = "Tangerang";
		
		System.out.println(age);
		System.out.println(address);
		
		name = "Dermawan Daffa";
		System.out.println(name);
		
		// age = "daffa"; 
		// akan error karena variabel age ber tipe data integer
		
		// untuk mempersingkat kita bisa gunakan var untuk menggantikan tipe data
		
		// var name = "daffa ganteng";
		// akan error karena di awal 'name' sudah di deklarasikan dengan string
		
		var nama = "daffa ganteng";
		var umur = 22;
		
		System.out.println(nama);
		System.out.println(umur);
		
		// final = CONSTANT
		// final nama = "daffaganteng"; 
		// -> error karena butuh tau tipe datanya saat gunakan 'FINAL' dan tidak bisa inisialisai variabel yang sudah ada
		
		final String namaBaru = "keren daffa";
		
		System.out.println(namaBaru);
		
		
		
	}

}
