package dec31_oops;
 class Box
 {
	 float width;
	 float height;
	 float depth;
	 float calcvol() {
     return width*height*depth;
	 }
 }

public class Dec31_BoxDemo {

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol=box1.calcvol();
		System.out.println("volume of Box1 is"+vol);
		
	}

}
