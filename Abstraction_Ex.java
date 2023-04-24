interface SuperParent {
	public abstract void divOfTwo(int a, int b);

	void modOfTwo(int a, int b);// public abstract void modOfTwo(int a,int b);
}

abstract class Parent implements SuperParent {
	public void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers :" + (a - b));
	}

	public abstract void mulOfTwo(int a, int b);

}

public class Abstraction_Ex extends Parent {

	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public static void main(String[] args) {

		Abstraction_Ex obj = new Abstraction_Ex();
		obj.addOfTwo(20, 30);
		obj.subOfTwo(32, 2);
		obj.divOfTwo(22, 2);
		obj.modOfTwo(40, 2);
		obj.mulOfTwo(23, 2);

	}

	@Override
	public void divOfTwo(int a, int b) {
		System.out.println("division");
	}

	@Override
	public void modOfTwo(int a, int b) {
		System.out.println("Mod");
	}

	@Override
	public void mulOfTwo(int a, int b) {
		System.out.println("Multiplication");
	}

}
