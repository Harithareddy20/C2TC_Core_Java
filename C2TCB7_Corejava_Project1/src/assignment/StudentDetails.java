package assignment;

public class StudentDetails {
	int usn;
	String name;
	String email;
	String branch;
	
	public StudentDetails() {
	}
	public StudentDetails(int usn,String name,String email,String branch) {
		super();
		this.name = name;
		this.email = email;
		this.branch =branch;
		this.usn = usn;
	}
	public StudentDetails(int usn) {
		this.usn =usn;	
	}
  public  String tostring() {
	  String str ="("+usn+","+email+","+name+","+branch+")";
	  return str;
  }

	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails();
		s1.name="Haritha";
		s1.email="harithareddy";
		s1.branch="ECE";
		s1.usn =120;
		System.out.println(s1.toString());
		
		
		StudentDetails s2= new StudentDetails(120,"Haritha","harithareddy","ECE");
		System.out.println(s2.tostring());

	}

}
