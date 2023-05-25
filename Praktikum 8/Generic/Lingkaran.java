//Nama file : Lingkaran.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 17/05/2023
//Deskripsi : Implementasi Lingkaran sebagai BangunDatar

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}