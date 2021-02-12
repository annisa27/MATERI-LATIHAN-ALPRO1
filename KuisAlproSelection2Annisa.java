package alpro1;

import java.util.Scanner;

public class KuisAlproSelection2Annisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	System.out.println("PROGRAM MENGHITUNG NILAI RATUSAN, PULUHAN, DAN SATUAN DARI ANGKA RATUSAN");
		Scanner ubah = new Scanner(System.in);
			int a,ratusan,puluhan,satuan;
			
		System.out.print("Masukkan angka anda: ");
			a = ubah.nextInt();
			
			ratusan =a/100;
			puluhan =(a-ratusan*100)/10;
			satuan =(a-ratusan*100-puluhan*10);
			System.out.printf("Satuannya " +satuan+ " puluhannya " +puluhan+ " ratusannya " +ratusan);
	*/	
		
	/*	System.out.println("PROGRAM KONVERSI MATA UANG RUPIAH KE MATA UANG NEGARA LAIN");
		Scanner conv = new Scanner (System.in);
			int x;
			float yen,rupiah,dollar,ringgit,poundsterling;
	
	System.out.println("PILIH MATA UANG YANG INGIN KAMU KONVERSI");
	System.out.println("INPUT 1 UNTUK YEN");
	System.out.println("INPUT 2 UNTUK RINGGIT");
	System.out.println("INPUT 3 UNTUK DOLLAR AMERIKA");
	System.out.println("INPUT 4 UNTUK POUNDSTERLING");
	System.out.print("MASUKKAN KODE MATA UANG: ");
		x = conv.nextInt();
		
if (x==1){ 
	System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG RUPIAH: ");
		rupiah = conv.nextFloat();
	
		yen = rupiah/140;
	
	System.out.println("JUMLAH UANG KAMU DALAM MATA UANG YEN ADALAH: " +yen+ " yen");
	}

else if (x==2){ 
		System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG RUPIAH: ");
			rupiah = conv.nextFloat();
		
			ringgit = rupiah/3500;
		
		System.out.println("JUMLAH UANG KAMU DALAM MATA UANG RINGGIT ADALAH: " +ringgit+ " ringgit");
		
	}

else if (x==3){ 
		System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG RUPIAH: ");
		rupiah = conv.nextFloat();
	
		dollar = rupiah/14500;
	
	System.out.println("JUMLAH UANG KAMU DALAM MATA UANG DOLLAR AMERIKA ADALAH: " +dollar+ " dollar");
	
}

else if (x==4){ 
	System.out.print("MASUKKAN BANYAK UANG DALAM MATA UANG RUPIAH: ");
	rupiah = conv.nextFloat();

	poundsterling = rupiah/19000;

System.out.println("JUMLAH UANG KAMU DALAM MATA UANG POUNDSTERLING ADALAH: " +poundsterling+" poundsterling");

}

else {
	System.out.println("MASUKKAN KODE MATA UANG YANG BENAR!");
}

*/

			int[] A = {3,1,9,2,3,3,4,0,-1,10,8,8,7,4,8};
			int[] B = new int[A.length];
			int[] C = new int[A.length];

			for (int i = 0; i < A.length; i++) {
				if (A[i]%2 == 0 && A[i]!= 0 ) {
					B[i] = A[i];
				}else if (A[i]%2 != 0 && A[i]!= 0 ){
					C[i] = A[i];
				}
			}
			
			System.out.print("Genap : ");
			for (int i = 0; i < B.length; i++) {
				if (B[i] != 0) System.out.print(B[i] + ", ");
			}System.out.println();
			
			System.out.print("Ganjil : ");
			for (int i = 0; i < C.length; i++) {
				if (C[i] != 0) System.out.print(C[i] + ", ");
			}
			
			
			
	}

}
