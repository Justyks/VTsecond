package lab2.service;

import lab2.service.implem.ApplianceServiceImpl;
import lab2.service.implem.HelperServiceImpl;
import lab2.service.implem.JAXBServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();

	private final HelperService helperService = new HelperServiceImpl();

	private final JAXBService jAXBService = new JAXBServiceImpl();

	private ServiceFactory() {
	}

	public JAXBService getJAXBService() {
		return jAXBService;
	}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

	public HelperService getHelperService() {
		return helperService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}

