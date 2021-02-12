package Annisa;
import java.util.Scanner;

public class LoopingPakMegah1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NOMOR 1
		/* for(int i = 0; i <= 4; i++) {   
			for(int j = 0; j < i; j++) {     
				System.out.print("*");   
				}   
			System.out.println(); 
			
		}
		*/ 
		
		//NOMOR 2
		/* for (int i = 4; i >= 1; i--){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
		
		//NOMOR 3
		/* for(int i = 0; i < 5; i++) {   
			for(int j = 0; j < 16; j++) { 
				if(j%5==0) {
					System.out.print("$");
				}
			else{
				System.out.print("*");
			}
				
				}   
			System.out.println(""); 
			}
		*/
		

		
		//NOMOR 4
		/* for(int i = 0; i <= 5; i++) {   
			for(int j = 0; j < i; j++) { 
				if(i%2==1) {
					System.out.print("*"); 
				}
				else {
					System.out.print("#");
				}
				}   
			System.out.println(); 
		}
		*/
		
		
		//NOMOR 5
	/*	for(int i = 3; i > 0; i--) {
			int sisa = i-1;
		
			if(i>1&&sisa>0) {
			System.out.println("Anak ayam turunlah "+i+" Mati satu tinggal "+ sisa);
			}
			else {
				System.out.println("Anak ayam turunlah "+i+" Mati satu maka habis");
			}
		}
		*/
		
		//NOMOR 6
		/*	int a = 1;
		   for(int i = 1; i<=5; i++){
	            a *= i;
	        }
	        System.out.println("Faktorial adalah "+a);
	    */    
	        
	   //NOMOR 7
        int sukuterakhir,jumlah;
        sukuterakhir = 5;
        jumlah = 0;
        System.out.print("Deretnya: ");
        for (int x = 1; x <=sukuterakhir ; x++) {
        	jumlah=jumlah+x;
        	System.out.print(x+" ");
        
        }
        System.out.println();
    	System.out.println("Totalnya: "+jumlah);
	
		
		
	
	}

}
