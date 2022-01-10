package general;

public class Dec28_VariablesDemo1 {
		// class variable
	    final static int a = 1024;
		int b;
         void func1() {
			int c = 10;
			System.out.println("class variables " + a + " " + b);
			System.out.println("local variables " + c);
			//a = 7890;
			b = 56;
			System.out.println("class variables " + a + " " + b);
		}

		void func2() {
			System.out.println("class variables " + a + " " + b);
		}

		public static void main(String[] args) {
			Dec28_VariablesDemo1 obj = new Dec28_VariablesDemo1();
			System.out.println(obj.b);
			System.out.println(Dec28_VariablesDemo1.a);


	}

}
