package TestingSystem_Assignment_2;

import java.time.LocalDateTime;

public class Question {
	byte id;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	Date creatDate;
	Answer[] answers;
	public LocalDateTime createDate;
	
	@Override
	public String toString() {
		return "Thông tin câu hỏi số" + id "\n"
	}
	
}
