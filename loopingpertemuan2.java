package soaluts;
import java.util.Scanner;

public class loopingpertemuan2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// NOMOR 1
	/*	System.out.println("Nilai program 1-100");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	*/
		
		
		
		// NOMOR 2 Membuat 1, -3, 5, -7, 9, -11, 13, -15
	/*	int total = -1;
		for (int i = 1; i <= 10; i++) {
			total = total + 2;

			if (i % 2 == 0) {
				total = total * -1;
				System.out.print(total + ", ");
				total = total * -1;
			}

			else {
				System.out.print(total + ", ");
			}

		}
	*/
	
		
		//NOMOR 3 Membuat 1,4,9,16
		int total = 1;
		for (int i = 1; i <= 10; i++) {
			total = (int) Math.pow(i, 2);
			System.out.println(total);
			}

	}
}
