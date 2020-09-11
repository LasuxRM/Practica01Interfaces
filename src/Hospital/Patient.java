package Hospital;

public class Patient implements Entity, Human{
	String 	IdPatient	="";
	String	NameSurname	="";
	
	//Faltan constructores
	
	
	//Inicio métodos de interfaz
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
	
	//Inicio métodos de la propia clase
	public String getIdPatient() {
		return IdPatient;
	}
	public void setIdPatient(String idPatient) {
		IdPatient = idPatient;
	}
	public String getNameSurname() {
		return NameSurname;
	}
	public void setNameSurname(String nameSurname) {
		NameSurname = nameSurname;
	}
	
	

}
