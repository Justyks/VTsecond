package lab2.service;

import lab2.entity.Criteria;
import java.util.List;



public interface ApplianceService {

	List<Appliance> find(Criteria criteria);
	List<Appliance> sortByPrice();
}

