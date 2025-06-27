package OOP.application;

public class EqualsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "Daffa";
		first += " " + "Dermawan";
		
		String second = "Daffa Dermawan";
		
		System.out.println(first == second);
		// false karena yang dibandingkan adalah alamat memory yang digunakan 
		System.out.println(first.equals(second));
		// true karena yang dibandigkan isi objectnya
	}

}
