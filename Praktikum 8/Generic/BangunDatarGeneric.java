//Nama file : BangunDatarGeneric.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 17/05/2023
//Deskripsi : Class konstruksi generic untuk BangunDatar

public class BangunDatarGeneric<T2 extends BangunDatar>{ //T sudah diganti dengan T2
	private T2 bangunDatar;
	
	public void set(T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T2 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

/**Kesimpulan: Mengubah karakter 'T' dengan karakter lain dalam class generic merupakan suatu metode untuk memberikan penamaan yang lebih deskriptif terhadap parameter generik. 
 Dalam hal ini, menjadikannya dapat meningkatkan pemahaman mengenai jenis data yang digunakan dalam class tersebut. 
 Selain itu, penggunaan karakter yang berbeda seperti T1, T2, atau lainnya juga berguna untuk membedakan 
 apabila terdapat lebih dari satu parameter generic yang digunakan dalam class tersebut. 
 Namun, perubahan karakter 'T' dengan karakter lain seperti T1, T2, atau lainnya tidak berdampak secara langsung terhadap fungsionalitas kode.**/