class Calculator {

	public void mulOfTwo(int a, int b) {
		System.out.println("mul of Two numbers : " + (a * b));
	}
	public void divOfTwo(int a, int b) {
		System.out.println("div of Two numbers :" + (a / b));
	}
}
class Calci extends Calculator {

	public void addOfTwo(int a, int b) {
		System.out.println("Add of Two numbers :" + (a + b));
	}
	public void subOfTwo(int a, int b) {
		System.out.println("Sub of Two numbers : " + (a - b));
	}
}
//java.lang.Object
public class Inheritance_Ex extends Calculator {

	public void sayHello() {
		System.out.println("Hello Everyone....");
	}

	public static void main(String[] args) {
		Inheritance_Ex obj = new Inheritance_Ex();
		obj.sayHello();
	//	obj.addOfTwo(12, 13);
	//	obj.subOfTwo(11, 90);
		obj.divOfTwo(23, 2);
		obj.mulOfTwo(12, 3);

	}

}
