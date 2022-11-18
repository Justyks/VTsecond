package lab2.entity;

public final class SearchCriteria {

	public static enum Appliance {
		PRICE
	}

	public static enum Oven {
		PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}

	public static enum Laptop {
		PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}

	public static enum Refrigerator {
		PRICE, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}


	private SearchCriteria() {
	}
}

