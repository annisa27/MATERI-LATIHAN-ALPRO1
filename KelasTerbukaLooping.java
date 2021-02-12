package Annisa;
import java.util.Scanner;
public class KelasTerbukaLooping {

	public static void main(String[] args) {
	
	// WHILE 1
/*	System.out.println("PROGRAM LOOPING PAKE WHILE");
		int a = 1;
		boolean kondisi = true;
		
	while(kondisi) {
		System.out.println("While loop ke- "+ a);
			if(a==100) {
			kondisi = false;
			}
			
		a++;
	}
*/	
		
	// WHILE 2
		Scanner yt = new Scanner (System.in);
		int c;
		boolean t;
	while(true)	{
	System.out.print("MASUKKAN NILAI 1: ");
		c = yt.nextInt();
		
		if(c==1) {
			System.out.println("BENAR");
			break;
		}
		
		else {
			System.out.println("SALAH");
		}
	
	
	}
		
				
		
	//DO WHILE
/*	System.out.println("PROGRAM LOOPING DO WHILE");
		int b = 1;
		boolean kondisi = true;
		
	do {
		System.out.println("NABIEL JELEK "+b);
			if (b==100) {
				kondisi = false;
			}

			b++;
		}
			while(kondisi);
		
	System.out.println("INI AKHIRNYA");
*/ 
		

		
	//FOR
	
	/* for(int a = 1; a<=10; a++) {
		System.out.print(a+" ");
			
	}
	
	System.out.println("\n");
	
	for(int b = 1; b<=10; b++) {
		System.out.print(b*4 +" ");
	}
	
	System.out.println("\n"); */
	
	
	 for(int i = 0; i < 5; i++){
         for(int j = 0; j < 5; j++){
             System.out.print("* ");
         }
         System.out.print("\n");
     }

	 //KOTAK
		for(int i = 0; i < 5; i++) {   
			for(int j = 0; j < 5; j++) {     
				System.out.print("*");   }   
			System.out.println(""); }
	
	
	}

}
	

