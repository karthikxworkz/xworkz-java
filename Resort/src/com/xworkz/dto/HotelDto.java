

public class HotelDto {
	private String hostelName;
	private int price;
	private String addresss;
	private int tables;
	
	public HotelDto() {
		System.out.println("No args constructor");
	}

	public HotelDto(String hostelName, int price, String addresss, int tables) {
		System.out.println("Paramerrtised constructor");
		this.hostelName = hostelName;
		this.price = price;
		this.addresss = addresss;
		this.tables = tables;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public int getTables() {
		return tables;
	}

	public void setTables(int tables) {
		this.tables = tables;
	}
    
	public String toString() {
		return "addresss:"+addresss+
				"price:"+price+
				"hostelName:"+hostelName+
				"tables:"+tables+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addresss == null) ? 0 : addresss.hashCode());
		result = prime * result + ((hostelName == null) ? 0 : hostelName.hashCode());
		result = prime * result + price;
		result = prime * result + tables;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDto other = (HotelDto) obj;
		if (addresss == null) {
			if (other.addresss != null)
				return false;
		} else if (!addresss.equals(other.addresss))
			return false;
		if (hostelName == null) {
			if (other.hostelName != null)
				return false;
		} else if (!hostelName.equals(other.hostelName))
			return false;
		if (price != other.price)
			return false;
		if (tables != other.tables)
			return false;
		return true;
	}	
}
