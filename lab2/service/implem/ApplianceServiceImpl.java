package lab2.service.implem;
import lab2.entity.Criteria;
import lab2.service.ApplianceService;

import java.util.List;
public class ApplianceServiceImpl implements ApplianceService {

	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance = applianceDAO.find(criteria);

		return appliance;
	}

	public List<Appliance> sortByPrice() {
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = applianceDAO.sortByPrice();

		return appliances;
	}
}
