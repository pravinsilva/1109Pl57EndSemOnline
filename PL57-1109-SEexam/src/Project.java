
public class Project {
	public Team projectTeam;
	String projectName;
	String teamMember;


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public void AddTeamToProject(Team t) {
		// TODO Auto-generated method stub
		projectTeam=t;
	}
	
}
