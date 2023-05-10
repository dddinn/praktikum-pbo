//Nama file : Manajer.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program polimorfisme inclusion dengan sub class Manajer

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}