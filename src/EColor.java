
public enum EColor {
	RED("#ff6347"), BLUE("#35AEF5"), GREEN("#7ED957"), GRAY("#9D9D9D");
	
	private String name;
	private EColor(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
