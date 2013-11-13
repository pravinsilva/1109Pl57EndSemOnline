import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTestCase {
	Project p;
	Team team;
	Member member;
	Story story;
	@Before
	public void setUp() throws Exception {
		p=new Project();
		team=new Team();
		member=new Member();
		story=new Story();
	}

	@Test
	public void ProjectTitleTest() {
		//fail("Not yet implemented");
		p.setProjectName("Rails Ticket Booking");
		assertEquals("Rails Ticket Booking",p.getProjectName());
		
		team.setTeamName("Team Coders");
		assertEquals("Team Coders",team.getTeamName());
		
		p.AddTeamToProject(team);
		
		member.setTeam("Pravin","Product Owner");
		team.AddTeamMember(member);
		member.setTeam("Trisha","Scrum Master");
		team.AddTeamMember(member);
		member.setTeam("Abhishek","Tester");
		team.AddTeamMember(member);
		
		team.getTeamMember(0);
		
		story.createStory("As a customer i want to book tickets " , 10);
		story.createStory("As a customer i want to cancel tickets " , 7);
		story.createStory("As an admin i want to edit events " , 9);
		story.createStory("As an admin i want to set up new screen shows" , 8);
		
	
		
		}
}
