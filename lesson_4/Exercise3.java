package com.vti.frontend;
import java.time.LocalDate;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Exercise3 {
	public static void main(String[] args) {
		Exercise1 ex1 = new Exercise1();
		ex1.question1();
		ex1.question2();
		}
		public void question2() {
		Account acc1 = new Account();
		Account acc2 = new Account(2, "email2", "username2", "fullname2");
		Position pos3 = new Position();
		Account acc3 = new Account(3, "email3", "username3", "fullname3",

		pos3);

		System.out.println(acc3.getCreateDate());
		Position pos4 = new Position();
		Account acc4 = new Account(3, "email3", "username3", "fullname3",

		pos4, LocalDate.of(2021, 03, 17));
		}
		public void question1() {
		Department dep = new Department();
		Department dep1 = new Department("Dep1");
		}
		}
}
