package ai.jobiak.task;

import java.sql.*;
import java.time.LocalDateTime;

public class AadharSeva {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://Localhost:3306/world";
		Connection con=DriverManager.getConnection(url, userName, password) ;
		System.out.println("connected");
		
		
		String name[]= {"Maria","Jose","Carlos","Victoria","Tim","Ali","Chang","Suzuki","Jessica","Daniel"};
		long num[]= {1234567890,4321567853L,8769013465L,6754091265L,2312435465L,6787950875L,6597865409L,1987908734L,7654321287L,9965947435L};
		String[] address= {"Newyork,Columbus cr","Sanfransico, Manhattan","China,Beijing","Japan,Kariya",
				"India,Andhrapradesh","India,jammu","Saudi,jeddah","Australia,Thangkenharenge","Africa,Gauteng","Mexico,Nuevo Leon"};
		String fname[]= {"Cheng","Chao","Jia","Wei","Bao","Zhen","Ling","Ming","Hua","Jiang"};
		String gender[]= {"Male","Female","Female","Male","Female","Male" ,"Male","Female","Male","Female"};
		String dob[]= {"Nov20","Mar19","Jan1","Feb28","Dec30","Aug25","Sep2","Feb1","Apr23","May9"};
	
		for(int i=0;i<name.length;i++)
		{
			PreparedStatement pstmt=con.prepareStatement("insert into adharinfo values(?,?,?,?,?,?)");
			pstmt.setString(1,name[i]);
			pstmt.setLong(2, num[i]);
			pstmt.setString(3, address[i]);
			pstmt.setString(4, fname[i]);
			pstmt.setString(5,gender[i]);
			pstmt.setString(6, dob[i]);
	
			int count=pstmt.executeUpdate();
			System.out.println(count);
		}

	}

}
