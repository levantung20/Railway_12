package TestingSystem_Assignment_2;

public class Question {
	byte id;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	Date creatDate;
	Answer[] answers;
	
	@Override
	public String toString() {
		return "Thông tin câu hỏi số" + id "\n"
	}
	
}
