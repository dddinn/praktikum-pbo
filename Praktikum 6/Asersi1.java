//Nama file : Asersi1.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 29/03/2023
//Deskripsi : Program untuk menunjukkan asersi

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan postif");
		}else{
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}