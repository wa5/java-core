package com.example.demo.web.controller;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A();
//it will work
a1.v(12);
//it will not work
a1.v("gggg");//hear no way we will know in adve wt type of data we will pass
//so concept of generic introduce

C a2=new C();
a2.v(0);
a2.v("hhh");
	}

}

class A{
	
	void v(int b) {
		System.out.print("im value"+ b);
	}
	
	
	
}
class 	C{
	//befor methods u can add <> or else
	<kaka>void v(kaka b) {
		System.out.print("im value"+ b);
	}
	
	
	
}
//u can add hear also
class 	D <kaka>{
	//befor methods u can add <> or else
	void v(kaka b) {
		System.out.print("im value"+ b);
	}
	
	
	
}
