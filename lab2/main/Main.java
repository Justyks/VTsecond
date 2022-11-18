package lab2.main;

import lab2.entity.Criteria;

public class Main {
	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteria = new Criteria(Laptop.class.getSimpleName());

		appliances = service.find(criteria);

		PrintApplianceInfo.print(appliances);

		System.out.println("The cheapest item");
		PrintApplianceInfo.print(service.sortByPrice().get(0));
		System.out.println();

		criteria = new Criteria(Oven.class.getSimpleName());
		criteria.add(Oven.COLOR.toString(), "blue");
		criteria.add(Oven.DISPLAY_INCHES.toString(), 14.0);
		criteria.add(Oven.MEMORY_ROM.toString(), 8000);

		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);
	}
}
