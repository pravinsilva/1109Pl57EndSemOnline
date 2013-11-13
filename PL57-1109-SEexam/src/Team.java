import java.util.ArrayList;


public class Team {
	Member teamMember;
		public String teamName;
		
	   public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public void AddTeamMember(Member member) {
			// TODO Auto-generated method stub
			teamMember= member;
		}	
}
