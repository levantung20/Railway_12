
public class Question1 {
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
		
	}
	public String getUserName() {
		return userName;
		
	}
	public void setUserName(String username) {
		this.userName= userName;
		
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
		
	}
	public Department getDepartment(Department department) {
		this.getDepartment = department;
		
	}
	public Position getPosition() {
		return position;
		
	}
	public void setPosition(Position position) {
		this.Position = position;
		
	}
	public LocalDate getCreateDate() {
		return createDate;
		
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
		
	}
	public Group[] getGroups() {
		return groups;
		
	}
}
