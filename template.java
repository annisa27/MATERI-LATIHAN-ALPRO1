package soaluts;
import java.util.Scanner;
import java.lang.Math;


public class template {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
		a = 0;
		b = 0;
		c = 0;
		Scanner ut = new Scanner (System.in);
		
		String ayam; //TERNARY
		ayam =(a==0)? "ya" : "tidak";
		System.out.println(ayam);
		
					//IF ELSE
		if(b==0) {
			System.out.println();
		}
		
		else {
			System.out.println();
		}
		System.out.println("ya");
		
		String bebek = "bakar"; //Switch Case
		switch(bebek){
		case "bakar" :
			System.out.println("ya");
		break;
		
		case "goreng" :
			System.out.println("jangan");
		break;
		default :
			System.out.println("hanya bakar dan goreng");
		}
		
		
		
}
}
