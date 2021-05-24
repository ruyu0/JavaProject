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
	
	// TODO:重写构造方法查看调用次数和时机
		public HelloServlet() {
			System.out.println("调用一次HelloServlet构造方法");
		}

		// TODO:重写初始化方法查看调用次数和时机
		@Override
		public void init() throws ServletException {
			super.init();
			System.out.println("调用一次HelloServlet初始化方法");
		}

		// TODO:重写销毁方法查看调用次数和时机
		@Override
		public void destroy() {
			super.destroy();
			System.out.println("调用一次HelloServlet销毁方法");
		}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("hello servlet");

		resp.setContentType("text/html;charset=GBK");
		PrintWriter pw = resp.getWriter();
		pw.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
				+ "<title>Hello</title>\r\n"
				+ "</head>\r\n" + "<body>\r\n" + "<h1>hello servlet</h1>" + "<p>" + new Date() + "</p>"
				+ "<a href=\"login.html\">登录</a>"
				+ "<a href=\"register.html\">注册</a>" + "</body>\r\n" + "</html>");
		pw.close();
	}

}
