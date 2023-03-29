//Nama file : Lingkaran.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 25/03/2023
//Deskripsi : File class implementasi IArea berupa cara menghitung luas lingkaran

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}