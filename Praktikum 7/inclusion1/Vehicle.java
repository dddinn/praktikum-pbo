//Nama file : Vehicle.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program implementasi polimorfisme inclusion dengan super class Vehicle

public class Vehicle{
	void calRent(int distance, float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
