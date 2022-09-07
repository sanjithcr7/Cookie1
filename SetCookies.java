package cookie1;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class SetCookie
 */
@WebServlet("/set")
public class SetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SetCookies() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("mobile1");
		String s2=request.getParameter("mobile2");
		String s3=request.getParameter("mobile3");
		if(s1!=null) {
			Cookie c1=new Cookie("mobile1",s1);
			response.addCookie(c1);
		}
		if(s2!=null)
		{
			Cookie c2=new Cookie("mobile2",s2);
			response.addCookie(c2);
		}
		if(s3!=null)
		{
			Cookie c3=new Cookie("mobile3",s3);
			response.addCookie(c3);
		}
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("Yours Books are added to cart");
		pw.println("<a href=get>NEXT</a>");
		pw.println("</body></html>");
		
	}

}
