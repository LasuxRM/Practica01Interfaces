package Hospital;

public class Staff implements Entity,Person{
	
	String	JobPosition	="";
	
	String DNI;
	String Address;
	String Phone;
	
	//Faltan constructores
	public Staff(String dNI, String address, String phone, String jobPosition) {
		super();
		JobPosition = jobPosition;
		
		DNI = dNI;
		Address = address;
		Phone = phone;
	}

	//Getters y Setters de Entity & Human
		
	public String getDNI() {
		// TODO Auto-generated method stub
		return DNI;
	}
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
	
	//Get y Set de la única variable no implementada

	public String getJobPosition() {
		return JobPosition;
	}
	public void setJobPosition(String jobPosition) {
		JobPosition = jobPosition;
	}
	
}
