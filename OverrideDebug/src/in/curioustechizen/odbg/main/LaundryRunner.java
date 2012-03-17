package in.curioustechizen.odbg.main;

import java.util.ArrayList;
import java.util.List;

import in.curioustechizen.odbg.lib.ClothingItem;
import in.curioustechizen.odbg.lib.Laundry;

public class LaundryRunner {

	private static Laundry laundry = new Laundry();

	public static void main(String[] args) {

		/*
		 * Initialize the clothes for laundry
		 */
		List<ClothingItem> clothes = new ArrayList<ClothingItem>(3);
		clothes.add(new ClothingItem("shirt", "white", "stained"));
		clothes.add(new ClothingItem("jeans", "blue", "dirty"));
		clothes.add(new ClothingItem("t-shirt", "red", "dirty"));

		runWithoutDebug(clothes);
		runWithOverrideDebug(clothes);

	}

	private static void runWithoutDebug(List<ClothingItem> clothes) {
		/*
		 * Objective: To try to debug whats going on inside.
		 * For example, what happens by the time the clothes reach the clothesline?
		 * 
		 * For solution, see runWithOverrideDebug() method
		 */
		laundry.doLaundry(clothes);
	}
	

	private static void runWithOverrideDebug(List<ClothingItem> clothes) {
		/*
		 * Solution:
		 * 1. Extend the Clothesline class.
		 * 2. Override the method we are interested in. 
		 * 3. Put a break-point or a debug print in there. 
		 * Don't forget to call the super method.
		 * 
		 * 4. Make the Laundry class use our implementation of Clothesline 
		 * instead of default one.
		 * 
		 * We're done!
		 */
		laundry.setLine(new CustomClothesline());
		laundry.doLaundry(clothes);	
	}

}
