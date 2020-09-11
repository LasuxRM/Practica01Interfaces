package Hospital;

public class Hospital implements Entity{

	String	Name 	="";
	//String	Address	="";
	//int		Phone	=0;
	int		Fax		=0;
	
	
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
	
	
	
	public String getAddress() {
		// TODO Auto-generated method stub
		return Address;
	}
	public int getPhone() {
		// TODO Auto-generated method stub
		return Phone;
	}
}
