//Nama file : Kubus.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 15/03/2023
//Deskripsi : Kelas yang berisi untuk menghasilkan program kubus

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    // atribut
    private BujurSangkar permukaan;

    // konstruktor
    public Kubus(BujurSangkar bujurSangkar){
        this.permukaan = bujurSangkar;
    }

    // method
    public double hitungVolume(){
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }
}