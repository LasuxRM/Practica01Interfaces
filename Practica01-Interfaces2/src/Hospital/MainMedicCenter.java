package Hospital;

public class MainMedicCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital	H = new Hospital("Honorio Delgado Espinoza", "Av.", "123456", "8888");
		Staff		S = new Staff("44444444","Av.","666666","Director");
		Patient		P = new Patient("1111", "4444", "Juan Perez", "Av Tarapacá", "666666");
		
		/*
		System.out.println(H.getName());
		System.out.println(H.getAddress());
		System.out.println(H.getPhone());
		System.out.println(H.getFax());
		
		H.setName("HDE");
		H.setAddress("Calle");
		H.setPhone("000000");
		H.setFax("1111");
		
		
		System.out.println(H.getName());
		System.out.println(H.getAddress());
		System.out.println(H.getPhone());
		System.out.println(H.getFax());
		
		
		
		System.out.println(S.getDNI());
		System.out.println(S.getAddress());
		System.out.println(S.getPhone());
		System.out.println(S.getJobPosition());
		
		S.setAddress("Callessss");
		S.setPhone("0000001111");
		S.setJobPosition("Oficinista");
		
		System.out.println("Datos modificados");
		System.out.println(S.getDNI());
		System.out.println(S.getAddress());
		System.out.println(S.getPhone());
		System.out.println(S.getJobPosition());
	
	*/
		System.out.println(P.getIdPatient());
		System.out.println(P.getDNI());
		System.out.println(P.getNameSurname());
		System.out.println(P.getAddress());
		System.out.println(P.getPhone());
		
		P.setIdPatient("0001");
		P.setNameSurname("Pinocho Mentiroso");
		P.setAddress("Calle algo");
		P.setPhone("121212");
		
		System.out.println(P.getIdPatient());
		System.out.println(P.getDNI());
		System.out.println(P.getNameSurname());
		System.out.println(P.getAddress());
		System.out.println(P.getPhone());
	}
}
