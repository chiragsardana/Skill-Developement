

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			String id = request.getQueryString();
//			System.out.println("id is : "+id.split("=")[1]);
			
			String query = id.split("=")[1];
			Class.forName("com.mysql.cj.jdbc.Driver");
	         
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","sardana80");
         
    		PreparedStatement pst = con.prepareStatement("delete from info where name = "+query);
    		pst.setString(1, query);
    		
    		int record = pst.executeUpdate();
    		
    		if(record == 1) {
    			System.out.println("Deleted Successfully!!!");
    		}else {
    			System.out.println("There is some error!!!!");
    		}
    		
    		response.sendRedirect("/MavenDemo/ViewServlet");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		Delete statement
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
