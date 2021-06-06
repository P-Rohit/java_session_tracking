

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String n=request.getParameter("userName");
			out.print("welcome "+n);
			out.print("<form action='servlet2'>");
			out.print("<br>");
			out.print("Enter Your score "+n+"<input type='text' name='score'>");
			out.print("<input type='hidden' name='uname' value='"+n+"'>");
			out.print("<input type='submit' valur='Calculate Grade'>");
			out.print("</form>");
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
