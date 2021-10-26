package singleton;

public class PrintTask {
	private int id;
	private String document;
	private int priority;
	
	public PrintTask(int id, String document, int priority) {
		this.id = id;
		this.document = document;
		this.priority = priority;
	}
	
	public void taskInfo() {
		System.out.println("ID: " + id);
		System.out.println("Document: " + document);
		System.out.println("Priority: " + priority);
		System.out.println("----------------------------");
	}
	
	public int getId() {
		return id;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
}
