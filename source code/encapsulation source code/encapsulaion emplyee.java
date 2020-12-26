
 class Employee {

	private int em_id;//data hiding
	
	public void setEmpid(int em_id1) {
		em_id=em_id1;
		
	}

	public	int getEmpid() {
		return em_id;
		
	}
}





public class EncapsulatioProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("im encapsulation");
		
		Employee e=new Employee();
		e.setEmpid(2);
		
		System.out.println(e.getEmpid());
		
	}

}

