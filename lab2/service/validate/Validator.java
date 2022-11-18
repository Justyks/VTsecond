package lab2.service.validate;

import lab2.entity.Criteria;
import lab2.entity.SearchCriteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		String groupSearchName = criteria.getGroupSearchName();

		for (String key : criteria.getCriterias().keySet()) {
			try {
				if (groupSearchName.equals("Appliance"))
					SearchCriteria.Appliance.valueOf(key);
				else if (groupSearchName.equals("Laptop"))
					SearchCriteria.Laptop.valueOf(key);
				else if (groupSearchName.equals("Oven"))
					SearchCriteria.Oven.valueOf(key);
				else if (groupSearchName.equals("Refrigerator"))
					SearchCriteria.Refrigerator.valueOf(key);
				else
					return false;
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
		return true;
	}

}