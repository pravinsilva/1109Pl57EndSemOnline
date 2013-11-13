import java.util.ArrayList;


public class Member {
	String name;
	String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setTeam(String string, String string2) {
		// TODO Auto-generated method stub
		setName(string);
		setRole(string2);
	}
	
}
