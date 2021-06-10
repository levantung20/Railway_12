package TestingSystem_Assignment_2;
import java.util.Date;
public class Exam {
	byte id;
	String code;
	String title;
	CategoryQuestion category;
	byte duration;
	Date creatDate;
	Question[] questions;
	
	@Overrdie
	public String toString() {
		return "Thông tn bài thi số " +id + "\n" +
				"Ma de thi: " + code + "\n" +
				"Tieu de: " + title + "\n" +
				"The loai: " + category + "\n" +
				"Thoi gian: " + duration + "\n" +
				"Nguoi tao: " + creator.fullname ;
	}
	
}
