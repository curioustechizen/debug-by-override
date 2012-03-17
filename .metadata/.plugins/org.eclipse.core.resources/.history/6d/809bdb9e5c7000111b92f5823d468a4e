package in.curioustechizen.odbg.main;

import java.util.List;

import in.curioustechizen.odbg.lib.Clothesline;
import in.curioustechizen.odbg.lib.ClothingItem;

public class CustomClothesline extends Clothesline {

	@Override
	public void hang(List<ClothingItem> clothes) {
		System.out.println("Debugging in Custom Clothesline");
		System.out.println("Status of clothes given to me:");
		for(ClothingItem item: clothes){
			System.out.println(item.getStatus());
		}
		super.hang(clothes);
	}
}
