import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTestCase {
	Project p;
	@Before
	public void setUp() throws Exception {
		p=new Project();
	}

	@Test
	public void ProjectTitleTest() {
		//fail("Not yet implemented");
		p.setProjectName("Rails Ticket Booking");
		assertEquals("Rails Ticket Booking",p.getProjectName());
	}

}
