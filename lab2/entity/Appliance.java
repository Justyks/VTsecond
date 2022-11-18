package lab2.entity;

public class Appliance implements Comparable<Appliance> {
	@XmlElement
	private double price;

	Appliance(double price) {
		this.price = price;
	}


	Appliance() {
		this.price = 0;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Price: %f", this.price);
	}

	public int compareTo(Appliance o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		}
		return 0;
	}
}
