package dec28_operators;

public class Dec28_Variables {
	int a = 1024;
	int b = 0;

	void fun1() {
		int c = 0;
		System.out.println("class variables:" + a + " " + b);
		System.out.println("local variables:" + c);
		a = 7890;
		b = 56;
		System.out.println("class variables:" + a + " " + b);
	}

	void fun2() {
		System.out.println("class variables:" + a + " " + b);
	}

	public static void main(String[] args) {
		Dec28_Variables obj = new Dec28_Variables();
		obj.fun1();
		obj.fun2();

	}
}
