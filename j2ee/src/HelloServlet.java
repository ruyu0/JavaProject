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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			System.out.println("hello servlet");
//			//TODO:response���ı�������
//			//ֻ���÷����������ַ���,�����������͵�������ı����ַ���,�����������ַ���,cp1252�Ͳ���
//			resp.setCharacterEncoding("cp1252");

//			//����������������룬����Ĭ�����������windows1252(��cp1252)���룬���ַ���û������
//			//��֪����������������ݸ�ʽ��text/html��Ҫ����ʹ��GBK�����룬��ʵ��������ͬʱ�涨�˷������ı��뷽ʽ
//			resp.setHeader("content-type", "text/html;charset=GBK");
			// ������ķ�װ,����
			resp.setContentType("text/html;charset=GBK");

//			//�������ʹ��setCharacterEncoding(��xxx��);����������Ľ����ָ�Ĭ��
//			resp.setCharacterEncoding("utf-8");
			resp.getWriter().println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
//					//����������ֻ�Ǹ�֪����������ַ���,��Ҫ���÷����������ַ�����֮��ͬ
//					+ "<meta charset='UTF-8'>"
//					+ "<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>" 
					+ "<title>Hello</title>\r\n"
					+ "</head>\r\n" + "<body>\r\n" + "<h1>hello servlet</h1>" + "<p>" + new Date() + "</p>"
					+ "<a href=\"http://127.0.0.1:8080/test/login.html\">��¼</a>"
					+ "<a href=\"http://127.0.0.1:8080/test/register.html\">ע��</a>" + "</body>\r\n" + "</html>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
