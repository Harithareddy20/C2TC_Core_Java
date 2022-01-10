package general;

public class Dec28_TypeCastingDemo {

	public static void main(String[] args) {
		// widening/implicit typecasting
		byte b=10;
		int i=b;
		System.out.println(i);
		float f=22.14f;
		double d=f;
		System.out.println(d);
		char ch='A';
		int i3=ch;
		System.out.println(i3);
		char var1='\u00A7';
		int i4=var1;
		System.out.println(i4);
		//narrowing/explicit typcasting
		double f1=10.532f;
		long l=(long)f1;
		System.out.println(i);
		 
		long l1=9223372036854775806L;
		int i2=(int)l1;
		System.out.println(i2);
		
		
		byte b1=90;
		char ch1=(char)b1;
		System.out.println(ch1);

	}

}
