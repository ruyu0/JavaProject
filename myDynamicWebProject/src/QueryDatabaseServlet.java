import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HeroDAO;
import character.Hero;

//TODO:在success.html中action
public class QueryDatabaseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=GBK");
		String html = "<tr>"
				+ "<td>%d</td>"
				+ "<td>%s</td>"
				+ "<td>%d</td>"
				+ "<td>%d</td>"
				+ "<td>%d</td>"
				+ "<td>%d</td>"
				+ "<td>%d</td>"
				+ "<td><a href='deleteDatabase?name=%s'>删除</a></td>"
				+ "</tr>";
		PrintWriter pw = resp.getWriter();
		pw.print("<table align='center' border='1' cellspacing='0'>"
				+ "<tr>"
				+ "<th>order</th>"
				+ "<th>name</th>"
				+ "<th>HP</th>"
				+ "<th>armor</th>"
				+ "<th>moveSpeed</th>"
				+ "<th>aggressivity</th>"
				+ "<th>attackSpeed</th>"
				+ "<th>操作</th>"
				+ "</tr>");
		pw.flush();
		int id = 1;
		List<Hero> heros = new HeroDAO().query();
		System.out.println(heros.size());
		for (Hero hero : heros) {
			pw.format(html, id++, hero, hero.getHP(), hero.getArmor(), hero.getMoveSpeed(), hero.getAggressivity(), hero.getAttackSpeed(), hero);
			pw.flush();
		}
		//必须关闭
		pw.close();
	}

}
