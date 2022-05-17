import java.sql.*;
public class Practice3 {

	public static void main(String[] args) throws Exception {
						
						String userName="root";
						String password="admin";
						String url="jdbc:mysql://localhost:3306/world";
						Connection con=DriverManager.getConnection(url,userName,password);
						System.out.println("connected to database");
						Statement st=con.createStatement();
					//	String sql="insert into students values(501,'Ram','Cse')";
					//	String sql2="insert into students values(502,'Rani','Cse')";
					//	int count=st.executeUpdate(sql);
					//	int count2=st.executeUpdate(sql2);
						
						/*int id[]= {507,508,509};
						String name[]= {"alfred","victoria","jhon"};
						String branch[]= {"cse","cse","cse"};
						for(int i=0;i<id.length;i++) {
							PreparedStatement pstmt=con.prepareStatement("insert into students values(?,?,?)");
							pstmt.setInt(1, id[i]);
							pstmt.setString(2,name[i]);
							pstmt.setString(3, branch[i]);
							
							int count1=pstmt.executeUpdate();
							
							System.out.println(count1);
						}*/
					/*	PreparedStatement pstmt=con.prepareStatement("delete from students  where stuid=?") ;

	pstmt.setInt(1, 509);
	int count5=pstmt.executeUpdate();
	System.out.println(count5);
	String sql="select * from students";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
	}*/
	/*CallableStatement cs=con.prepareCall("{call studentname (?,?)}" );
	cs.setString(1, "Jack");
	cs.setInt(2, 501);
	cs.execute();*/
	Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
	String sql="select * from adharinfo ";
     ResultSet rs=st.executeQuery(sql);
   while(rs.next()) {
     rs.afterLast();
		rs.previous();
    System.out.println(rs.getString(1)+":"+rs.getLong(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
    rs.first();
    System.out.println(rs.getString(1)+":"+rs.getLong(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
	rs.next();
	System.out.println(rs.getString(1)+":"+rs.getLong(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
   rs.absolute(4);
   System.out.println(rs.getString(1)+":"+rs.getLong(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
   }

						
}
}