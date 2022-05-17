package ai.jobiak.day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Factorial implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		out.println("Factorial of given num is:"+fact);
		ArrayList<String> list=new ArrayList<>();
		list.add("Orange");
		list.add("blue");
		list.add("green");
		for(String color:list) {
			out.println(color);
		}
		HashMap<String,String> map=new HashMap();
		map.put("java"," James gosling");
		map.put("c"," Dennis Richie");
		map.put("cpp"," Bjarne strotstup");
		map.put("Linux"," Linus Travoid");
		map.put("Google"," Larry Page");
		map.put("facebook"," Mark Zuckerberg");
		map.put("Twitter"," Jock Dorsey");
		map.put("youtube"," steve chen");
		out.println(map);
	
	
	}

}
