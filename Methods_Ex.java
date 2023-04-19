
public class Methods_Ex {
	int a = 100;
	int b = 50;

	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public void subOfTwo() {
		System.out.println(a - b);
	}

	public void mulOfThree(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	public static String sayHello() {
		return "welcome to java methods....";
	}

	public static void main(String[] args) {
		System.out.println(Methods_Ex.sayHello());
		Methods_Ex obj = new Methods_Ex();
		System.out.println(obj.addOfTwo(12, 13));
		obj.subOfTwo();
		obj.mulOfThree(2, 3, 4);
	}
}
