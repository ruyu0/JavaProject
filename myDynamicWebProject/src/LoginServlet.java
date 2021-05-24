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
		System.out.println("初始化LoginServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("gbk");
		String name = req.getParameter("name").trim();
		String passwd = req.getParameter("password").trim();
		System.out.println("name = " + name);
		System.out.println("password = " + passwd);
		//判断字符串在前，可以防止null异常
		if ("user".equals(name) && "123".equals(passwd)) {
			//TODO:服务端跳转
//			//跳转html
//			req.getRequestDispatcher("success.html").forward(req, resp);
			//跳转servlet
			//同时只能跳转一个
			//测试服务器跳转servlet，查看调用哪个service方法
			req.getServletContext().getRequestDispatcher("/success.html").forward(req, resp);
		}else {
			//TODO:客户端跳转
//			//302临时性跳转
//			resp.sendRedirect("fail.html");
			//301 永久性跳转
			resp.setStatus(301);
			resp.setHeader("Location", "fail.html");
		}
	}
}
