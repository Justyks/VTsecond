package lab2.service;

import java.io.File;
import java.util.List;


public interface JAXBService {

	List<Appliance> unmarshalAppliance(File file);
	
}