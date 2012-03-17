package in.curioustechizen.odbg.lib;

public class ClothingItem {
	private String type;
	private String color;
	private String status;

	public ClothingItem(String type, String color, String status) {
		super();
		this.type = type;
		this.color = color;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getStatus() {
		return status;
	}

	void setType(String type) {
		this.type = type;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setStatus(String status) {
		this.status = status;
	}
	
	

}
