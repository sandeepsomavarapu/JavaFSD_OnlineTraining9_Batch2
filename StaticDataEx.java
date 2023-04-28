import java.util.Scanner;

public class StaticDataEx {// ctrl+shift+o

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number for addition");
		int fnum = scanner.nextInt();
		System.out.println("Enter Second number for addition");
		int snum = scanner.nextInt();
		int result = fnum + snum;

		System.out.println("Enter Your name: ");
		String name = scanner.next();
		System.out.println("Enter Your Salary: ");
		float salary = scanner.nextFloat();

		System.out.println(result + " " + name+"  "+salary);
	}

}
