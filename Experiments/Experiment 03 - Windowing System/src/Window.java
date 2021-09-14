
public class Window implements UIComponent {
	@Override
	public double scroll() {
		return 0;
	}

	@Override
	public void info() {
		System.out.println("Window is scrolling");
	}
}
