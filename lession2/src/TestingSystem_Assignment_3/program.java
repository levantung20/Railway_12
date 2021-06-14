package TestingSystem_Assignment_3;
import java.util.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class program {
	//Question 1:
	float luong1;
	float luong2;
	luong1 = (float) 5240.5;
	luong2 = (float) 10970.055;
	System.out.println("luong1:"+ luong1 +"|| luong2:"+luong2 );
	int roundluong1 = (int)luong1;
	int roundluong2 = (int)luong2;
	System.out.println("roundluong1: " + roundluong1 + "|| roundluong2:" + roundluong2);

	//Question 2:
	Random random = new Random();
	long a = random.nextInt(99999);
	System.out.println(a);
	while (a < 10000) {
		a = a*10;
	}	System.out.println(a);
	
	
	//Question3:
	System.out.println(a%100);
}

//Qusetion4:

public static void question4() {
	Scanner a;
	int b;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap a = ");
	a =scanner.nextInt();
	do {
		System.out.println("Nhap b = ");
		b = scanner.nextInt();
	if (b ==0) {
		System.out.println("Vui long nhap b khac 0 !");
	}
	} while (b== 0);
	Scanner.close();
	System.out.println("Thuong: " + (float) a/ (float) b);
	
	}
//Question5:
	public static float Question5(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a1: ");
		int a1 = sc.nextInt();
		System.out.println("Nhap a2:");
		int a2= sc.nextInt();
		if(a2==0)
		{
			System.out.println("Nhap vao sai xin hay nhap lai !");
		}
		float result = (float) a1/a2;
		return result;
	}
		}



//_________________________________________________________________________

//Exercise 2 Default value 
//Question 1:
	
	Account[] accouts = new Account[10];
	for(int i2= 0; i2 < accounts.length; i2 ++) {
		accouts[i2] = new Account();
		accouts[i2].email = "Email " + (i2+1);
		accouts[i2].username = "Fullname" + (i2+1);
		accouts[i2].createDate = new Date();
		System.out.println("Thong tin account" + (i2+1));
		System.out.println("Email: "+accouts[i2].email);
		System.out.println("Username:" + accouts[i2].username);
		System.out.println("CreateDate:" + accouts[i2].createDate);
		System.out.println("");
	}
