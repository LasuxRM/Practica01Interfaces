package Hospital;

public class Patient {
	String 	IdPatient	="";
	String 	DNI			="";
	String	NameSurname	="";
	String	Adress		="";
	int		Phone		=0;
	
	public Patient(String idPatient, String dNI, String nameSurname, String adress, int phone) {
		super();
		IdPatient = idPatient;
		DNI = dNI;
		NameSurname = nameSurname;
		Adress = adress;
		Phone = phone;
	}
	public String getIdPatient() {
		return IdPatient;
	}
	public void setIdPatient(String idPatient) {
		IdPatient = idPatient;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNameSurname() {
		return NameSurname;
	}
	public void setNameSurname(String nameSurname) {
		NameSurname = nameSurname;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}

}
