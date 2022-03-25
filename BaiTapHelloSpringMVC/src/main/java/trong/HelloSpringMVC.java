package trong;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloSpringMVC
 */
@WebServlet("/HelloSpringMVC")
public class HelloSpringMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloSpringMVC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		try( PrintWriter out = response.getWriter()){
			String username= request.getParameter("username");
			String[] hobbies= request.getParameterValues("hobbies");
			String country= request.getParameter("country");
			String email= request.getParameter("email");
			String lop= request.getParameter("lop");
			String birthday = request.getParameter("birthday");
			out.println("<html><head> </head>");
			out.println("<body>");
				out.print("<h2>Ho va Ten: "+username +"</h2>");
				out.print("<h2>So Thich: ");
				for(String item: hobbies)
				{
					out.print(item+" , " );
				}
				out.print("</h2>");
				out.print("<h2>Email: "+email +"</h2>");
				out.print("<h2>Lop: "+lop +"</h2>");
				out.print("<h2>Ngay Sinh: "+birthday +"</h2>");
				out.print("<h2>Quoc Tich: "+country +"</h2>");
				
			out.println("</body></html>");
		}
	}

	@Override
	protected void service(HttpServletRequest reqs, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out= resp.getWriter()) {
			out.println("service: Welcome to Servlet");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try(PrintWriter out= response.getWriter()) {
			out.println("doPost: Welcome to Servlet");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
