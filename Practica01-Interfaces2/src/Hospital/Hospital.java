package Hospital;

public class Hospital implements Entity{

	private String	Name;
	private String	Address;
	private String	Phone;
	private String	Fax;

	
	//Faltan constructores
	public Hospital(String name, String addres, String phone, String fax) {
		super();
		this.Name = name;
		this.Fax = fax;
		
		this.Address = addres;
		this.Phone	= phone;
	}


	////Inicio métodos de interfaz
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address=address;
	}

	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		this.Phone = phone;
	}
	
	//Inicio métodos de la propia clase
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	
}
