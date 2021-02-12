package alpro1;

import java.util.Calendar;
import java.util.Scanner;
import java.math.*;

public class tugasPertemuan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//SOAL1
	/* System.out.println("PROGRAM MENGHITUNG LUAS SEGIEMPAT");
		int p,l,luassegi4;
		p = 5;
		l = 10;
		luassegi4 = p*l;
	
	System.out.println("Diketahui panjang suatu segiempat adalah " +p+ " dan lebar suatu segiempat adalah " +l);
	System.out.println("Luas dari segiempat tersebut adalah " + luassegi4);
	System.out.println("\n");
	
	
	
	//SOAL2
	System.out.println("PROGRAM MENGHITUNG LUAS SEGITIGA");
		int a,t,luassegi3;
		a = 10;
		t = 5;
		luassegi3 = a*t/2;
		
	System.out.println("Diketahui alas suatu segitiga adalah " +a+ " dan tinggi suatu segitiga adalah " +t);
	System.out.println("Luas dari segitiga tersebut adalah " + luassegi3); 
	System.out.println("\n");
	
	
	
	//SOAL3
	System.out.println("PROGRAM MENGHITUNG LUAS SEGIEMPAT");
		Scanner s = new Scanner(System.in);
		double panjang,lebar,luas;
	
	System.out.print("Panjang sebuah segiempat adalah = ");
		panjang = s.nextDouble();
		
	System.out.print("Lebar sebuah segiempat adalah = ");
		lebar = s.nextDouble();
	
		luas = panjang*lebar;
		
	System.out.println("Luas dari segiempat tersebut adalah = " + luas); 
	System.out.println("\n");
		
		
		
	
	//SOAL4
	System.out.println("PROGRAM MENGHITUNG PANJANG SISI MIRING SEGITIGA SIKU-SIKU");
		Scanner t = new Scanner(System.in);
		double lurus1,lurus2,miring,a,b,c;
	
	System.out.print("Panjang sisi tegak pertama suatu segitiga siku-siku = ");
		lurus1 = t.nextDouble();
		
	System.out.print("Panjang sisi tegak kedua suatu segitiga siku-siku = ");
		lurus2 = t.nextDouble();
		
		
	a = Math.pow(lurus1,2);
	b = Math.pow(lurus2, 2);
	c = a + b;
	miring = Math.sqrt(c);
	
	System.out.print("Panjang sisi miring suatu segitiga siku-siku = " + miring); */
		
	
		
	//SOAL5
	/* System.out.println("PROGRAM RATA-RATA NILAI DARI MATA KULIAH ALPRO 1, FISIKA, DAN AGAMA");
		Scanner c = new Scanner(System.in);
		double alpro,fisika,agama,rataan;
		
	System.out.print("Masukkan nilai mata kuliah Alpro 1 = ");
		alpro = c.nextDouble();
	
	System.out.print("Masukkan nilai mata kuliah Fisika = ");
		fisika = c.nextDouble();
	
	System.out.print("Masukkan nilai mata kuliah Agama = ");
		agama = c.nextDouble();
		
		rataan = (alpro+fisika+agama)/3;
		
	System.out.println("Maka, rata-rata dari ketiga MK tersebut adalah = " +rataan); */
		
		
		
	//SOAL6
	/* System.out.println("PROGRAM MENCARI NILAI MAKSIMUM DARI 3 ANGKA");
		Scanner an = new Scanner(System.in);
		double a,b,c;
		
	System.out.print("Masukkan angka pertama = ");
		a = an.nextDouble();
	
	System.out.print("Masukkan angka kedua = ");
		b = an.nextDouble();
	
	System.out.print("Masukkan angka ketiga = ");
		c = an.nextDouble();
		
	if (a > b && a > c){ 
		System.out.println("Maka, angka terbesar adalah = " + a);
	}
	else if (b > a && b > c){ 
		System.out.println("Maka, angka terbesar adalah = " + b);
	}
	else if (c > a && c > b){ 
		System.out.println("Maka, angka terbesar adalah = " + c);
	}
	else if (a == b && b > c) {
			System.out.println("Maka, angka terbesar adalah = " + a);
	}
	else if (b == c && b > a) {
		System.out.println("Maka, angka terbesar adalah = " + b);
	}
	
	else if (c == a && a > b) {
		System.out.println("Maka, angka terbesar adalah = " + c);
	}
	else if (a == b && b < c) {
		System.out.println("Maka, angka terbesar adalah = " + c);
	}
	else if (b == c && b < a) {
		System.out.println("Maka, angka terbesar adalah = " + a);
	}

	else if (c == a && a < b) {
		System.out.println("Maka, angka terbesar adalah = " + b);
	}

	else {
		System.out.println("Tidak ada angka yang paling besar karena semuanya sama");
	} */
		

		
		
	
	//SOAL7
	System.out.println("PROGRAM MENCARI NILAI MINIMUM DARI 3 ANGKA");
		Scanner ya = new Scanner(System.in);
		double a,b,c;
		
	System.out.print("Masukkan angka pertama = ");
		a = ya.nextDouble();
	
	System.out.print("Masukkan angka kedua = ");
		b = ya.nextDouble();
	
	System.out.print("Masukkan angka ketiga = ");
		c = ya.nextDouble();
		
	if (a < b && a < c){ 
		System.out.println("Maka, angka terkecil adalah = " + a);
	}
	else if (b < a && b < c){ 
		System.out.println("Maka, angka terkecil adalah = " + b);
	}
	else if (c < a && c < b){ 
		System.out.println("Maka, angka terkecil adalah = " + c);
	}
	else if (a == b && b > c) {
			System.out.println("Maka, angka terkecil adalah = " + c);
	}
	else if (b == c && b > a) {
		System.out.println("Maka, angka terkecil adalah = " + a);
	}
	
	else if (c == a && a > b) {
		System.out.println("Maka, angka terkecil adalah = " + b);
	}
	else if (a == b && b < c) {
		System.out.println("Maka, angka terkecil adalah = " + a);
	}
	else if (b == c && b < a) {
		System.out.println("Maka, angka terkecil adalah = " + b);
	}

	else if (c == a && a < b) {
		System.out.println("Maka, angka terkecil adalah = " + c);
	}

	else {
		System.out.println("Tidak ada angka yang paling kecil karena semuanya sama");
	}
	
	
	
		
	//SOAL8
	/* System.out.println("PROGRAM MENENTUKAN UMUR");
	System.out.println("Lewat program ini anda bisa mengetahui umur anda di tahun kapanpun!");
	System.out.println("\n");
		Scanner u = new Scanner(System.in);
		int umur, thini, thlahir;
		
	System.out.print("Masukkan tahun lahir anda = ");
		thlahir = u.nextInt();
	
	System.out.print("Masukkan tahun yang anda ingin ketahui umur anda saat tahun tersebut = ");
		thini = u.nextInt();
		
		umur = thini - thlahir;
	
	System.out.println("Umur anda di tahun "+thini+" adalah " + umur + " tahun"); */
		
	//SOAL 8.1
	System.out.println("PROGRAM UNTUK MENAMPILKAN UMUR");
		Scanner s = new Scanner(System.in);
		Calendar kalender = Calendar.getInstance();
			int tahunIni, tahunLahir, umur;
	
	tahunIni = kalender.get(Calendar.YEAR);

	System.out.print("Masukkan tahun anda lahir : ");
		tahunLahir = s.nextInt();
	
	umur = tahunIni - tahunLahir;
	
	System.out.println("Jadi umur anda sekarang adalah "+ umur + " tahun");
	
		
	//SOAL9
	/* System.out.println("Tentukan hasil bagi bulat dari 2 bilangan berikut!");
		Scanner bil = new Scanner(System.in);
		int x, y, z;
		
	System.out.print("Masukkan bilangan pertama = ");
		x = bil.nextInt();
		
	System.out.print("Masukkan bilangan kedua = ");
		y = bil.nextInt();
		
		z = x/y;
		
	System.out.println("Maka hasil dari bilangan pertama dibagi bilangan kedua adalah = "+z); */
	
	
	
	//SOAL10
	/* System.out.println("Tentukan sisa bagi bulat dari 2 bilangan berikut!");
		Scanner bil = new Scanner(System.in);
		int x, y, z;
		
	System.out.print("Masukkan bilangan pertama = ");
		x = bil.nextInt();
		
	System.out.print("Masukkan bilangan kedua = ");
		y = bil.nextInt();
		
		z = x%y;
		
	System.out.println("Maka sisa dari bilangan pertama dibagi bilangan kedua adalah = "+z); */
		
	//SOAL11
	/* System.out.println("Tentukanlah nilai C dari persamaan B = 2*A*A + A - 1 dan C = (73+B)/3 dimana A akan diberikan melalui input keyboard");
		Scanner n = new Scanner(System.in);
		double A,B,C;
		
	System.out.print("Masukkan nilai A = ");
		A = n.nextDouble();
		
		B = (2*Math.pow(A, 2)) + A - 1;
		C = (73 + B)/3;
		
	System.out.println("Maka, nilai dari C adalah = " + C); */
	
	
	
	//SOAL GATAU
	/* Scanner z = new Scanner (System.in);
		
		System.out.print("Masukkan nilai a = ");
			int a = z.nextInt();
		
		if (a<=10 && a%2 == 0) { 
				System.out.println("genap"); 
				}
				
			else if (a<=10 && a%2 == 1){ 
				System.out.println("ganjil"); 
				}
		
		else { System.out.println("Angka lebih dari 10"); }

	*/ 
	
	}	

}
