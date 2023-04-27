package pack1;

import com.excelr.oops.Employee;

public class Client {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("mahesh");
		
		
		System.out.println(emp.getEmpName());
	}

}
