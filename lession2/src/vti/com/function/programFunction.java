package vti.com.function;

import java.util.Scanner;

public class programFunction {

	public static void main(String[] args ) {
		/*---------------------*/
		System.out.println("Chao mung ban den voi ngan hang VTI");
		int nhap;
		do {
		System.out.println ("Moi ban chon chuc nang");
		System.out.println("----------------------------------------");
		System.out.println("1. Rut tien");
		System.out.println("2. Chuyen tien");
		System.out.println("3. Truy van so du");
		System.out.println("4. Dong bat ho");
		System.out.println("5. Thoat");
		Scanner scanner = new Scanner(System.in);
		 nhap = scanner.nextInt();
		ATM(nhap);
		} while (nhap != 5);
	}
		public static void ATM(int nhap) {
		switch (nhap ) {
	
		case 1: System.out.println(" ban vua chon chuc nang rut tien");
			break;
			
		case 2: System.out.println("ban vua chon chuc nang chuyen tien");
		
			break;
		case 3: System.out.println("ban vua chon chuc nang Truy van so du");
		
			break;
		case 4:System.out.println("ban vua chon chuc nang Dong bat ho");
			break;
		case 5:
			System.out.println(" cam on da su dung dich vu, hen gap lai ");
			break;
			default: System.out.print("Moi ban nhap tu 1-> 4");
		}
		}
	}
		
		
		
		
		
		
		
		
	
//		String hoTen = nhapten();
//		System.out.println(hoTen);
//	}


	
	
	
	
	
	
	
//// viết một hàm nhập vào tên va sau đó in ra tên của người đó
//
//	public static String nhapten() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap ten :");
//		String hoTen = scanner.nextLine();
//		return hoTen;
//	}	
//	}