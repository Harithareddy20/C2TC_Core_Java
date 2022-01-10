package jan3_oops;

public class Jan3_Employeee {
	int id;
	String name;
	String email;
	float salary;
	public Jan3_Employeee() {
	}
	public Jan3_Employeee(int id,String name,String email,Float Salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Jan3_Employeee(int id) {
		this.id =id;	
	}
  public  String tostring() {
	  String str="("+id+ ","+email+","+salary+","+name+")";
	  return str;
  }
	public static void main(String[] args) {
		Jan3_Employeee e1=new Jan3_Employeee();
		e1.id=101;
		e1.name="Haritha";
		e1.email="hgweuf";
		e1.salary=30.6f;
		
		Jan3_Employeee e2= new Jan3_Employeee(102,"sahana","hgweuf",45.83f);
		System.out.println(e2.tostring());
		
		Jan3_Employeee e3 = new Jan3_Employeee(103);

	}

}
