package alpro1;
import java.util.Scanner;

public class SelectionPakali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//NOMOR 1
		Scanner s = new Scanner(System.in);
		System.out.println("BERAT BADANMU IDEAL ATAU TIDAK YAA?");
		double tb,bb,ideal;
	
		System.out.print("tb = ");
			tb = s.nextDouble();
			
		System.out.print("bb = ");
			bb = s.nextDouble();
			
	ideal = (tb-100) - (1/10 * (tb-100));
	
	if (bb==ideal) {
		System.out.println("Berat badan kamu sudah ideal!");
	}
	else if (bb>ideal-2 && bb<ideal+2) {
		System.out.println("Berat badan kamu ideal, tapi lebih ideal lagi jika " +ideal+ "kg");
	}
	
	else {
		System.out.println("Berat badan kamu tidak ideal! Idealnya " + ideal+ " kg");
	} 
	
	
		
	//NOMOR 2
	/* 	Scanner ya = new Scanner (System.in);
		System.out.println("BIL TERBESARNYA GANJIL/GENAP YA?");
		int a,b;
			System.out.print("Masukkan nilai A = ");
				a = ya.nextInt();
			System.out.print("Masukkan nilai B = ");
				b = ya.nextInt();
				
		if (b>a && b%2==0) {
			System.out.println("Bilangan B adalah bilangan terbesar dan bernilai genap");
		}
		else if (b>a && b%2==1) {
			System.out.println("Bilangan B adalah bilangan terbesar dan bernilai ganjil");
		}
		else if (a>b && a%2==0) {
			System.out.println("Bilangan A adalah bilangan terbesar dan bernilai genap");
		}
		else if (a>b && a%2==1) {
			System.out.println("Bilangan A adalah bilangan terbesar dan bernilai ganjil");
		}
		else { System.out.println("Nilainya seri!");
		} */
		
	//SOAL NOMOR 3	
	/*	Scanner input = new Scanner (System.in);
		
		System.out.println("PROGRAM MENAMPILKAN BANYAK HARI DI SETIAP BULAN\n");
		String bulan;
		
		System.out.print("Masukkan nama bulan (huruf awal kapital) : ");
		bulan = input.next();
		
		switch (bulan) {
			case "Januari", "Maret", "Mei", "Juli", "Agustus", "Oktober", "Desember":
			System.out.println("Banyak hari : 31 Hari");
			break;
			
			case "Februari" :
			System.out.println("Banyak hari : 28 Hari");
			break;
			
			case "April", "Juni", "September", "November" :
			System.out.println("Banyak hari : 30 Hari");
			break;
			
		default :
			System.out.println("\n     =====WARNING=====\n"
						+ "Mohon maaf, inputan anda salah.");
			}  */

	//SOAL NOMOR 1 BIL A
	/* 	Scanner yatoiba = new Scanner (System.in);
	
		System.out.println("PROGRAM KASIR");
			int a,b,c,d,e,f,ayam,bebek,cacing,dadu,entok,flute,TOTAL;
			a = 1000;
			b = 2000;
			c = 3000;
			d = 4000;
			e = 5000;
			f = 6000;
		
		System.out.println("Masukkan jumlah per item yang kamu beli!");
		System.out.print("Jumlah ayam = ");
			ayam = yatoiba.nextInt();
		System.out.print("Jumlah bebek = ");
			bebek = yatoiba.nextInt();
		System.out.print("Jumlah cacing = ");
			cacing = yatoiba.nextInt();
		System.out.print("Jumlah dadu = ");
			dadu = yatoiba.nextInt();
		System.out.print("Jumlah entok = ");
			entok = yatoiba.nextInt();
		System.out.print("Jumlah flute = ");
			flute = yatoiba.nextInt();
		
			TOTAL = (a*ayam) + (b*bebek) + (c*cacing) + (d*dadu) + (e*entok) + (f*flute);
		
		System.out.println("Total yang harus kamu bayarkan = " + TOTAL); */
	
	//SOAL NOMOR 2 BIL A
	//SOAL NOMOR 3 BIL A
		
	/*	Scanner itung = new Scanner (System.in);
			double x,y,z,l,m,n,p;
		
		System.out.println("Masukkan nilai x = ");
			x = itung.nextDouble();
			
		System.out.println("Masukkan nilai y = ");
			y = itung.nextDouble();	
	
		System.out.println("Masukkan nilai m = ");
			m = itung.nextDouble();
			
		System.out.println("Masukkan nilai n = ");
			n = itung.nextDouble();	
			
			z = (Math.pow(x, 2) + Math.pow(y, 2))/2*x*y;
			l = Math.pow((m+n)/2*m*n, 2);
			p = Math.pow((z+l), 3)/z*l;
			
		System.out.println("Nilai p = " + p);
				
	*/
	
	
				
	
	
	
	}

}
