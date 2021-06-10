package TestingSystem_Assignment_2;


	import java.util.Date;

public class Exercise1_FlowControl<Department> {

public static void main(String[] args) {

		// EXERCISE 1 : FLOW CONTROL
		// Question 1:
		if (account2.department == null ) {
			System.out.println("Nhan vien nay chua co phong ban ");
			} else {
				System.out.println("Phong ban cua nhan vien nay la + account2.department.name");
				
		}
	}

//	// Question2 :
//	if(account2.groups.length()==0)
//
//	{
//		System.out.println("nhân viên này chưa có group");
//	}else if(account2.groups.length()==1||account2.groups.length()==2)
//	{
//		System.out.println("Group của nhân viên này là ");
//		for (Group group : groupsofAccount2) {
//			System.out.println(group.groupName);
//		}
//	}else if(account2.groups.length()==3)
//	{
//		System.out.println("Nhân viên là ngư�?i quan tr�?ng, tham gia nhi�?u group");
//	}else
//	{
//		System.out.println("Nhân viên là ngư�?i hóng chuyện ,tham gia tất cả các group");
//
//	}}
//
//// Question 3 : 
//	System.out.println(account2.department==null?"Nhân viên này chưa có phòng ban":"Phòng ban của nhân viên này là : "+account2.department.name);
//
//// Question 4 :
//
//	System.out.println(account1.position.name.toString()==PositionName.DEV?"Đây là Developer":"Người này không phải là Developer");
//
//	}
//
//	// SWITCH CASE
//// Question 5 : 
//	if(group1.accounts==null){
//	int x = Group1.accounts.length;switch(x)
//	{
//	
//case 1:
//	System.out.println("Nhóm có một thành viên");
//	break;
//	
//case 2:
//	System.out.println("Nhóm có hai thành viên");
//	break;
//	
//case 3:
//	System.out.println("Nhóm có ba thành viên");
//	break;
//	default:
//		System.out.println("Nhóm có nhiều  thành viên");
//		}
//
//// Question6 : 
//	if(acc2.groups==null)
//	{
//		System.out.println("Nhân viên này chưa có group");
//	}else
//	{
//		switch (acc2.groups.length) {
//		case 1:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 2:
//			System.out.println("Group của nhân viên là Java Fresher, C# Fresher");
//			break;
//		case 3:
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		
//		}
//	}}
//
//// Question 7:
//	String X = account1.position.name.toString();
//	private account2 Account3;
//	switch(X)
//	case"DEV":
//		System.out.println("Đây là Developer");
//		break;
//		default:System.out.println("Người này không phải là Developer");
//
//	// FROREACH Question 8 :
//	account2[] accounts = { Account1, Account2, Account3 };for(
//	account2 account:accounts)
//	{
//			System.out.println("AccountID:" + account2.id + "Email:"
//					+ account1.eamil + "Name" + account1.fullName);
//		}
//	}
//	
//	// Question 9 :
//	for (department department : departments) {
//		System.out.println("thông tin phòng ban "+ department.id);
//		System.out.println("DepID: " + department.id + "Name:" +department.name);
//	}
//	}
//	}
//	 // FOR Question 10:
//	for (int y =0; i < accounts.length; y++) {
//		System.out.println("Thông tin account thứ " + (y + 1)+"là:");
//		System.out.println("Email: " +accounts [y}.email);
//		System.out.println("Full name:" + accounts[i].fullname);
//		System.out.println("Phòng ban:" + accounts[i].department.name + "\n" );
//	
//	//Question 11:
//		for (int y = 0 ; y < departments.length; y++) {
//		System.out.println("Thông tin department thứ" + departments[y].id + "Là:");
//		System.out.println("ID:" + departments[y].id);
//		System.out.println("Name : + departmnet[y].name");
//		}
//		}
//		}
//		
//	
//	// Question 12:
//	for (int y =0 ; y < 2; y++) {
//		System.out.println("Thông tin department thứ " + (y + 1)+ "Là:");
//		System.out.println("ID : " + departments[y].id);
//		System.out.println("Name: " + departments[y].name);
//	}
//	}
//	} 
// 		 bai tap in ra thong tin tat ca cac group tru group
	for (int i = 0; i <listGroup.length; i++) {
		if( i !=1) {
			System.out.println(" thong tin account thu" + (i+1) + "La:");
			System.out.println();
		}
			
		}
	}

 	