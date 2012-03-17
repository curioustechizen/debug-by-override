package in.curioustechizen.odbg.lib;

import java.util.List;

public class Clothesline {

	public void hang(List<ClothingItem> clothes) {
		System.out.println("Hanging to dry");
		
		for(ClothingItem item: clothes){
			item.setStatus("dry");
		}
	}

}
