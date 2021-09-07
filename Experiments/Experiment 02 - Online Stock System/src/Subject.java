
public interface Subject {
	public abstract void registerHolder(StockHolder holder);
	public abstract void removeHolder(StockHolder  holder);
	public abstract void notifyHolders();
}
