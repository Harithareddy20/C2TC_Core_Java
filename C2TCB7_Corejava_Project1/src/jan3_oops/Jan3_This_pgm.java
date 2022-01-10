package jan3_oops;

class animal
{
	int legs;
	String name;
	String colour;

public animal()
{
	System.out.println("This is a default constructor");
}
public animal(String name) {
	this();
	this.name = name;
}
public animal(String name,String colour) {
	this(name);
	this.colour =colour;
}
public animal(int legs,String name,String colour) {
	this(name,colour);
	this.legs=legs;
}
void display()
{
	System.out.println("Animal Description");
	System.out.println(colour+""+"colour"+name+""+"with"+""+""+legs);
}
}
public class Jan3_This_pgm {

	public static void main(String[] args) {
		animal obj1=new animal(4,"cat","white");
		obj1.display();
        animal obj2=new animal("Dog","Black");
		obj2.display();
		

	}

}
