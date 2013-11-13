import java.util.ArrayList;


public class Story {

	String storyName;
	int points;
	ArrayList<Task> TaskList = new ArrayList<Task>();
	
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void createStory(String name,int points){
		setStoryName(name);
		setPoints(points);
	}
	
	public void assignTask(Task k){
		TaskList.add(k);
	}
}
