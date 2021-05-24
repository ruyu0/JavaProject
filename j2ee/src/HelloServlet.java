import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			System.out.println("hello servlet");
//			//TODO:response中文编码问题
//			//只设置服务器编码字符集,即服务器发送到浏览器的编码字符集,必须是中文字符集,cp1252就不行
//			resp.setCharacterEncoding("cp1252");

//			//必须设置浏览器解码，否则默认是浏览器是windows1252(即cp1252)解码，该字符集没有中文
//			//告知浏览器服务器的数据格式是text/html，要求其使用GBK来解码，但实验结果表明同时规定了服务器的编码方式
//			resp.setHeader("content-type", "text/html;charset=GBK");
			// 上两句的封装,常用
			resp.setContentType("text/html;charset=GBK");

//			//不得最后使用setCharacterEncoding(“xxx”);否则浏览器的解码会恢复默认
//			resp.setCharacterEncoding("utf-8");
			resp.getWriter().println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
//					//在这里设置只是告知浏览器解码字符集,需要设置服务器编码字符集与之相同
//					+ "<meta charset='UTF-8'>"
//					+ "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>" 
					+ "<title>Hello</title>\r\n"
					+ "</head>\r\n" + "<body>\r\n" + "<h1>hello servlet</h1>" + "<p>" + new Date() + "</p>"
					+ "<a href=\"http://127.0.0.1:8080/test/login.html\">登录</a>"
					+ "<a href=\"http://127.0.0.1:8080/test/register.html\">注册</a>" + "</body>\r\n" + "</html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
