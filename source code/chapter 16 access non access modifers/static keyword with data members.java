class Test {
static int a=10;//no compile time error
void m1() {
	//static int b=20;//it shows compile time error
}
	

}

public class StaticSourcecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(a);//compime time error
		 System.out.println(Test.a);//it can be called without creating object
		 
	}

}
© 2020 GitHub, Inc.
