package singleton;

import java.util.ArrayList;
import java.util.Optional;

public class PrintPool {
	private ArrayList<PrintTask> tasks = new ArrayList<>();
	private static PrintPool instance;
	
	private PrintPool() {}
	
	public static PrintPool getInstance() {
		if (instance == null) {
			instance = new PrintPool();
		} else {
			throw new Error("Print Pool already instantiated!");
		}
		return instance;
	}
	
	public void newTask(int id, String document, int priority) {
		tasks.add(new PrintTask(id, document, priority));
	}
	
	public void updatePriority(int id, int priority) {
		Optional<PrintTask> task = tasks.stream().filter((item) -> item.getId() == id).findFirst();
		if (task.isPresent()) {
			int index = tasks.indexOf(task.get());
			task.get().setPriority(priority);
			tasks.set(index, task.get());
		}
	}
	
	public void abortTask(int id) {
		Optional<PrintTask> task = tasks.stream().filter((item) -> item.getId() == id).findFirst();
		if (task.isPresent()) {
			tasks.remove(task.get());
		}
	}
	
	public void showTasks() {
		tasks.forEach((item) -> item.taskInfo());
	}
}
