package soaluts;
import java.util.Scanner;

public class soalpertemuan2_calculator {

	public static void main(String[] args) {
		//NOMOR 1
	/*	System.out.println("Operasi Boolean");
			boolean a,b,c;
			a = true;
			b = false;
		
		System.out.print("NILAI A AND B: ");
			c = (a && b);
		System.out.println(c);

		System.out.print("NILAI A OR B: ");
			c = (a||b);
		System.out.println(c);
		
		System.out.print("NILAI NOT (A AND B): ");
			c = !(a && b);
		System.out.println(c);
		
		System.out.print("NILAI NOT (A OR B): ");
			c = !(a || b);
		System.out.println(c);
		
		System.out.print("NILAI NOT A AND NOT B: ");
			c = !(a) && !(b);
		System.out.println(c);
	*/
		
		
		//NOMOR 2
	/*	System.out.println("KALKULATOR SEDERHANA 2 BIL BULAT");
		System.out.println("DIKETAHUI A = 7 dan B = 2");
			int a,b;
			a = 7;
			b = 2;
			
		System.out.println("HASIL A+B= "+ (a+b) );
		System.out.println("HASIL A-B= "+ (a-b) );
		System.out.println("HASIL A*B= "+ (a*b) );
		System.out.println("HASIL A/B= "+ (a/b) );
		System.out.println("HASIL SISA A/B= "+ (a%b) );
	*/
		
		//NOMOR 6
	/*	System.out.println("MENGGABUNGKAN 2 STRING");
			String x,y;
			Scanner cr = new Scanner (System.in);
		
		System.out.print("MASUKKAN KARAKTER 1: ");
			x = cr.next();
			
		System.out.print("MASUKKAN KARAKTER 2: ");
			y = cr.next();
			
		System.out.println(x+y);
	*/	
		
		//NOMOR 7
	/*	System.out.println("PROGRAM KONVERSI SUHU DARI CELCIUS KE FAHRENHEIT KE KELVIN KE REAMUR");
			double c, f, k, r;
			c = 200;
			f = (c*9/5) + 32;
			k = ((f - 32)*5/9) + 273;
			r = (k - 273.15) * 0.8;
		System.out.println("Suhu dalam Celcius = "+ c);
		System.out.println("Suhu dalam Fahrenheit = "+ f);
		System.out.println("Suhu dalam Kelvin = "+ k);
		System.out.println("Suhu dalam Reamur = "+ r);
	*/
		
		//NOMOR 8
	/*	System.out.println("PROGRAM KONVERSI WAKTU");
			int jam,menit,detik;
			jam = 1;
			menit = jam*60;
			detik = menit*60;
		System.out.println(detik);
	*/
		
		//SELEKSI 1
		System.out.println("PROGRAM MEMBANDINGKAN HARGA HP");
			String merkhp,tipehp1,tipehp2;
			int harga1=0, harga2=0;
			Scanner hp = new Scanner(System.in);
			
		
		System.out.print("MASUKKAN MERK HP YANG INGIN ANDA BELI: ");
			merkhp = hp.next();
			
			if(merkhp.equalsIgnoreCase("samsung")) {
				System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(M40/A60/A80): ");
				tipehp1 = hp.next();
				if (tipehp1.equals("M40")||tipehp1.equals("m40")) {
					harga1 = 4100000;
					System.out.println("Harganya: "+ harga1);
				}
				else if (tipehp1.equals("A60")||tipehp1.equals("a60")) {
					harga1 = 4250000;
					System.out.println("Harganya: "+ harga1);
				}
				else if (tipehp1.equals("A80")||tipehp1.equals("a80")) {
					harga1 = 9500000;
					System.out.println("Harganya: "+ harga1);
				}
				else {
					System.out.println("===ERROR=== \n MASUKKAN TIPE HP YANG BENAR!");
				}
			}
			
			else if(merkhp.equals("OPPO")||merkhp.equals("oppo")||merkhp.equals("Oppo")) {
				System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(K3/Reno/A9X): ");
				tipehp1 = hp.next();
				if (tipehp1.equals("K3")||tipehp1.equals("k3")) {
					harga1 = 3300000;
					System.out.println("Harganya: "+ harga1);
				}
				else if (tipehp1.equals("Reno")||tipehp1.equals("reno")||tipehp1.equals("RENO")) {
					harga1 = 3000000;
					System.out.println("Harganya: "+ harga1);
				}
				else if (tipehp1.equals("A9X")||tipehp1.equals("A9x")||tipehp1.equals("a9x")) {
					harga1 = 4100000;
					System.out.println("Harganya: "+ harga1);
				}
				else {
					System.out.println("===ERROR=== \n MASUKKAN TIPE HP YANG BENAR!");
				}
			}
			
			else if(merkhp.equals("VIVO")||merkhp.equals("vivo")||merkhp.equals("Vivo")) {
					System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(K3: ");
					tipehp1 = hp.next();
					if (tipehp1.equals("Y3")||tipehp1.equals("y3")) {
						harga1 = 2000000;
						System.out.println("Harganya: "+ harga1);
					}
					else if (tipehp1.equals("Y58")||tipehp1.equals("y58")) {
						harga1 = 3000000;
						System.out.println("Harganya: "+ harga1);
					}
					else {
						System.out.println("===ERROR===\nMASUKKAN TIPE HP YANG BENAR!");
					}
				}
				
				
			else {
				System.out.println("===ERROR===\nMASUKKAN MERK HP YANG BENAR!");
			}
			
			System.out.println();
			
			System.out.print("MASUKKAN MERK HP YANG INGIN ANDA BELI: ");
			merkhp = hp.next();
			
			if(merkhp.equals("SAMSUNG")||merkhp.equals("samsung")||merkhp.equals("Samsung")) {
				System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(M40/A60/A80): ");
				tipehp1 = hp.next();
				if (tipehp1.equals("M40")||tipehp1.equals("m40")) {
					harga2 = 4100000;
					System.out.println("Harganya: "+ harga2);
				}
				else if (tipehp1.equals("A60")||tipehp1.equals("a60")) {
					harga2 = 4250000;
					System.out.println("Harganya: "+ harga2);
				}
				else if (tipehp1.equals("A80")||tipehp1.equals("a80")) {
					harga2 = 9500000;
					System.out.println("Harganya: "+ harga2);
				}
				else {
					System.out.println("===ERROR=== \n MASUKKAN TIPE HP YANG BENAR!");
				}
			}
			
			else if(merkhp.equals("OPPO")||merkhp.equals("oppo")||merkhp.equals("Oppo")) {
				System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(K3/Reno/A9X): ");
				tipehp1 = hp.next();
				if (tipehp1.equals("K3")||tipehp1.equals("k3")) {
					harga2 = 3300000;
					System.out.println("Harganya: "+ harga2);
				}
				else if (tipehp1.equals("Reno")||tipehp1.equals("reno")||tipehp1.equals("RENO")) {
					harga2 = 3000000;
					System.out.println("Harganya: "+ harga2);
				}
				else if (tipehp1.equals("A9X")||tipehp1.equals("A9x")||tipehp1.equals("a9x")) {
					harga2 = 4100000;
					System.out.println("Harganya: "+ harga2);
				}
				else {
					System.out.println("===ERROR=== \n MASUKKAN TIPE HP YANG BENAR!");
				}
			}
			
			else if(merkhp.equals("VIVO")||merkhp.equals("vivo")||merkhp.equals("Vivo")) {
					System.out.print("MASUKKAN TIPE HP YANG INGIN ANDA BELI(K3: ");
					tipehp1 = hp.next();
					if (tipehp1.equals("Y3")||tipehp1.equals("y3")) {
						harga2 = 2000000;
						System.out.println("Harganya: "+ harga2);
					}
					else if (tipehp1.equals("Y58")||tipehp1.equals("y58")) {
						harga2 = 3000000;
						System.out.println("Harganya: "+ harga2);
					}
					else {
						System.out.println("===ERROR===\nMASUKKAN TIPE HP YANG BENAR!");
					}
				}
				
				
			else {
				System.out.println("===ERROR===\nMASUKKAN MERK HP YANG BENAR!");
			}
			
			System.out.println();
			
			

			
	}

}
