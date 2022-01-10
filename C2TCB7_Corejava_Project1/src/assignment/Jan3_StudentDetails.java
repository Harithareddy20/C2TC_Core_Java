package assignment;

public class Jan3_StudentDetails {
	int usn;
	String name;
	String email;
	String branch;
	
	public Jan3_StudentDetails() {
	}
	public Jan3_StudentDetails(int usn,String name,String email,String branch) {
		super();
		this.name = name;
		this.email = email;
		this.branch =branch;
		this.usn = usn;
	}
	public Jan3_StudentDetails(int usn) {
		this.usn =usn;	
	}
  public  String tostring() {
	  String str ="("+usn+","+email+","+name+","+branch+")";
	  return str;
  }

	public static void main(String[] args) {
		Jan3_StudentDetails s1=new Jan3_StudentDetails();
		s1.name="Haritha";
		s1.email="harithareddy";
		s1.branch="ECE";
		s1.usn =120;
		System.out.println(s1.toString());
		
		
		Jan3_StudentDetails s2= new Jan3_StudentDetails(120,"Haritha","harithareddy","ECE");
		System.out.println(s2.tostring());

	}

}
