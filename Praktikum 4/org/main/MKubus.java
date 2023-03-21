//Nama file : MKubus.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 15/03/2023
//Deskripsi : Kelas yang berisi program utama untuk menghasilkan kubus

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4.0);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Kubus dengan panjang sisi : " + bujurSangkar.getPanjangSisi());
        System.out.println("Luas alas Kubus : " + kubus.hitungLuasAlas());
        System.out.println("Volume Kubus : "+ kubus.hitungVolume());

    }
}