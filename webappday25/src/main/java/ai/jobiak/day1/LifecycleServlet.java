package ai.jobiak.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifecycleServlet implements Servlet {


	

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
		try {
	System.out.println("entered init()..");
	FileOutputStream fos=new FileOutputStream("Hello.txt");
	fos.write("This is added in init()" .getBytes());
	fos.close();
	System.out.println("exiting init");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
			}
@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().println("This is from service()");

	}
	public void destroy() {
		try {
		System.out.println("enterd destroy");
		FileOutputStream fos;
		
			fos = new FileOutputStream("Hello.txt");
		
		fos.write("This is added in destroy()" .getBytes());
		fos.close();
		System.out.println("exiting destroy");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
