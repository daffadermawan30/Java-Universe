package OOP.data;

public interface Car extends HasBrand,IsMaintenance {

	void drive();
		
	int getTire();
	
	default boolean isBig() {
		return false;
	}
	// default method untuk membantu dalam menambahkan method pada kelas yang sudah banyak karena jika tidak pakai ini akan sangat merepotkan karena butuh override 1 per 1

}
