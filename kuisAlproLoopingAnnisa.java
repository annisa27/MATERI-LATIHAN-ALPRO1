package alpro1;
import java.util.Scanner;

public class kuisAlproLoopingAnnisa {
    public static void main(String[] args) {
    	System.out.println("MEMBUAT SEGITIGA DENGAN KOMBINASI ! DAN *");
    		Scanner sc = new Scanner(System.in);
        	int n;
        
        	System.out.print(" Masukkan nilai N sebagai tinggi segitiga: ");
        		n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        	for (int j = n-1; i<j; j--) {
                System.out.print("!");
                }

            for	(int k=0;k<=i;k++) {
                System.out.print("*");
            	}
            System.out.print("\n");
        }
        
        //MENCARI SOLUSI
        System.out.println("X+Y+Z=25");
        System.out.println("--------");
        int x,y,z;

        for(x=1; x<=25; x++){
            for(y=1; y<=25; y++){
                for(z=1; z<=25; z++){
                    if(x+y+z==25){
                        System.out.println(x+"+"+y+"+"+z);
                        

                    }
                }
            }
        }

        }
}



