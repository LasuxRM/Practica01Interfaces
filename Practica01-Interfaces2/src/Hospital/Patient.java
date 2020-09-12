package Hospital;

public class Patient implements Entity,Person{
	String 	IdPatient	="";
	String	NameSurname	="";
	
	String DNI;
	String Address;
	String Phone;
	
	//Faltan constructores
	public Patient(String idPatient, String dni, String nameSurname, String address, String phone) {
		super();
		IdPatient = idPatient;
		NameSurname = nameSurname;
		
		DNI=dni;
		Address=address;
		Phone=phone;
	}
	
	
	//Inicio métodos de interfaz

	public String getDNI() {
		// TODO Auto-generated method stub
		return DNI;
	}
	
	/*public void setDNI() {
		// TODO Auto-generated method stub
		
	}*/

	public String getAddress() {
		// TODO Auto-generated method stub
		return Address;
	}
	public void setAddress(String address) {
		Address=address;
	}
	
	public String getPhone() {
		// TODO Auto-generated method stub
		return Phone;
	}
	public void setPhone(String phone) {
		Phone=phone;
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
