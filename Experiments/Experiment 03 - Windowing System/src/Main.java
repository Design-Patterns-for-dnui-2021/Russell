
public class Main {

	public static void main(String[] args) {
		UIComponent window = new Window();
		window = new VerticalScroll(window);
		window = new HorizontalScroll(window);
		window = new VerticalScroll(window);
		window = new VerticalScroll(window);
		window = new HorizontalScroll(window);
		window.info();
		System.out.println("Current scroll position of the window: " + window.scroll());
	}

}
