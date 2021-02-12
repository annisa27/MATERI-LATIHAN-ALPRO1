package soaluts;
import java.util.Scanner;
public class pixelpotong {

	public static void main(String[] args) {
		int pixel1, pixel2, pixel3;
		final int batasBawah = 0;
		final int batasAtas = 255;
		int pemotongan = 0;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan nilai pixel pertama : ");
		pixel1 = input.nextInt();
		
		System.out.print("Masukkan nilai pixel kedua : ");
		pixel2 = input.nextInt();
		
		System.out.print("Masukkan nilai pixel ketiga : ");
		pixel3 = input.nextInt();
		
		if (pixel1 >= 0 && pixel1 <= 255) {
			System.out.println("Besar pixel pertama : " + pixel1);
		} else if (pixel1 < 0) {
			System.out.println("Besar pixel pertama : " + batasBawah);
			pemotongan += 1;
		}  else if (pixel1 > 255) {
			System.out.println("Besar pixel pertama : " + batasAtas);
			pemotongan += 1;
		}
		if (pixel2 >= 0 && pixel2 <= 255) {
			System.out.println("Besar pixel kedua : " + pixel2);
		} else if (pixel2 < 0) {
			System.out.println("Besar pixel kedua : " + batasBawah);
			pemotongan += 1;
		}  else if (pixel2 > 255) {
			System.out.println("Besar pixel kedua : " + batasAtas);
			pemotongan += 1;
		}
		if (pixel3 >= 0 && pixel3 <= 255) {
			System.out.println("Besar pixel ketiga : " + pixel3);
		} else if (pixel3 < 0) {
			System.out.println("Besar pixel ketiga : " + batasBawah);
			pemotongan += 1;
		}  else if (pixel3 > 255) {
			System.out.println("Besar pixel ketiga : " + batasAtas);
			pemotongan += 1;
		}
		
		System.out.println("Jumlah Pemotongan = "+pemotongan);

	}

}
