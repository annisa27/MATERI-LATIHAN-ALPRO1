package Annisa;
import java.util.Scanner;


public class SelectionPakMegah2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//NOMOR 1
	/*	System.out.println("PROGRAM KONVERSI MATA UANG YEN KE RUPIAH DAN SEBALIKNYA");
			Scanner conv = new Scanner (System.in);
				String x;
				float yen,rupiah;
		
		System.out.println("PILIH MATA UANG YANG INGIN KAMU KONVERSI. INPUT Y UNTUK YEN DAN R UNTUK RUPIAH");
		System.out.print("MASUKKAN KODE MATA UANG: ");
			x = conv.next();
			
	if (x.equalsIgnoreCase("Y")){ 
		System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG YEN: ");
			yen = conv.nextFloat();
		
			rupiah = yen*140;
		
		System.out.println("JUMLAH UANG KAMU DALAM RUPIAH ADALAH: " +rupiah);
			
		}
			
	else if (x.equalsIgnoreCase("R")) {
		System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG RUPIAH: ");
			rupiah = conv.nextFloat();
			
			yen = rupiah/140;
			
		System.out.println("JUMLAH UANG KAMU DALAM RUPIAH ADALAH: " +yen);
		
		}
	
	else {
		System.out.println("MASUKKAN KODE MATA UANG YANG BENAR!");
	}
	*/	
		
		
	
	//NOMOR 2
	/*	System.out.println("PROGRAM PENGHITUNG BIAYA PARKIR ANDA");
			Scanner park = new Scanner(System.in);
				int masuk,keluar,lamaparkir,biaya;
	
		System.out.print("MASUKKAN JAM BERAPA ANDA MASUK (DARI JAM 1 SIANG - 12 MALAM): ");
			masuk = park.nextInt();
		System.out.print("MASUKKAN JAM BERAPA ANDA KELUAR (DARI JAM 1 SIANG - 12 MALAM): ");
			keluar = park.nextInt();
		
			lamaparkir = keluar - masuk;
	
	if (lamaparkir>=1 && lamaparkir<=2) {
			biaya = lamaparkir*2000;
		System.out.println("ANDA PARKIR SELAMA " +lamaparkir+ "JAM. BIAYA PARKIR YANG HARUS ANDA BAYAR ADALAH: "+biaya);
	}
	else if (lamaparkir>2) {
			biaya = (2*2000) + ((lamaparkir-2)*1000);
		System.out.println("ANDA PARKIR SELAMA " +lamaparkir+ "JAM. BIAYA PARKIR YANG HARUS ANDA BAYAR ADALAH: "+biaya);
	}
	else {
		System.out.println("PARKIR MAKSIMAL 12 JAM DAN MINIMAL 1 JAM!");
	}
	
	*/
	
	
		
	//NOMOR 3	
	/*	System.out.println("PROGREAM MENENTUKAN LETAK TITIK DI KUADRAN");
			Scanner letak = new Scanner(System.in);
			int x, y;
			
		System.out.print("INPUT NILAI X: ");
			x = letak.nextInt();
			
		System.out.print("INPUT NILAI Y: ");
			y = letak.nextInt();
			
		if (x>0 && y>0) {
			System.out.println("TITIK TERLETAK DI KUADRAN I");
		}
		else if (x<0 && y>0) {
			System.out.println("TITIK TERLETAK DI KUADRAN II");
		}
		else if (x<0 && y<0) {
			System.out.println("TITIK TERLETAK DI KUADRAN III");
		}
		else if (x>0 && y<0) {
			System.out.println("TITIK TERLETAK DI KUADRAN IV");
		}
		else if ((x>0||x<0) && y == 0) {
			System.out.println("TITIK TERLETAK DI SUMBU X");
		}
		else if ((y>0||y<0) && x == 0) {
			System.out.println("TITIK TERLETAK DI SUMBU Y");
		}
		else {
			System.out.println("TITIK TERLETAK DI PUSAT KARTESIUS");
		}
  	*/
		
	//NOMOR 4
	/*	System.out.println("PROGRAM MENENTUKAN  NILAI SATUAN DARI SUATU BILANGAN");
			Scanner sat = new Scanner(System.in);
			int x;
			
		System.out.print("MASUKKAN NILAI ANDA: ");
			x = sat.nextInt();
			
		if(x>0 && x<10) {
			System.out.println("NILAI SATUANNNYA ADALAH "+x);
		}
		else if(x>=10 && x<100) {
			System.out.println("NILAI SATUANNNYA ADALAH "+x%10);
		}
		else if(x>=100 && x<1000) {
			System.out.println("NILAI SATUANNNYA ADALAH "+x%100%10);
		}
		else if(x>=1000 && x<10000) {
			System.out.println("NILAI SATUANNNYA ADALAH "+x%1000%100%10);
		}
		else {
			System.out.println("NILAI TIDAK BOLEH SAMA DENGAN 0!");
		}
	*/
		

		
	//NOMOR 5
	/*	System.out.println("PROGRAM MEMBAGI BUAH NAGA");
			Scanner buah = new Scanner(System.in);
			int jumlahbuah, jumlahteman, buahperorang, sisabuah,takdapat;
			
		System.out.print("MASUKKAN JUMLAH BUAH YANG ANDA PUNYA: ");
			jumlahbuah = buah.nextInt();
			
		System.out.print("MASUKKAN JUMLAH TEMAN YANG INGIN ANDA BAGIKAN: ");
			jumlahteman = buah.nextInt();
			
			
		if (jumlahbuah>0&&jumlahteman==0) {
				System.out.println("Anda tidak memiliki teman untuk dibagi!");
		}
		else if(jumlahteman>0&&jumlahbuah>0&&jumlahteman<=jumlahbuah) {
			sisabuah = jumlahbuah%jumlahteman;
			buahperorang = (jumlahbuah-sisabuah)/jumlahteman;
			System.out.println("Masing - masing buah naga per-orang adalah "+buahperorang+" buah");
			System.out.println("Buah yang tersisa adalah "+sisabuah+" buah");
		}
		else if(jumlahteman>0&&jumlahbuah>0&&jumlahteman>jumlahbuah) {
			takdapat = jumlahteman-jumlahbuah;
			System.out.println("Ada "+takdapat+" orang yang tidak mendapatkan buah dan ada "+jumlahbuah+" orang yang dapat hanya 1 buah");
		}
		else if (jumlahbuah==0&&jumlahteman>0) {
			System.out.println("Teman anda tidak  mendapat buah dari anda!");
		}
		else if (jumlahbuah>0&&jumlahteman==0) {
			System.out.println("Anda tidak memiliki teman untuk dibagi!");
		}
		else {
			System.out.println("Mohon masukkan angka berupa bilangan bulat lebih dari 0!");
		}
	*/
		
		
	//NOMOR 6
	/*	System.out.println("PROGRAM MENENTUKAN JENIS BILANGAN");
			Scanner jenis = new Scanner(System.in);
			int n;
		System.out.println("INPUT NILAI N: ");
			n = jenis.nextInt();
	
	if (n<10){
		System.out.println("N adalah nilai satuan");
	}
	else if (n>=10 && n<100){
		System.out.println("N adalah nilai puluhan");
	}
	else if (n>=100 && n<1000){
		System.out.println("N adalah nilai ratusan");
	} 	
	else if (n>=100 && n<10000){
		System.out.println("N adalah nilai ribuan");
	} 
	else if (n>=10000 && n<100000){
		System.out.println("N adalah nilai puluhanribu");
	} 
	else {
		System.out.println("MOHON INPUT NILAI POSITIF SATUAN-PULUHANRIBU SAJA");
	}
	*/
		
	//NOMOR 7
    /*    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar persegi : ");
        int lebar = in.nextInt();

        for (int baris = 1; baris <= lebar; baris++) { //perulangan 1
            for (int kolom = 1; kolom <= panjang; kolom++) { //perulangan 2
                if (baris == 1 || baris == lebar || kolom == 1 || kolom == panjang) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
	*/
		
	//NOMOR 8
    /*   for (int i = 1; i <= 10; i++) {
            System.out.print(i + " "); }
    */
        
	//NOMOR 9
    /*    for (int i = 1; i <= 10; i++) {
            System.out.print(i*4 + " ");
        }
	*/
		
	//NOMOR 10 NABIEL
    /*    Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan nilai i : ");
            int i = in.nextInt();
            if (i == 1) {
                System.out.println("Benar");
                break;
            }else{
                System.out.println("Salah");
            }
        }
        in.close();
	*/
	
	}

}
