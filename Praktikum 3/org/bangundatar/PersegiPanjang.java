//Nama file : PersegiPanjang.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 08/03/2023
//Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas operasi titik

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
	private double panjang,lebar;
	
	public PersegiPanjang(double panjang,double lebar,int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjang * lebar;
	}
	
	public void printInfo(){
		System.out.println("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
	}

}	