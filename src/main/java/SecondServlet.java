

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("uname");
		String score=request.getParameter("score");
		out.print("Hello "+n+", Your result:<br>");
		int s=Integer.parseInt(score);
		if (s>=91) {
			out.print("S Grade");
		}
		else if (s>=81) {
			out.print("A Grade");
		}
		else if (s>=71) {
			out.print("B Grade");
		}
		else if (s>=61) {
			out.print("C Grade");
		}
		else if (s>=51) {
			out.print("D Grade");
		}
		else {
			out.print("Better luck next Sem :`(");
		}
		out.close();
	}

}
