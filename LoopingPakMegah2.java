package Annisa;
import java.util.Scanner;
public class LoopingPakMegah2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//NOMOR 1
	/*	System.out.println("BILANGAN POSITIF PERTAMA YANG HABIS DIBAGI 3 NAMUN TIDAK HABIS DIBAGI 2");
			Scanner bil = new Scanner(System.in);
			int n;
			
		System.out.print("MASUKKAN BANYAK BILANGAN PERTAMA YANG INGIN ANDA KETAHUI: ");
			n = bil.nextInt();
			
			int b = 0;
		for(int a=1; a<=n;a++) {
			
			b += 3;
			if(b%3==0 && b%2 != 0 ) {
			System.out.println(b);
		}
			else {
				a-=1;
			}
		}
	*/
		
	//NOMOR 3
	/* System.out.println("JUMLAH BILANGAN POSITIF PERTAMA SEBANYAK N");
		Scanner jml = new Scanner(System.in);
		int n,b;
		b = 0;
		
	System.out.print("MASUKKAN SUKU TERKAHIR YANG INGIN ANDA KETAHUI PENJUMLAHANNYA: ");
		n = jml.nextInt();
		
		System.out.print("Deret dari suku tersebut adalah: ");
	for(int a=1; a<=n; a++) {
		b = b+a;
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("Totalnya adalah: " + b);
	*/
		
	//NOMOR 4
	/*	System.out.println("JUMLAH BILANGAN KELIPATAN 3 ATAU 5 YANG KURANG DARI 1000");
			int n,jumlah;
			
			n = 1000;
			jumlah = 0;
		
		System.out.print("DERETNYA ADALAH: ");
		for(int i = 1; i < n; i++) {
			if(i%3==0||i%5==0) {
				jumlah = jumlah+ i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Jumlahnya: "+jumlah);
	*/
		
	
	//NOMOR 5
	/*	System.out.println("PROGRAM DERET 10 BILANGAN FIBONACCI");
		int a,b,c,total;
		a = 1;
		b = 1;
		c = 0;
		total = 0;
		for(int i = 1; i<=10; i++) {
			c = a+b;
			a = b; b = c;
			
			if(i==10) {
				System.out.print(a+".");
			}
			else {
				System.out.print(a+", ");
			}
			total = total + c;
		}
		System.out.println(total);

	*/
		
	
	//NOMOR 6
		System.out.println("PROGRAM DERET BILANGAN FIBONACCI YANG BERNILAI GENAP KURANG DARI 1000");
		int a,b,c,jumlah;
		a = 0;
		b = 1;
		c = 0;
		jumlah = 0;
		System.out.print("Deretnya: ");
		for(int i = 1; i<=1000; i++) {
			c = a+b;
			a = b; b = c; 
			
System.out.println(c);
		}
		System.out.println();
		System.out.println("Jumlahnya: " + jumlah);
	
		
		
	//NOMOR 7
	/*	System.out.println("PROGRAM MENENTUKAN FAKTOR BILANGAN");
		int n = 12;
		
		System.out.print("Faktor dari 12 adalah: ");
		for (int i=1; i<=12; i++) {
			int faktor = n/i;
			if(n%i==0) {
			System.out.print(faktor+" ");
		}
		}
	*/
		
		
	//NOMOR 8 
	/*	System.out.println("===PROGRAM MENENTUKAN FAKTOR BILANGAN===");
			Scanner f = new Scanner(System.in);
			int n,angka;
			

	do {	System.out.println("\n");
			System.out.print("MASUKKAN ANGKA YANG MAU KAMU KETAHUI FAKTORNYA: ");
				angka = f.nextInt();
				
			System.out.print("FAKTORNYA: ");
				for (int i=1; i<=angka; i++) {
					int faktor = angka/i;
					
					if(angka%i==0) {
					System.out.print(faktor+" ");
				}
				}
			System.out.println("\n");
			System.out.print("MASIH MAU TAU FAKTOR ANGKA LAIN? MASUKKAN ANGKA 1 JIKA YA DAN 0 JIKA TIDAK: ");
				n = f.nextInt();
			System.out.println("\n");	
				
			if(n==0) {
				System.out.println("===TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM INI===");
				break;
			}
			else {
				System.out.println("===MASUKKAN ANGKA YANG BENAR!===");
				System.out.print("MASUKKAN DISINI (1/0): ");
					n = f.nextInt();
	
			}
		}
	while (n==1);
	*/
		
		

	//NOMOR 9	
	/* System.out.println("PROGRAM MENENTUKAN NILAI N! DIBAGI FAKTORIAL M!");
		Scanner nm = new Scanner(System.in);
			int n,m,fn,fm;
			fn = 1;
			fm = 1;
			
		System.out.print("MASUKKAN NILAI N: ");
			n = nm.nextInt();
		System.out.print("MASUKKAN NILAI M: ");
			m = nm.nextInt();
		
			for(int i= 1; i<=n; i++) {
				fn *= i;
			}
	
			for(int i = 1; i<=m; i++) {
				fm *= i;
			}
	System.out.println("Nilai "+n+"! adalah: "+fn);
	System.out.println("Nilai "+m+"! adalah: "+fm);
	System.out.println("Hasil pembagiannya adalah: "+ fn/fm);
	*/	
	
		
		
	//NOMOR 10
		System.out.println("PROGRAM MEMBUAT SEGITIGA");
		Scanner segi = new Scanner(System.in);
			int n;
			
		System.out.print("MASUKKAN NILAI N SEBAGAI TINGGI SEGITIGA: ");
			n = segi.nextInt();
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j<i; j++) {
				if(i%2!=0) {
					System.out.print("*");
				}
				else if (i%2==0&&j%2==0){
					System.out.print("#%");
				}
			}
			System.out.println();
		}
			
			
	}

}
