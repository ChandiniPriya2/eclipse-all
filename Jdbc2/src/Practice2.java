import java.sql.*;
public class Practice2 {

	public static void main(String[] args) throws SQLException {
		String userName="root";
        String password="admin";
         String  url="jdbc:mysql://Localhost:3306/world";
         Connection con=DriverManager.getConnection(url, userName, password);
            System.out.println(con);
            Statement st=con.createStatement();
            String query="Select empName from employee where salary>2000";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()) {
            	System.out.println(rs.getString(1));
            }
	}

}
