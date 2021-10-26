package singleton;

public class Main {

	public static void main(String[] args) {
		PrintPool app = PrintPool.getInstance();
		app.newTask(1, "homework.docx", 1);
		app.newTask(2, "document.pdf", 1);
		app.newTask(3, "image.png", 1);
		
		app.showTasks();
		
		app.updatePriority(2, 3);
		app.abortTask(1);
		
		System.out.println("Updated Tasks: ");
		app.showTasks();
		
		// another instance of the print pool will cause error exception
		PrintPool app2 = PrintPool.getInstance();
	}

}
