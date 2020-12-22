

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorCookies
 */
public class VisitorCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
     String greeting = "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
//		flag will check whether user is a first time visitor or not (boolean)
		boolean newbie = true;
		
//		how to fetch cookies : fetch cookies using request object
//		using get cookies method it return array of cookie object
		
		Cookie[] cookies = request.getCookies();
		
//		check if a user is a newbie or not
		
		if(cookies != null) {	//Repeated visitor
			for(int i = 0 ;i < cookies.length;i++) {
				if((cookies[i].getName().equals("repeatedVisitor")) && (cookies[i].getValue().equals("repeatedVisitor"))) {
					newbie = false;
					break;
				}
			}
		}
		
		if(newbie == true) {
			Cookie visitorCookie = new Cookie("repeatedVisitor", "yes");
//			Persistent Cookies -->setMaxAge(seconds)
			
			visitorCookie.setMaxAge(60*60*24*7);
			
			response.addCookie(visitorCookie);
			greeting = "Welcome Newbie!";
		}else {
			greeting ="Welcome Back!";
		}
//		send response in html form 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Visitor Cookies</title></head>");
		out.println("<body><h2>greeting</h2>");
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