//________________________________________________________________	
//Exercise 3 : Boxing & Unboxing
	//Question1:
	public static void Question1() {
	Integer salary = 5000;
	System.out.printf(" %.2f" , (float)salary);
	}
	//Question 2:
	public static void Question2() { 
		String s1 = "1234567";
		Integer a = Integer.parseInt(s1);
		System.out.println(a);
	}
	
	
	//Question3:
	public static void Question3() {
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println(a);
	}
	//____________________________________________________________
	//Exercise 4 : String
	//Question 1:
	Scanner scanner = new Scanner(System.in);
	System.ount.println("Nhap Chuoi:");
	s1 = scanner.nextLine();
	System.out.println("So ky tu : " +s1.length());
	
	//Qúetion2:
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap chuoi 1:");
	String s1 = scanner.nextLine();
	System.out.print("Nhap chuoi 2:");
	String s2 = scanner.nextLine();
	s1 = s1.concat(s2);
	System.out.println("Sau khi noi chuoi : " +s1);
	
	
	// Question 3:
	public static void Question3() {
	String ten;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap ten: ");
	ten = scanner.nextLine();
	String result[] = ten.split( " ");
		
	
	for( int i = 0; i < result.length; + i++) {
		String upper = result[i].substring(0,1).toUpperCase() + result[i].substring(i);
		System.out.print(upper + "");
			}	
		}
		
		//Question 4:
		public static void Question4() {
			String ten;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap ten: ");
			ten = scanner.nextLine();
			String [] result = ten.split(" ");
			for (int i = 0; i < result.length; i++) {
				String z = result[i].nextLine();
				System.out.println(" ki tu" + i + " la:" + z);
				
		}
	//Question6:
			System.out.println("Nhập vào Họ và Tên: ");
//			String hoTen = scanner.nextLine();
//			String[] words = hoTen.split(" ");
//			
//			String ho = words[0];
//			System.out.println("Họ là: " + ho);
//			
//			String tenDem ="";
//			for (int x6 = 0; x6 < words.length; x6++) {
//				if (x6 != 0 && x6 != (words.length-1)) {
//					String tenDem1 =  words[x6];
//					tenDem += tenDem1.concat(" ");		
//				} 	
//			} System.out.println("Tên đệm là: "+tenDem);
//			
//			String ten = words[words.length-1];
//			System.out.println("Tên là: "+ten);
			
			//Question7:
Scanner scanner = new Scanner(System.in);
String fullName;
System.out.println("nhap vao ho ten ");
fullName = scanner.nextLine();
Scanner,close();
// remove space characters
fullName = fullName.trim();
fullName = fullName.replaceAll("\\s+", "");
System.out.primtln("test " + fullName);
String[] words = fullName.split("");
fullName = "";
for (String word : words) {
String firstCharacter = word.substring(0 ,1 ).toUpperCase();
String leftCharacter = word.substring(1);
word = firstCharacter + leftCharacter;
fullName+= word + "";
				
//Question8:
Group group1 = new Group();
group1.name="Java  Hoang Van Thanh";
group1.id=1;
				
				
Group group2 = new Group();
group2.name="Java  Nguyen Ngoc Thach";
group2.id=2;
Group[] groups = {group1,group2};
for(int i = 0;i<groups.length;i++) {
String result1[]= groups[i].name.split("");
for (int j=0;j<result1.length;j++) {
if(result1[j].equals("Java")) {
 { System.out.println(groups[i].id); } } 
					
		}
	}
}
				
//Question9:
Group group1 = new Group();
group1.name="Java Hoang Van Thanh";
group1.id=1;
				
Group group2= new Group();
group2.name ="Java";
group2.id=2;
				
Group[] groups = {group1, group2};
for(int i = 0; i<groups.length;i++) {
String result1[] groups[i] = groups[i].name.split("");
for (int j=0;j<result1.length;j++) {if(result1[0].equals("Java") &&
		result1.length==1) { System.out.println(groups[i].id); } }

//Question11:
	String var_11 = "Hoang Van Thanh";
	char a = 'a';
	int count = 0;
	for (int x11 = 0; x11< var_11.length(); x12++);
	if (var_11.charAt(x11) == a) {
		count++;

		}
	}
System.out.println(count);
}
//Question10:
		Scanner scanner = new Scanner(System.in);
		System.out.pritnln("Nhap chuoi thu nhat : ");
		String s1 = scanner.nextLine();
		System.out.pritnln(" Nhap chuoi thu hai:");
		String s2 = scanner.nextLine();
		String s1Reverse = "";
		for (int i = s1.length() -1 ; i >=0; i--) {
			s1Reverse += s1.charAt(i);
			
		}
		if (s1Reverse.equals(s2)) {
			System.out.println("OK");
		} else
			System.out.println("KO");
		scanner.close();
		}
//Question12:
		public static void question12() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuoi : ");
			String s = sc.nextLine();
			String sReverse = "";
			for(int i = s.length() -1; i>=0; i --) {
				sRevere += s.charAt(i);
				
//Question13:
	public static void Question13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi:");
		String s = sc.nextLine();
		sc.close();
		int check = -1;
		for(int i = 0; i< s.length(); i++);
		if (isDiGit(s.charAt(i))) {
			check = 1;
		}
	}
	if(check <0) System.out.pritnln("False");
	if (check > 0)System.out.prtnln("True");
	
		}
	//Tao ham kiem tra xem co phai chu so hay khong:
			public static boolean isDiGit(char c) {
			if ( c>= '0' && c<= '0')
				return true;
			return false;
			}
//Question14:
	public static void question14() {
		System.out.println("Nhap chuoi :");
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println("Nhap ky tu chi dinh:");
		char c = sc.next().charAt(0);
		System.out.println("Nhap ky tu thay the:");
		char d = sc.next().charAt(0);
		sc.close();
		
		str = str.replace( c, d);
		System.out.println(" CHuoi moi la:" + str);
	}
//Question15:
	public statci void question15() {
		Scanner scanner = new Scanner(System.in):
			System.out.println("Nhap chuoi:");
		String s = scanner.nextLine();
		scanner.close();
		// chuan hoa xau :
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String[] words = s.split(" ");
		String sRevert = "";
		for (int i = words.length -1 ; i >=0; i--);
			sRevert += words[i] + " ";
	}
	System.out.println(" Chuoi dao nguoc la:" + sRevert);
	
		
		
	}
	}
			}
	}
		}
		
			}
		

	


	
			