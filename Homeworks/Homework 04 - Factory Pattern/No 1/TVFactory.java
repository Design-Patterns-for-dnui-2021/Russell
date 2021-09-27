
public class TVFactory {
	public TV produce(String brand) {
		if (brand.equalsIgnoreCase("haier")) return new HaierTV();
		if (brand.equalsIgnoreCase("hisense")) return new HisenseTV();
		throw new Error("Invalid Brand!");
	}
}
