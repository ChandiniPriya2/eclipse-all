package Chandini_Assesment2;
import java.sql.*;
import java.util.Scanner;
public class MailApp {

	public static void main(String[] args) throws SQLException {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("connected to database");
		Statement st=con.createStatement();
		
		String sender[]= {"Alfred","John","kim","Victoria","Sandy"};
		String receiever[]= {"Jason","Jason","jason","jason","jason"};
		String content[]= {"Assessement submission" ,"Requesting for recordings" ,"Assessement submission","  Festival Wishes","Leave permision" };
		
		for(int i=0;i<sender.length;i++) {
			PreparedStatement pstmt=con.prepareStatement("insert into gmail values(?,?,?,?)");
			pstmt.setString(1, sender[i]);
			pstmt.setString(2, receiever[i]);
			pstmt.setString(3, content[i]);
			pstmt.setInt(4, content[i].length());
			int count1=pstmt.executeUpdate();
			System.out.println(count1);
		}Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String sql= "select * from mail";
		ResultSet rs=st1.executeQuery(sql);
		while(true) {
			
			
			System.out.println("Menu");
			System.out.println("1.FirstMail");
			System.out.println("2.Next");
			System.out.println("3.previous");
			System.out.println("4.Last");
			System.out.println("5.particulr mail");
	        System.out.println("6.Exit");
			System.out.println("Enter your choice ");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
		switch(option)
		{
		
		case 1:
			if(rs.first()) {
				System.out.println("This was the first mail");
				System.out.println("From:"+rs.getString(1));
				System.out.println("To:"+rs.getString(2));
				System.out.println("Content:"+rs.getString(3));
				System.out.println("size of the content:"+rs.getInt(4));
				}
							break;
		case 2:
			if(rs.next()) {
			System.out.println("From:"+rs.getString(1));
			System.out.println("To:"+rs.getString(2));
			System.out.println("Content:"+rs.getString(3));
			System.out.println("size:"+rs.getInt(4));}
		else
			System.out.println("you cannot go forward this is the last mail");
			break;
		case 3:
			if(rs.previous()) {
			System.out.println("From:"+rs.getString(1));
			System.out.println("To:"+rs.getString(2));
			System.out.println("Content:"+rs.getString(3));
			System.out.println("Size of the content:"+rs.getInt(4));
		}
		else
			System.out.println("you cannot go backward this is the first mail");
			break;
		case 4:
			if(rs.last()) {
		System.out.println("-----------------------");
			System.out.println("From:"+rs.getString(1));
			System.out.println("-----------------------");
			System.out.println("To:"+rs.getString(2));
			System.out.println("-----------------------");
			System.out.println("Content:"+rs.getString(3));
			System.out.println("-----------------------");
			System.out.println("Size of the content:"+rs.getInt(4));
			System.out.println("-----------------------");}
		break;
		case 5:
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the number which mail you want");
			int num=sc.nextInt();
		if(rs.absolute(num)) {
			System.out.println("From:"+rs.getString(1));
			System.out.println("To:"+rs.getString(2));
			System.out.println("Content:"+rs.getString(3));
			System.out.println("size of the content:"+rs.getInt(4));
			}
		else
			System.out.println("Mail doesn't exists ");
			break;
		case 6:
			con.close();
			System.out.println("disconnected from database");
			break;
		}
		}
	}
}

	
