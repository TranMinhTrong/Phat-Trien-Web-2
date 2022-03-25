package trong;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/welcome","/hello","/hi"})
public class WelcomServerlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		try(PrintWriter out= resp.getWriter()) {
			out.println("doGet: Welcome to Servlet");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try(PrintWriter out= resp.getWriter()) {
			out.println("doPost: Welcome to Servlet");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		try(PrintWriter out= resp.getWriter()) {
//			out.println("service: Welcome to Servlet");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

	private static final long serialVersionUID = 1L;

}
