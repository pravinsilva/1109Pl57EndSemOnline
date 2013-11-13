import java.util.ArrayList;


public class Team {

	ArrayList<Member> teamMembersList = new ArrayList<Member>();
		public String teamName;
		
	   public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public void AddTeamMember(Member m) {
			// TODO Auto-generated method stub
			teamMembersList.add(m);
		}	
		
		public Member getTeamMember(int index){
			return teamMembersList.get(index);
			
		}
}
