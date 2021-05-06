package basic.dev;

import java.util.Scanner;

public class MainApp {

	
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap a = ");
				int a = sc.nextInt();
				if (a<0) {System.out.print("a la so nguyen am");}
				else {System.out.println("a la so nguyen duong");}
				System.out.println("Nhap n = ");
				int n = sc.nextInt();
				if (n%3==0) { System.out.print("n chia het cho 3");
				}else if (n%5==0) System.out.print("n chia het cho 5");
				System.out.println("Nhap thang x = ");
				int x = sc.nextInt();
				if (x==1) {System.out.println("Thang 1 co 31 ngay");}
				else if (x==2) {System.out.println("Thang 2 co 28 ngay");}
				else if (x==3) {System.out.println("Thang 3 co 31 ngay");}
				else if (x==4) {System.out.println("Thang 4 co 30 ngay");}
				else if (x==5) {System.out.println("Thang 5 co 31 ngay");}
				else if (x==6) {System.out.println("Thang 6 co 30 ngay");}
				else if (x==7) {System.out.println("Thang 7 co 31 ngay");}
				else if (x==8) {System.out.println("Thang 8 co 30 ngay");}
				else if (x==9) {System.out.println("Thang 9 co 31 ngay");}
				else if (x==10) {System.out.println("Thang 10 co 30 ngay");}
				else if (x==11) {System.out.println("Thang 3 co 31 ngay");}
				else if (x==12) {System.out.println("Thang 12 co 30 ngay");}

	}

}
