
public final class VerticalScroll extends ScrollDecorator {
	public VerticalScroll(UIComponent component) {
		super(component);
	}

	@Override
	public double scroll() {
		return this.component.scroll() + 10.0;		
	}

	@Override
	public void info() {
		this.component.info();
		System.out.println("Scrolling Vertically");
	}
}
