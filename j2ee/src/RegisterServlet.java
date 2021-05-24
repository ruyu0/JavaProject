import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		//TODO:post请求设置有效,get请求设置无效
//		req.setCharacterEncoding("GBK");
		//TODO:三种获取参数方法
		System.out.println("username:" + req.getParameter("username"));
		System.out.println("password:" + req.getParameterValues("password")[0]);
		Map<String, String[]> parameters = req.getParameterMap();
		System.out.println("sex:" + parameters.get("sex")[0]);
		System.out.println("hobbies:");
		for (String e : parameters.get("hobbies")) {
			//TODO:逆向解码操作
			byte[] bytes = e.getBytes("iso-8859-1");
			//这里如果是地址栏URL的参数则会出错,因为地址栏是utf-8编码
			e = new String(bytes, "GBK");
			System.out.println(e);
		}
		//TODO:获取头部信息
		Enumeration<String> headersName = req.getHeaderNames();
		while (headersName.hasMoreElements()) {
			String headerName = headersName.nextElement();
			Enumeration<String> headerValues = req.getHeaders(headerName);
			while (headerValues.hasMoreElements()) {
				System.out.println(headerName + ": " + new String(headerValues.nextElement().getBytes("iso-8859-1"), "GBK"));
				
			}
		}
		//TODO:设置响应格式
		resp.setContentType("text/html;charset=GBK");
//		//实现下载
//		resp.setContentType("text/aaa;charset=GBK");
		//TODO：获取请求数据的格式
		String requestType = req.getHeader("accept");
		resp.getWriter().println("<div>" + requestType + "<div>");
	}
	
	
}
