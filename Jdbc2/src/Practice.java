import java.sql.*;
public class Practice {

	public static void main(String[] args) {
		
String username="root";
String password="admin";
String url="jdbc:mysql://LocalHost:3306/world";
try {
	Connection con=DriverManager.getConnection(url, username, password);
	System.out.println("connected");
	
    //Statement st=con.createStatement();
	//String insert ="insert into continents values('chun','aoi','faisal','otto','kofi','jose','marcia','olivia')";
	//int store=st.executeUpdate(insert);
	//System.out.println(store);
	//int id[]= {501,502,511,512};
     //double salary[]= {2000,2000,2000,2000};
  //	for(int i=0;i<id.length;i++) {
	//	PreparedStatement stmt=con.prepareStatement(  "update  employee set salary= ? where empId=?  ");
		
	PreparedStatement stmt=con.prepareStatement(  "delete from  employee  where empId=?  ");
		
		//stmt.setDouble(1, salary[i]);
		stmt.setInt(1, 514);
		int store=stmt.executeUpdate();
		System.out.println(store);
	//}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
