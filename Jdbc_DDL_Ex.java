import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_DDL_Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinetraining", "root",
				"rpsconsulting");
//		creating the statement
		Statement stmt = conn.createStatement();
//		executing the querys  //execute-->DDL,executeUpdate-->DML,executeQuery-->DRL
		// stmt.execute("create table emps_virtual1(eid int,ename varchar(10))");
		// int result=stmt.executeUpdate("insert into emps_virtual
		// values(112,'naresh')");
		// int result=stmt.executeUpdate("update emps_virtual set ename='sandeep' where
		// eid=111 ");
		// int result=stmt.executeUpdate("delete from emps_virtual where eid=112");
//		close the connection
		ResultSet rs = stmt.executeQuery("select * from emps_virtual");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		conn.close();

	}

}
