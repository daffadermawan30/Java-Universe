package latihan.java;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var counter = 1;
		while(true) {
			System.out.println("ini perulangan ke-" + counter);
			counter++;
			if(counter>10) {
				System.out.println("Berhenti gerak!!!");
				break;
			}
		}
		System.out.println("ashiappp!");
		
		for(var counter2=1;counter2<=10;counter2++){
			if(counter2 %2 == 0) {
				continue;
			}
			System.out.println("ini bilangan ke-" + counter2);
		}
	}

}
