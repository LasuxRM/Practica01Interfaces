package Hospital;

public class Staff implements Entity,Human{
	
	String	Position	="";
	
	//Faltan constructores


//Getters y Setters de Entity & Human
	public String getDNI() {
		return DNI;
	}
	public void setDNI() {		
	}

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
	
	//Get y Set de la única variable no implementada
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	
	
}
