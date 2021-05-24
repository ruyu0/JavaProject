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
		//��������ı���ΪUTF-8��Ŀǰ��������������ΪGBK
		req.setCharacterEncoding("UTF-8");
		String data = req.getParameter("data");
		System.out.println("������յ�������" + data);
		//ת��ΪJSON����
		JSONObject jsonObject = JSONObject.fromObject(data);
		System.out.println("ת��ΪJSON����" + jsonObject);
		//Hero�ǳ����࣬����ʵ������ֻ��ת���������ʵ������
		Hero hero = (ADHero)JSONObject.toBean(jsonObject, ADHero.class);
		System.out.println("ת��ΪHero����֮��" + hero);
	}
}
