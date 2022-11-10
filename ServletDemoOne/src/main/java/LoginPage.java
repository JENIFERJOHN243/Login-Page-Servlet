

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JSpinner.DateEditor;


public class LoginPage extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter printWriter =  response.getWriter();
		if(userName.equals("jeni")&&password.equals("12345"))
		{
			
			printWriter.print("welcome "+userName);
			Date date = new Date();
			printWriter.print("Time Stamp "+date.toString());
		}
		else
		{
			printWriter.print("Invalid "+userName);
		}
	}

}
