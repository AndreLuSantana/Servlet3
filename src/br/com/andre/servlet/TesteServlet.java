package br.com.andre.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TesteServlet")
public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, parabens vc escreveu o primeiro servlets.<br>");
		out.println("Porque somente este aparece.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet TesteServlet foi chamado.");
	}
}
