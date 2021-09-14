
public abstract class ScrollDecorator implements UIComponent {
	protected UIComponent component;
	
	public ScrollDecorator(UIComponent component) {
		this.component = component;
	}
	
	@Override
	public abstract double scroll();
	@Override
	public abstract void info();
}
