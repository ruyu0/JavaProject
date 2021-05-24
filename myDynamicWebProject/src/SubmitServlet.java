import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import character.ADHero;
import character.Hero;
import net.sf.json.JSONObject;

public class SubmitServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//请求参数的编码为UTF-8，目前还不清楚如何设置为GBK
		req.setCharacterEncoding("UTF-8");
		String data = req.getParameter("data");
		System.out.println("服务端收到的数据" + data);
		//转换为JSON对象
		JSONObject jsonObject = JSONObject.fromObject(data);
		System.out.println("转换为JSON数据" + jsonObject);
		//Hero是抽象类，不能实例化，只能转换其子类的实例对象
		Hero hero = (ADHero)JSONObject.toBean(jsonObject, ADHero.class);
		System.out.println("转换为Hero对象之后" + hero);
	}
}
