//Nama file : MBujurSangkar.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 25/03/2023
//Deskripsi : Kelas yang berisi program utama untuk menghasilkan kubus

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}