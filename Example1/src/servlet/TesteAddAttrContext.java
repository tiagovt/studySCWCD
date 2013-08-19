package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TesteAddAttrContext
 */
public class TesteAddAttrContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TesteAddAttrContext() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter print = response.getWriter();
		if(this.getServletContext().getAttribute("nameTeste") != null){
			this.getServletContext().setAttribute("nameTeste", "valueTeste");
			print.print("<html> editado </br> Name = nameTeste </br> valor = valueTeste </html>");
		}else{
			this.getServletContext().setAttribute("nameTeste", "valueTeste2");
			print.print("<html> add novo valor </br>Name = nameTeste </br> valor = valueTeste2 </html>");
		}
	}

}
