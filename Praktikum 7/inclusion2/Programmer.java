//Nama file : Programmer.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 03/05/2023
//Deskripsi : Program polimorfisme inclusion dengan sub class Programmer

public class Programmer extends Manajer {
    private int bonus = 450000;
    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}