import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// TODO:��д���췽���鿴���ô�����ʱ��
		public HelloServlet() {
			System.out.println("����һ��HelloServlet���췽��");
		}

		// TODO:��д��ʼ�������鿴���ô�����ʱ��
		@Override
		public void init() throws ServletException {
			super.init();
			System.out.println("����һ��HelloServlet��ʼ������");
		}

		// TODO:��д���ٷ����鿴���ô�����ʱ��
		@Override
		public void destroy() {
			super.destroy();
			System.out.println("����һ��HelloServlet���ٷ���");
		}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("hello servlet");

		resp.setContentType("text/html;charset=GBK");
		PrintWriter pw = resp.getWriter();
		pw.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
				+ "<title>Hello</title>\r\n"
				+ "</head>\r\n" + "<body>\r\n" + "<h1>hello servlet</h1>" + "<p>" + new Date() + "</p>"
				+ "<a href=\"login.html\">��¼</a>"
				+ "<a href=\"register.html\">ע��</a>" + "</body>\r\n" + "</html>");
		pw.close();
	}

}
