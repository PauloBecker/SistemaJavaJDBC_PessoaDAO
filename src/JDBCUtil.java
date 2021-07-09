import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	
	private String url = "jdbc:mysql://localhost/exemplo?useSSL=false";
	private String user = "root";
	private String password = "C3rv3j@*2021";
	Connection connection = null;
	
	public Connection getConnetion() {
		
		try {
			if(connection==null)
			connection = DriverManager.getConnection(url,user,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
