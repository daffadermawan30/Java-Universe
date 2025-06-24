package latihan.java;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(;;){
//			System.out.println("tolong aku terjebak dimensi tak berujung!");
//		}
		
		// akan terjadi perulangan tak terbatas jika 
		// init statement; kondisi; post statement dikosongkan -> kosong = true
		
		var counter = 1;
		for(;counter <= 10;) {
			System.out.println(counter);
			counter++;
		}

		for(var counter2 = 10;counter2 >= 1;) {
			System.out.println(counter2);
			counter2--;
		}
		
		for(var counter3 = 0;counter3 < 11;counter3++) {
			System.out.println(counter3);
		}
		
	}

}
