package Annisa;
import java.util.Scanner;
import java.math.*;

public class SelectionPakmegah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NOMOR 1
		/*	System.out.println("PROGRAM MENENTUKAN BILANGAN POSITIF ATAU NEGATIF");
			System.out.println("\n");
				Scanner pn = new Scanner(System.in);
					double a;
			
				System.out.print("Masukkan bilangan anda = ");
					a = pn.nextDouble();
			
		if (a>0) {
			System.out.println("Bilangan anda merupakan bilangan positif");
		}
		else{
			System.out.println("Bilangan anda merupakan bilangan negatif");
		}
		*/
		
		
		//NOMOR 2
		/* 	System.out.println("PROGRAM MENENTUKAN BILANGAN POSITIF ATAU NEGATIF");
			System.out.println("\n");
			Scanner pn = new Scanner(System.in);
				double a;
				String hasil;
		
			System.out.print("Masukkan bilangan anda = ");
				a = pn.nextDouble();
				
			hasil = (a>0)? "positif" : "negatif";
			
			System.out.println("Bilangan anda merupakan bilangan " + hasil);
		*/
		
		
		//NOMOR 3
		/*	System.out.println("PROGRAM MENENTUKAN APAKAH SIKU2 ATAU TIDAK");
			System.out.println("\n");
				Scanner s = new Scanner(System.in);
					double a,b,c;
			
			System.out.print("Masukkan sisi tegak 1 = ");
				a = s.nextDouble();
			System.out.print("Masukkan sisi tegak 2 = ");
				b = s.nextDouble();
			System.out.print("Masukkan sisi miring = ");
				c = s.nextInt(); 
				
		if (a<b && b<c && Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c,2)) {
			System.out.println("SIKU2");
		}
		else {
			System.out.println("BUKAN SIKU2");
		}
		*/
		
		
		//NOMOR 4
		/* 	System.out.println("PROGRAM MENENTUKAN APAKAH SIKU2 ATAU TIDAK");
			System.out.println("\n");
				Scanner s = new Scanner(System.in);
					double a,b,c;
					String hasil;
			
			System.out.print("Masukkan sisi tegak 1 = ");
				a = s.nextDouble();
			System.out.print("Masukkan sisi tegak 2 = ");
				b = s.nextDouble();
			System.out.print("Masukkan sisi miring = ");
				c = s.nextInt(); 
				
			hasil = (a<b && b<c && Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c,2))? "ITU SISI SEGITIGA SIKU2" : "ITU BUKAN SISI SEGITIGA SIKU2";
			
			System.out.println(hasil);
		*/
		
		
		//NOMOR 5
		/*	System.out.println("KAMU BOLEH NONTON ATAU TIDAK YAA?");
			System.out.println("\n");
				Scanner s = new Scanner(System.in);
					int u,tunggu;
			
			System.out.print("Masukkan umur kamu: ");
				u = s.nextInt();
				
				tunggu = 17 - u;
				
		if(u>=17) {
			System.out.println("Kamu boleh nonton film ini!");
		}
		else {
			System.out.println("Wah maaf sekali kamu belum cukup umur untuk menonton film ini! ):");
			System.out.println("Tunggu "+tunggu+" tahun lagi ya!");
		} 
		*/
		
		
		//NOMOR 6
		/*	System.out.println("KAMU BOLEH NONTON ATAU TIDAK YAA?");
			System.out.println("\n");
				Scanner s = new Scanner(System.in);
					int u,tunggu;
					String hasil;
			
			System.out.print("Masukkan umur kamu: ");
				u = s.nextInt();
				
				tunggu = 17 - u;
				
		hasil = (u>=17)? "Kamu boleh nonton!" : "Kamu Belum boleh nonton! Tunggu " +tunggu+ " tahun lagi ya!";
			
			System.out.println(hasil);
		*/
		
		
		//NOMOR 7
		/* System.out.println("MASUKKAN USIA ANDA AGAR TAU MASUK KE RUANGAN MANA!");
				Scanner s = new Scanner(System.in); 
					int umur;
					
			System.out.print("Umur anda: ");
				umur = s.nextInt();
			
			if (umur>=1 && umur<10) {
				System.out.println("ANDA MASUK KATEGORI ANAK-ANAK");
			}
			else if (umur >= 10 && umur<50) {
				System.out.println("ANDA MASUK KATEGORI DEWASA");
			}
			else if (umur>= 50) {
				System.out.println("ANDA MASUK KATEGORI LANSIA");
			}
			else {
				System.out.println("TIDAK MUNGKIN UMUR KURANG DARI 0 TAHUN!");
			}
		*/
		
		
		
		//NOMOR 7.1
		/*	System.out.println("MASUKKAN USIA ANDA AGAR TAU MASUK KE RUANGAN MANA!");
				Scanner s = new Scanner(System.in);
					int umur;
					String hasil;
			
			System.out.print("Umur anda: ");
				umur = s.nextInt();	
				
			hasil = (umur>= 1 && umur<10)? "ANDA MASUK DALAM KATEGORI ANAK-ANAK" : 
					(umur>10 && umur<50)? "ANDA MASUK DALAM KATEGORI DEWASA":
					(umur>50)? "ANDA MASUK DALAM KATEGORI LANSIA":
					"TIDAK MUNGKIN UMUR KURANG DARI 0 TAHUN!";
			System.out.println(hasil);
		*/				
	
		
		//NOMOR 8
		/*	System.out.println("PROGRAM MENENTUKAN BENTUK AKAR DARI PERSAMAAN KUADRAT BENTUK AX^2+BX+C=0");
				Scanner akar = new Scanner(System.in);
					double a,b,c,d;
	
			System.out.print("Masukkan nilai A:");
				a = akar.nextDouble();
	
			System.out.print("Masukkan nilai B:");
				b = akar.nextDouble();
	
			System.out.print("Masukkan nilai C:");
				c = akar.nextDouble();
		
				d = Math.pow(b, 2) - (4*a*c);
			
		if(d>0 && a!=0) {
			System.out.println("Akar-akar dari persamaan tersebut berbeda");
		}
		else if(d==0 && a!=0) {
			System.out.println("Akar-akar dari persamaan tersebut kembar");
		}
		else if(d<0 && a!=0) {
			System.out.println("Persamaan tersebut tidak memiliki akar real");
		}
		else {
			System.out.println("Nilai A tidak boleh sama dengan 0!");
		}
		*/
		
		
		
		//NOMOR 9
		/*	System.out.println("PROGRAM MENENTUKAN NILAI AKAR DARI PERSAMAAN KUADRAT BENTUK AX^2+BX+C=0");
				Scanner akar = new Scanner(System.in);
				double a,b,c,akar1,akar2;
			
			System.out.print("Masukkan nilai A:");
				a = akar.nextDouble();
			
			System.out.print("Masukkan nilai B:");
				b = akar.nextDouble();
			
			System.out.print("Masukkan nilai C:");
				c = akar.nextDouble();
				
				akar1 = ((-1*b)+(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/2*a;
				akar2 = ((-1*b)-(Math.sqrt((Math.pow(b, 2))-(4*a*c))))/2*a;
		
		if (a!=0) {
			System.out.println("Maka akar-akar dari persamaan kuadrat tersebut adalah "+akar1+" dan "+akar2);
		}
		else {
			System.out.println("Nilai A tidak boleh sama dengan 0!");
		}
		*/
	
		
		//NOMOR 10
		/*	System.out.println("KONVERSI NILAI ANGKA KE DALAM HURUF");
				Scanner nilai = new Scanner(System.in);
				double n;
				
			System.out.print("Masukkan nilai kamu dalam bentuk angka dari interval 1-100: ");
				n = nilai.nextDouble();
				
			if (n>86 && n<=100) {
				System.out.println("Nilai kamu dalam bentuk huruf adalah A");
			}
			else if (n<=86 && n>71) {
				System.out.println("Nilai kamu dalam bentuk huruf adalah B");
			}
			else if (n<=71 && n>56) {
				System.out.println("Nilai kamu dalam bentuk huruf adalah C");
			}
			else if (n<=56 && n>41) {
				System.out.println("Nilai kamu dalam bentuk huruf adalah D");
			}
			else if (n<=41 && n>= 0) {
				System.out.println("Nilai kamu dalam bentuk huruf adalah E");
			}
			else {
				System.out.println("Masukkan angka nilai yang benar!");
			}
		*/
		
		
		//NOMOR 11
		/*	System.out.println("PROGRAM OPERATOR LOGIKA");
				boolean a,b,c;
				
			System.out.println("==== OR (||) =====");
				a = false;
				b = false;
				c = (a||b);
					System.out.println(a + " || " + b + " = " + c);
	        	a = false;
	        	b = true;
	        	c = (a||b);
	        		System.out.println(a + " || " + b + " = " + c);
	        	a = true;
	        	b = false;
	        	c = (a||b);
	        		System.out.println(a + " || " + b + " = " + c);
	        	a = true;
	        	b = true;
	        	c = (a||b);
	        		System.out.println(a + " || " + b + " = " + c);


	        System.out.println("==== AND (&&) =====");
	        	a = false;
	        	b = false;
	        	c = (a && b);
	        		System.out.println(a + " && " + b + " = " + c);
	        	a = false;
	        	b = true;
	        	c = (a&&b);
	        		System.out.println(a + " && " + b + " = " + c);
	        	a = true;
	        	b = false;
	        	c = (a&&b);
	        		System.out.println(a + " && " + b + " = " + c);
	        	a = true;
	        	b = true;
	        	c = (a&&b);
	        		System.out.println(a + " && " + b + " = " + c);
	        

	        System.out.println("==== XOR (^) =====");
	        	a = false;
	        	b = false;
	        	c = (a ^ b);
	        		System.out.println(a + " ^ " + b + " = " + c);
	        	a = false;
	        	b = true;
	        	c = (a^b);
	        		System.out.println(a + " ^ " + b + " = " + c);
	        	a = true;
	        	b = false;
	        	c = (a^b);
	        		System.out.println(a + " ^ " + b + " = " + c);
	        	a = true;
	        	b = true;
	        	c = (a^b);
	        		System.out.println(a + " ^ " + b + " = " + c);

	        		
	        System.out.println("==== NEGASI (!) ====");
	        	a = true;
	        	c = !a;
	        		System.out.println(a + " --> (!) = " + c);

	        	a = false;
	        	c = !a;
	        		System.out.println(a + " --> (!) = " + c);
	        	
	        	b = false;
		        c = !a;
		        	System.out.println(b + " --> (!) = " + c);

		        b = true;
		        c = !a;
		        	System.out.println(b + " --> (!) = " + c);
		*/
		
		
				
		//NOMOR 12
			System.out.println("PROGRAM KASIR");
				Scanner kasir = new Scanner(System.in);
				int hargaMilo,hargaKopi,hargaTehbotol,hargaJusmangga,a,b,c,d,jumlah,diskon,total;
				
				hargaMilo = 7500;
				hargaKopi = 4000;
				hargaTehbotol = 3500;
				hargaJusmangga = 5000;
				
			System.out.println("Masukkan jumlah item belanja anda!");
			System.out.print("Milo: ");
				a = kasir.nextInt();
					
			System.out.print("Kopi: ");
				b = kasir.nextInt();
					
			System.out.print("Teh Botol: ");
				c = kasir.nextInt();
					
			System.out.print("Jus Mangga: ");
				d = kasir.nextInt();
					
				jumlah = (a*hargaMilo)+(b*hargaKopi)+(c*hargaTehbotol)+(d*hargaJusmangga);

			if (jumlah>100000) {
				diskon = jumlah*15/100;
				total = jumlah - diskon;
				System.out.println("Selamat! anda mendapatkan diskon sebesar 15%. Harga yang harus dibayarkan adalah " + total);
			}
			else if (jumlah<=100000 && jumlah>50000) {
				diskon = jumlah*75/1000;
				total = jumlah - diskon;
				System.out.println("Selamat! anda mendapatkan diskon sebesar 7,5%. Harga yang harus dibayarkan adalah " + total);
			}
			else {
				diskon = jumlah*0;
				total = jumlah - diskon;
				System.out.println("Harga yang harus dibayarkan adalah " + total);
			}
				
			
	
	}

}
