package lara.innrerClass;

public class B {
	
	static B b = new B();
	
	class C{}
	static class D{}
	
	void test1(){
		C c1 = new C();
		D d1 = new D();
		test2();
	}
	
	static void test2(){
		C c1 = b.new C();
		D d1 = new D();
	}
	
}
