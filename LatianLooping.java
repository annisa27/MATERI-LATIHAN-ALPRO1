package Annisa;

import java.util.Scanner;

public class LatianLooping {

	public static void main(String[] args) {

//		// KOTAK ANGKA
//		for (int i = 0; i < 4; i++) {
//			System.out.print(i);
//			for (int j = i; j < i + 6; j++) {
//				System.out.print(j + 1);
//
//			}
//			System.out.println("");
//		}
//
//		// SEGITIGA SIKU2 DI KIRI BAWAH
//		for (int i = 0; i <= 4; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
//
//		// SEGITIGA SIKU2 DI KANAN BAWAH
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// SEGITIGA SIKU2 KIRI ATAS
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// SEGITIGA SIKU2 KANAN ATAS
//		for (int i = 6; i >= 1; i--) {
//			for (int j = 1; j <= 6 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// SEGITIGA TERBALIK
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int l = 0; l <= ((6 - i) * 2); l++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
//
//		// SEGITIGA
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int l = 0; l <= ((5 - i) * 2); l++) {
//				System.out.print("*");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//
//		// KOTAK DENGAN DOLLAR PAK MEGAH
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 16; j++) {
//				if (j % 5 == 0) {
//					System.out.print("$");
//				} else {
//					System.out.print("*");
//				}
//
//			}
//			System.out.println("");
//		}
//
//		// NOMOR 4
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				if (i % 2 == 1) {
//					System.out.print("*");
//				} else {
//					System.out.print("#");
//				}
//			}
//			System.out.println();
//		}
//
//		// KOTAK PAKE ANGKO
//		for (int i = 1; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
//
//		// KOTAK TENGAH BOLONG
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i > 1 && i < 4 && j > 0 && j < 4)
//					System.out.print("  ");
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//
//		}
//
//		// MUNCULIN BILANGAN POSITIF PERTAMA
//		for (int a = 1; a <= 5; a++) {
//			System.out.println(a);
//		}
//
//		// PAK MEGAH UTS
//		int n = 10;
//		for (int i = n; i > 0; i--) {
//			if (i % 3 == 1) {
//				n *= i;
//			} else {
//				n += i;
//			}
//
//		}
//		System.out.println(n);

	}
}
