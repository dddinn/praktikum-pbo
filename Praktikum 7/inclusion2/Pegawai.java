//Nama file : Pegawai.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program polimorfisme inclusion dengan super class Pegawai

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 500000;
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}