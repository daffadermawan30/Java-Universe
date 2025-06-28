package OOP.data;

public class Application {

	public static final int PROCESSORS;
	static {
		System.out.println("mengakses kelas Application");
		PROCESSORS = Runtime.getRuntime().availableProcessors();
	};
}
