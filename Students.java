package Week3day1assignment4;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("id= "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id= "+id + "  Name="+name);
	}
	public void getStudentInfo(String email,String phonenumber) {
		System.out.println("Email id is= "+email + "  phonenumber=" +phonenumber);
	}
	

	public static void main(String[] args) {
		
		Students or =new Students();
		or.getStudentInfo(100);
		or.getStudentInfo(120, "Test");
		or.getStudentInfo("test@gmail.com","9000090000");
	}

}
