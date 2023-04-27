package pack1;

public class Test {

	 public void m1() {
		System.out.println("am from m1 method of test class");
	}

	public static void main(String[] args) {

	}

}

class Child extends Test {

	void display() {
	//	Test test = new Test();
		m1();
	}
}