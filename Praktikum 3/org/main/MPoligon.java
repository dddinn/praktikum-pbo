//Nama file : PersegiPanjang.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 08/03/2023
//Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas operasi titik

package org.main;

import org.bangundatar.*;


public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		Segitiga segitiga = new Segitiga(7,7,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
		}	
	}