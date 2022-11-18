package lab2.entity;

import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "Appliances")
@XmlAccessorType(XmlAccessType.FIELD)
public class Appliances implements Serializable {

	@XmlElements({ @XmlElement(name = "Appliance", type = Appliance.class),
		@XmlElement(name = "Laptop", type = Laptop.class),
	    @XmlElement(name = "Oven", type = Oven.class),
		@XmlElement(name = "Refrigerator", type = Refrigerator.class), })
	private List<Appliance> appliances;

	public List<Appliance> getAppliances() {
		return appliances;
	}

	public void setAppliances(List<Appliance> appliances) {
		this.appliances = appliances;
	}
}
