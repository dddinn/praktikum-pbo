//Nama file : Sewa.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program implementasi polimorfisme inclusion dengan main program Sewa

public class Sewa{
	public static void main(String[] args){
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}