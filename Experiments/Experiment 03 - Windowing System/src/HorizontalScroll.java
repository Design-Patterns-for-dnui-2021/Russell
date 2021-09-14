
public final class HorizontalScroll extends ScrollDecorator {
	public HorizontalScroll(UIComponent component) {
		super(component);
	}
	
	@Override
	public double scroll() {
		return this.component.scroll() + 20.0;
	}
	
	@Override
	public void info() {
		this.component.info();
		System.out.println("Scrolling Horizontally");
	}
}
