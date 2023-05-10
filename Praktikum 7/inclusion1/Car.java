//Nama file : Car.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program implementasi polimorfisme inclusion dengan sub class Car

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare = jarak * harga;
		fare = fare - 100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}