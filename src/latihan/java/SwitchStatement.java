package latihan.java;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var nilai = "k";
		switch (nilai) {
		case "A":
			System.out.println("Nice Grade");
			break;
		case "B":
		case "C":
			System.out.println("Not Bad Lah...!");
			break;
		case "D":
			System.out.println("Teme Baka da");
			break;
		default:
			System.out.println("inputnya yang bener dong...");
		}
	
		// switch lambda
		switch (nilai) {
		case "A" -> System.out.println("bagusnya nilai awak");
		case "B", "C" -> System.out.println("Lumayanlah nilai awak");
		case "D" -> System.out.println("Ish Teruknya");
		default -> System.out.println("hey yang benar lah inputnyoo!!");
		}
		
		// switch tanpa yield
		
		// String ucapan;
		
		// ini yang salah 
		
		// switch (nilai) {
		// case "A" -> ucapan = "Congrats";
		// case "B", "C" -> ucapan = "Good Job";
		// case "D" -> ucapan = "Yip";
		// default -> ucapan = "Cek input";
		// }
		
		// yang benar
		
		var ucapan = switch (nilai) {
		case "A": 
			yield  "Congrats"; 
		case "B", "C": 
			yield "Good Job"; 
		case "D": 
			yield "Yip";      
		default : 
			yield "Cek input";
		};
		
		System.out.println(ucapan);
	}
}
