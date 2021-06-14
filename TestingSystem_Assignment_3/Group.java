package TestingSystem_Assignment_3;

public class Group {
int id;
String name;
@Override
	public boolean equals(Object obj) {
		if (obj == null) {
				return false;
		}
		
		String[] words = name.split("");
		 for(int i = 0; i < words.length; i++) {
			 if (words[i].equals("Java"))
				 return true;
			 
		}
		 return false;
		 
}
}
