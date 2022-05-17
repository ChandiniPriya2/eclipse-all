package ai.jobiak.task;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

public class ModifyAdhar {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://Localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password) ;
		System.out.println("connected to database");
		Random  random=new Random();
		Statement st=con.createStatement();
		while(true) {
		System.out.println("Menu");
		System.out.println("1.Apply for new Aadhar");
		System.out.println("2.Modify Adhar Name");
		System.out.println("3.Modify Address");
		System.out.println("4.Modify Date of birth");
		System.out.println("5.View your Adhar");
		System.out.println("6.view recent updates");
		System.out.println("6.Exit");
		System.out.println("Enter your choice ");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:
			CallableStatement cs=con.prepareCall("{call createAdhar(?,?,?,?,?,?,? )}");
		cs.setString(1, "");
			cs.setLong(2, random.nextLong(0000000000, 9999999999L));
			cs.setString(3,"");
		    cs.setString(4,"");
			cs.setString(5, "");
			cs.setString(6, "");
			cs.setString(7, "");
			cs.execute();
			System.out.println("your Aadhar is created ");
			break;
		case 2:
				CallableStatement cs1=con.prepareCall("{call updateName(?,?,?)}");
			cs1.setString(1, "TimCook");
			cs1.setLong(2, 2312435465L);
			cs1.setString(3, "2022-03-20 20:32:09");
			cs1.execute();
			System.out.println("your name is updated");
				break;
		case 3:
		CallableStatement cs2=con.prepareCall("{call updateAddress(?,?,?)}");
			cs2.setString(1, "United States,Ocala,Florida");
			cs2.setLong(2, 2312435465L);
			cs2.setString(3, "2022-03-20 20:32:09");
			cs2.execute();
			System.out.println("your address is updated" );
			break;
		case 4:
			CallableStatement cs3=con.prepareCall("{call updateDob(?,?,?)}");
			cs3.setString(1, "Dec30,1900");
			cs3.setLong(2, 2312435465L);
			cs3.setString(3, "2022-03-20 20:32:09");
			cs3.execute();
			System.out.println("your date of birth is updated");
				break;
		case 5:
			String sql="select * from adharinfo where adharnum=1234567890";
			ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
System.out.println("Name: "+rs.getString(1)+"\n"+"Adhar number: "+rs.getLong(2) +"\n "+"A	ddress: "+rs.getString(3)+"\n"+"FatherName: "+rs.getString(4)+"\n"+"Gender: "+rs.getString(5)+"\n"+"Date of birth: "+rs.getString(6));
		}
		break;
		case 6:
			CallableStatement cs4=con.prepareCall("{call viewRecentUpdates(? )}");
			cs4.setString(1, " 2022-03-20 20:32:09");
			cs4.execute();
			System.out.println("Name: "+cs4.getString(1)+"\n"+"Adhar number: "+cs4.getLong(2) +"\n "+"A	ddress: "+cs4.getString(3)+"\n"+"FatherName: "+cs4.getString(4)+"\n"+"Gender: "+cs4.getString(5)+"\n"+"Date of birth: "+cs4.getString(6));
		break;
		case 7:
			con.close();
			System.out.println("disconnected from database");
			break;
		}
		}
		}
	}
