package lab2.service.implem;
import lab2.entity.Appliances;
import lab2.service.JAXBService;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBServiceImpl implements JAXBService {

	public List<Appliance> unmarshalAppliance(File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Appliances.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Appliances appliances = (Appliances) jaxbUnmarshaller.unmarshal(file);
			return appliances.getAppliances();
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
