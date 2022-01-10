package oops;

public class Employeee {
	int id;
	String name;
	String email;
	float salary;
	public Employeee() {
	}
	public Employeee(int id,String name,String email,Float Salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public Employeee(int id) {
		this.id =id;	
	}
  public  String tostring() {
	  String str="("+id+ ","+email+","+salary+","+name+")";
	  return str;
  }
	public static void main(String[] args) {
		Employeee e1=new Employeee();
		e1.id=101;
		e1.name="Haritha";
		e1.email="hgweuf";
		e1.salary=30.6f;
		
		Employeee e2= new Employeee(102,"sahana","hgweuf",45.83f);
		System.out.println(e2.tostring());
		
		Employeee e3 = new Employeee(103);

	}

}
