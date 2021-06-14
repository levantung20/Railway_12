package TestingSystem_Assignment_2;
import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
		//Questin 1:
		
		int q1 = random.nextInt();
		System.out.println(q1);
		
		
		//QUestion2:
		
		float q2 = random.nextInt();
		System.out.println("%.2f/n, q2");
		
	}

	//	Question 3:
	String[] name = { "hoan", "Thach", "Manh" };
	System.out.println(name[random.nextInt(name.length)]);
	//Question 4:
int minDay = (int) LocalDate.of(1995, 07,24, 0).toEpochDay();
int maxDay =(int) LocalDate.of(1995, 12, 20).toEpochDay();
LocalDate randomDay = LocalDate.ofEpochDay(minDay+ random.nextInt(maxDay-minDay));
System.out.println(randomDay);

	//Question 5:
	int now = (int) LocalDate.now().toEpochDay();
	int randomWithAYear = now - random.nextInt(365);
	randomDay = LocalDate.ofEpochDay(randomWithinAYear);
	System.out.println(randomDay);
	//Question 6:
	int curDate = (int) LocalDate.now().toEpochDay();
	randomDay = LocalDate.ofEpochDay(random.nextInt(curDate));
	System.out.println(randomDay);
	