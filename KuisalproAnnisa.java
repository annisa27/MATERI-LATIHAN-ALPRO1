package alpro1;
import java.util.Scanner;

public class KuisalproAnnisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("PROGRAM MENGHITUNG GAJI KARYAWAN");
		Scanner s = new Scanner(System.in);
		double gajitotal,gajipokok,jumlahanak,statuskawin,tunjangankesehatan,tunjangananak,pajak;
		
		System.out.print("Masukkan besar gaji pokok: ");
			gajipokok = s.nextDouble();
		
		System.out.print("Masukkan status perkawinan! isi 1 jika sudah kawin, isi 0 jika belum: ");
			statuskawin = s.nextDouble();
		
		
		if(statuskawin==1) {
			
			System.out.print("Masukkan jumlah anak anda: ");
			jumlahanak = s.nextDouble();
			if(jumlahanak >= 2) {
				tunjangananak = 200000;
			}
			else if (jumlahanak == 1){
				tunjangananak = 100000;
			}
			else {
				tunjangananak = 0;
			}
		}
		else {
			tunjangananak = 0;
		}
		
		
		if(gajipokok<=3000000) {
			pajak = gajipokok*5/100;
		}
		else {
			pajak = gajipokok*10/100;
		}
		
		tunjangankesehatan = gajipokok*5/100;
		gajitotal = gajipokok + tunjangankesehatan - pajak + tunjangananak;

		System.out.println("Gaji anda Rp"+ gajitotal);
	
	}

}
