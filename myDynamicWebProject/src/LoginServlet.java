import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("��ʼ��LoginServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("gbk");
		String name = req.getParameter("name").trim();
		String passwd = req.getParameter("password").trim();
		System.out.println("name = " + name);
		System.out.println("password = " + passwd);
		//�ж��ַ�����ǰ�����Է�ֹnull�쳣
		if ("user".equals(name) && "123".equals(passwd)) {
			//TODO:�������ת
//			//��תhtml
//			req.getRequestDispatcher("success.html").forward(req, resp);
			//��תservlet
			//ͬʱֻ����תһ��
			//���Է�������תservlet���鿴�����ĸ�service����
			req.getServletContext().getRequestDispatcher("/success.html").forward(req, resp);
		}else {
			//TODO:�ͻ�����ת
//			//302��ʱ����ת
//			resp.sendRedirect("fail.html");
			//301 ��������ת
			resp.setStatus(301);
			resp.setHeader("Location", "fail.html");
		}
	}
}
