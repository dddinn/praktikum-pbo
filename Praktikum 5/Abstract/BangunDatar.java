//Nama file : BangunDatar.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 25/03/2023
//Deskripsi : File abstract class bangun datar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}