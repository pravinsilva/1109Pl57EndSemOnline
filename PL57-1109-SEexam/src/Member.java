import java.util.ArrayList;


public class Member {
	ArrayList<String> teamMembers = new ArrayList<String>();

	public ArrayList<String> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(String member) {
		teamMembers.add(member);
	}

}
