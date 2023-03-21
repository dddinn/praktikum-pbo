//Nama file : Poligon.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 15/03/2023
//Deskripsi : File Super Class Bujur Sangkar

package org.poligon;

public class Poligon {
    // atribut
    protected int jumlahSisi;

    // konstruktor
    public Poligon(){
        this.jumlahSisi = 0;
    }

    // method
    public void setJumlahSisi(int sisi){
        this.jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}