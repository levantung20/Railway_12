package com.vti.entily;

public class QuanLyCanBo { 
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("---------**----------");
		System.out.println( "-----------* Chao mung den voi phan men quan ly can bo *------------");
		
		System.out.println("1. them moi can bo ");
		System.out.println("2. Tim kiem theo ho ten");
		System.out.println("3. hien thi thong tin can bo");
		System.out.println("4. xoa theo ten can bo");
		System.out.println("5. thoat")
		System.out.println(" Moi ban nhap vao chuc nang:");
		idChucnang = scanner.nextInt();
		switch (idChucnang) {
		case 1 : System.out.println("Moi ban nhap vao loai can bo:");
				System.out.println("1. Cong nhan");
				System.out.println("2.ky Su");
				System.out.println("3. nhan vien van phong");
				int idLoaiCanBo = scanner.nextInt();
				switch (idLoaiCanBo) {
				
				case 1: CongNhan congNhan = new CongNhan();
				 System.out.println("Ban da chon tao moi cong nhan");
				System.out.println("Moi ban nhap vao ten can bo:");
				String tenCongNhan = scanner.nextLine();
				CongNhan.setHoTen(tenCongNhan)
				break;
				default:
					break;
					
				}
				
		}
	}
}
