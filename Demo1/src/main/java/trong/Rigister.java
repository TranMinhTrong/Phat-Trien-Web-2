package trong;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Rigister")
public class Rigister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Rigister() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try( PrintWriter out = response.getWriter()){
			String username= request.getParameter("username");
			String[] hobbies= request.getParameterValues("hobbies");
			String country= request.getParameter("country");
			String email= request.getParameter("email");
			String lop= request.getParameter("lop");
			String birthday = request.getParameter("birthday");
			out.println("<html><head> <meta charset=UTF-8 /> </head>");
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
