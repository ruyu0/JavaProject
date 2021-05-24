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
		//��ͨ�����������������ģ������Ǹ���ҳ����б���
		req.setCharacterEncoding("GBK");
		if (new HeroDAO().delete(req.getParameter("name"))) {
			resp.sendRedirect("queryDatabase");
		}else {
			resp.setContentType("text/html;charset=GBK");
			PrintWriter pw = resp.getWriter();
			pw.println("<div>�޷�ɾ��</div>");
			pw.println("<a herf='queryDatabase'>����</a>");
			pw.close();
		}
	}
}
