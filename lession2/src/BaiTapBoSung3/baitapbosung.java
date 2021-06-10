a

package BaiTapBoSung3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitapbosung {
	public class baitapon {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi ban nhap vao chieu rong:");
			int chieuRong = scanner.nextInt();
		int chieuDai = scanner.nextInt();
			int chuVi = chuVihinhChuNhat(chieuRong, chieuDai);
			System.out.println("Dien tic hinh chu nhat co chieu rong"+ chieuRong+
									 "cm chieu dai " +chieuDai+ "cm la: +chuVi");							 
			dienTichHinhVuong(4);
			daysocantim();
			int nhap = a ;
			int tong = tong(nhap);
			System.out.println(tong);
			System.out.println("\n Moi ban nhap vao 1 so:");
			int num = scanner.nextInt();
			int tong =tongCacChuSo(num);
			System.out.println("Tong cac chu so nhap vao  la: " + tong);
			System.out.println("Moi ban nhap vao he so a:");
			int a =scanner.nextInt();
			System.out.println("Moi ban nhap vao he so b:");
			int b = scanner.nextInt();
			System.out.println(" Moi ban nhap vao he so c");
			int c = scanner.nextInt();
				}
			
	
	
			
	// 1 - Viết hàm tính chuvihinhChuNhat
			public static int chuVihinhChuNhat(int chieuRong, int chieuDai) {
			int chuvi =(chieuRong+ chieuDai)*2;
						return chuvi;		
						}
	 
	
	//	2 - viết hàm tính diện tích hình vuông
		
		public static int dienTichHinhVuong(int canh) {
			int dientich = canh*canh;
			System.out.println(dientich);
			return dientich;
		}
	
	
	// 3 - Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200	
	//		 public static void daysocantim() {
	//			for (int i =10; i <=200; i++) {
	//				if(i % 7 ==0 && i % 5 != 0) {
	//					System.out.println(+i);
	//				}
	//			}
	 }
			 
			
	
			
			
	
	// 4 :Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
		public static int tongCacChuSo(int x) {
				int tong, soDu;
				tong = 0;
				while (x>0) {
					soDu = x %10;
					tong = tong + soDu;
					x=x/10;
					
				}
					return tong;
				}
	}
	}
	
		
	// 5 Viết chương trình giải phương trình bậc 2
		// a*x^2 + b*x + c =0
		public static void giapPTBac2(float a , float b, float c) {
			float x;
			if ( a== 0) {
				if (b == 0) {
					System.out.println(" Phuong trinh vo nghiem");
				} else {
					System.out.println("Phuong trinh co 1 nghiem x="+ (float) (-c/b));
				}
			} else {
				float delta = b* b- 4*a*c;
				float x1;
				float x2;
				if(delta > 0) {
						x1= (float) (-b + Math.sqrt(delta)) / (2*a);
						x2 =(float) (-b + Math.sqrt(delta)) / (2*a);
					} else if (delta ==0 ) {
						x = (-b/ (2*a));
						System.out.println("Phuong trinh co nghiem kep la:" +x1 +"va"+x2);
					} else {
						System.out.println("Phuong trinh vo nghiem");
				}
			}
		}
			
	//	6 - Viết chương trình đăng nhập tài khoản, cho phép nhập vào username và password, nếu nhập đúng thông báo đăng nhập thành công	
		public static void dangNhap(String username, String password) {
			String admin = "admin";
			if(admin.equals(username) && admin.equals(password)) {
				System.out.println("Dang nhap thanh cong");
			} else {
					System.out.println("Sai tai khoan hoac mat khau");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao chieu rong:");
		int chieuRong = scanner.nextInt();
	int chieuDai = scanner.nextInt();
		int chuVi = chuVihinhChuNhat(chieuRong, chieuDai);
		System.out.println("Dien tic hinh chu nhat co chieu rong"+ chieuRong+
								 "cm chieu dai " +chieuDai+ "cm la: +chuVi");							 
		dienTichHinhVuong(4);
		daysocantim();
		int nhap = a ;
		int tong = tong(nhap);
		System.out.println(tong);
		System.out.println("\n Moi ban nhap vao 1 so:");
		int num = scanner.nextInt();
		int tong =tongCacChuSo(num);
		System.out.println("Tong cac chu so nhap vao  la: " + tong);
		System.out.println("Moi ban nhap vao he so a:");
		int a =scanner.nextInt();
		System.out.println("Moi ban nhap vao he so b:");
		int b = scanner.nextInt();
		System.out.println(" Moi ban nhap vao he so c");
		int c = scanner.nextInt();
			}
		


		
// 1 - Viết hàm tính chuvihinhChuNhat
		public static int chuVihinhChuNhat(int chieuRong, int chieuDai) {
		int chuvi =(chieuRong+ chieuDai)*2;
					return chuvi;		
					}
 

//	2 - viết hàm tính diện tích hình vuông
	
	public static int dienTichHinhVuong(int canh) {
		int dientich = canh*canh;
		System.out.println(dientich);
		return dientich;
	}


// 3 - Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200	
//		 public static void daysocantim() {
//			for (int i =10; i <=200; i++) {
//				if(i % 7 ==0 && i % 5 != 0) {
//					System.out.println(+i);
//				}
//			}
 }
		 
		

		
		

// 4 :Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
	public static int tongCacChuSo(int x) {
			int tong, soDu;
			tong = 0;
			while (x>0) {
				soDu = x %10;
				tong = tong + soDu;
				x=x/10;
				
			}
				return tong;
			}
}
}

	
// 5 Viết chương trình giải phương trình bậc 2
	// a*x^2 + b*x + c =0
	public static void giapPTBac2(float a , float b, float c) {
		float x;
		if ( a== 0) {
			if (b == 0) {
				System.out.println(" Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co 1 nghiem x="+ (float) (-c/b));
			}
		} else {
			float delta = b* b- 4*a*c;
			float x1;
			float x2;
			if(delta > 0) {
					x1= (float) (-b + Math.sqrt(delta)) / (2*a);
					x2 =(float) (-b + Math.sqrt(delta)) / (2*a);
				} else if (delta ==0 ) {
					x = (-b/ (2*a));
					System.out.println("Phuong trinh co nghiem kep la:" +x1 +"va"+x2);
				} else {
					System.out.println("Phuong trinh vo nghiem");
			}
		}
	}
		
//	6 - Viết chương trình đăng nhập tài khoản, cho phép nhập vào username và password, nếu nhập đúng thông báo đăng nhập thành công	
	public static void dangNhap(String username, String password) {
		String admin = "admin";
		if(admin.equals(username) && admin.equals(password)) {
			System.out.println("Dang nhap thanh cong");
		} else {
				System.out.println("Sai tai khoan hoac mat khau");
		}
	}