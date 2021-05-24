import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HeroDAO;

public class DeleteDatabaseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//是通过点击超链接来请求的，所以是根据页面进行编码
		req.setCharacterEncoding("GBK");
		if (new HeroDAO().delete(req.getParameter("name"))) {
			resp.sendRedirect("queryDatabase");
		}else {
			resp.setContentType("text/html;charset=GBK");
			PrintWriter pw = resp.getWriter();
			pw.println("<div>无法删除</div>");
			pw.println("<a herf='queryDatabase'>重试</a>");
			pw.close();
		}
	}
}
