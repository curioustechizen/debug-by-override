package in.curioustechizen.odbg.lib;
import java.util.List;

public class Laundry {

	private WashingMachine machine = new WashingMachine();
	private Dryer dryer = new Dryer();
	private Clothesline line = new Clothesline();
	
	public void doLaundry(List<ClothingItem> clothes){
		machine.wash(clothes);
		machine.rinse(clothes);
		dryer.spin(clothes);
		line.hang(clothes);
	}

	public void setMachine(WashingMachine machine) {
		this.machine = machine;
	}

	public void setDryer(Dryer dryer) {
		this.dryer = dryer;
	}

	public void setLine(Clothesline line) {
		this.line = line;
	}
}
