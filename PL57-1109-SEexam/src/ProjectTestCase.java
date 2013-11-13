import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTestCase {
	Project p;
	Team team;
	Member member;
	@Before
	public void setUp() throws Exception {
		p=new Project();
		team=new Team();
		member=new Member();
	}

	@Test
	public void ProjectTitleTest() {
		//fail("Not yet implemented");
		p.setProjectName("Rails Ticket Booking");
		assertEquals("Rails Ticket Booking",p.getProjectName());
		
		team.setTeamName("Team Coders");
		assertEquals("Team Coders",team.getTeamName());
		
		p.AddTeamToProject(team);
		
		team.AddTeamMember(member);
		
		}
}
