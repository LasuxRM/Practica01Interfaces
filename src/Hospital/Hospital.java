package Hospital;

public class Hospital implements Entity{

	String	Name 	="";
	int		Fax		=0;
	
	//Faltan constructores
	
	////Inicio métodos de interfaz
	public String getAddress() {
		return Address;
	}
	public void setAddress() {		
	}

	public int getPhone() {
		return Phone;
	}
	public void setPhone() {		
	}
	
	//Inicio métodos de la propia clase
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getFax() {
		return Fax;
	}
	public void setFax(int fax) {
		Fax = fax;
	}
}
