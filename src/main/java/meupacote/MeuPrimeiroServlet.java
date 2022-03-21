package meupacote;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuPrimeiroServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1074667491489717476L;

	public void destroy() {
		super.destroy();
	}
	
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=ISO-8859-1");
		String html = "<html>"+
				"<head><title>Trabalhando com Servlet</title></head>"+
				"<body><h1>Meu Primeiro Servlet</h1>"+
				"</body></html>";
		PrintWriter out = response.getWriter();
		out.print(html);
		out.close();
	}
}
