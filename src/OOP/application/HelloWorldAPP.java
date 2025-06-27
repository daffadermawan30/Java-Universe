package OOP.application;

public class HelloWorldAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld english = new HelloWorld() {
			public void sayHello() {
				System.out.println("hello");
			}
			
			public void sayHello(String name) {
				System.out.println("hello "+ name);
			}
		};
		
		english.sayHello("Daffa dermwan");
		// ini adalah anonymous class kekurangnanya tidak bisa di reuse
	}

}
