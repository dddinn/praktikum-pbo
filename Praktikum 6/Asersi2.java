//Nama file : Asersi2.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 29/03/2023
//Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

// class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}
//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0) : "jari jari tidak boleh nol!!!";
		Lingkaran lingkaran = new Lingkaran(jariJari);
		double kelilingLingkaran = lingkaran.hitungKeliling();
		System.out.println("keliling lingkaran = " + kelilingLingkaran);
	}
}

/* 
secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
Program yang disebutkan sebelumnya tidak terlalu tepat karena nilai awal dari variabel jari-jari lingkaran diinisialisasi dengan nol, 
kemudian diikuti dengan penggunaan asersi untuk memeriksa apakah nilai jari-jari tersebut lebih besar dari nol. 
Karena jari-jari memiliki nilai nol pada awalnya, maka asersi selalu akan mengalami kegagalan, 
sehingga program akan berhenti pada tahap tersebut. Disini, seharusnya nilai jari-jari diinisialisasi dengan nilai yang lebih besar dari nol untuk memastikan bahwa asersi berhasil. 
Contohnya, saya inisialisasi dengan 1.0. 
/*