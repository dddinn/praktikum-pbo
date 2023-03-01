
//Nama file : Titik.java
//Penulis 	: Dafa Kurnia Dinata/24060121120003
//Tanggal	: 22/02/2023
//Deskripsi : Kelas yang berisi realisasi program kelas titik

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
	void setAbsis(double a){
		absis=a;
	}
	
	void setOrdinat(double a){
		ordinat=a;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}