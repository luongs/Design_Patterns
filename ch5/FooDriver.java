package ch5;

public class FooDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Foo foo1 = new Foo();
		Foo foo2 = new Foo();
		
		foo1.incrementBiz();
		foo2.incrementBiz();
		foo2.incrementBiz();
		System.out.println(foo1);
	}

}
