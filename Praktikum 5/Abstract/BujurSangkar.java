//Nama file : BujurSangkar.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 25/03/2023
//Deskripsi : File class implementasi method dari abstract class bangun datar

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
	// jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi errpr
    // dimana file bujursangkat tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}