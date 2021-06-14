package TestingSystem_Assignment_2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Exercise3 {
	public static void maid(String[] args) {
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
			// create typeQuestion
			TypeQuestion typeQuestion1 = new TypeQuestion();
			typeQuestion1.id = 1;
			typeQuestion1.name = typeQuestion1.name.ESSAY;

			TypeQuestion typeQuestion2 = new TypeQuestion();
			typeQuestion2.id = 2;
			typeQuestion2.name = typeQuestion2.name.MULTIPLECHOICE;

			// create CategoryQuestion
			CategoryQuestion categoryQuestion1 = new CategoryQuestion();
			categoryQuestion1.id = 1;
			categoryQuestion1.name = "Java";

			CategoryQuestion categoryQuestion2 = new CategoryQuestion();
			categoryQuestion2.id = 2;
			categoryQuestion2.name = "C#";

			CategoryQuestion categoryQuestion3 = new CategoryQuestion();
			categoryQuestion3.id = 3;
			categoryQuestion3.name = "PHP";

			CategoryQuestion categoryQuestion4 = new CategoryQuestion();
			categoryQuestion4.id = 4;
			categoryQuestion4.name = "Python";

			// create Questions & Answers
			Question question1 = new Question();
			question1.id = 1;
			question1.content = "Question 1?";
			question1.category = categoryQuestion1;
			question1.type = typeQuestion1;
			question1.createDate = LocalDateTime.now();

			Question question2 = new Question();
			question2.id = 2;
			question2.content = "Question 2?";
			question2.category = categoryQuestion1;
			question2.type = typeQuestion1;
			question2.createDate = LocalDateTime.now();

			// create Answer
			Answer answer1 = new Answer();
			answer1.id = 1;
			answer1.content = "Answer question 1";
			answer1.isCorrect = true;

			Answer[] answerQuestion1 = { answer1 };
			question1.answers = answerQuestion1;

			Answer answer2 = new Answer();
			answer2.id = 2;
			answer2.content = "Answer question 2";
			answer1.isCorrect = false;

			Answer[] answerQuestion2 = { answer2 };
			question2.answers = answerQuestion2;

			// create Exams
			Exam exam1 = new Exam();
			exam1.id = 1;
			exam1.code = "JAVA1";
			exam1.title = "Java Exam";
			exam1.duration = 60;
			exam1.category = categoryQuestion1;
			Question[] questionExam1 = { question1, question2 };
			exam1.questions = questionExam1;
			exam1.createDate = LocalDateTime.now();

	}
}
//Question 1:
	System.out.println("--------Question1-------");
	DateTimeFormatter dTF1 = DateTimeFormatter.ofPattern("dd -MMMM-yyyy".Locale.CHINESE);
	System.out.println("Title:"+ exam1.tile);
	System.out.println(exam1.createDate.format(dTF1));
	
	//Question 2:
	System.out.println("--------Question2-------");
	DateTimeFormatter dTF2 = DateTimeFormatter.ofPattern("yyyy - MMMM - dd - HH - mm - ss");
	System.out.println("Title: "+exam1.title);
	System.out.println("Create Date: "+exam1.createDate.format(dTF2));

	//Question 3:
	System.out.println("--------Question3-------");
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy");
	private Exam exam1;
	private Exam exam2;
	private Exam exam3;
	Exam[] examNew = { exam1, exam2, exam3 };

	for (Exam exam : examNew) {
		System.out.println("Exam " + exam.code + ":" + exam.createDate.format(dtf2));
		}
	}

// Question 4:
System.out.println("--------Question4-------");
DateTimeFormatter dTF4 = DateTimeFormatter.ofPattern("MM - yyyy");
System.out.println("Content: "+question2.content);
System.out.println("Create Date: "+question2.createDate.format(dTF4));
		}
	}
}
		