//Nama file : BujurSangkar.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 15/03/2023
//Deskripsi : Kelas yang berisi untuk menghasilkan bujursangkar

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    // atribut
    private double panjangSisi;

    // konstruktor
    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    // method
    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return Math.pow(this.panjangSisi,2);
    }
}