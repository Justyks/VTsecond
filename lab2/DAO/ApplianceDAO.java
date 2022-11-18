package lab2.DAO;
import secondLab.entity.Criteria;

import java.util.List;

public interface ApplianceDAO {
	
	List<Appliance> find(Criteria criteria);
	List<Appliance> sortByPrice();
}
