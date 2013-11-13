
public class Task {
	
	String taskName;
	int taskHours;
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public int getTaskHours() {
		return taskHours;
	}
	public void setTaskHours(int taskHours) {
		this.taskHours = taskHours;
	}
	
	public void createTaske(String name, int hours){
		setTaskName(name);
		setTaskHours(hours);
	}
	
	
}
