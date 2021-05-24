import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HeroDAO;
import character.ADHero;
import character.Hero;

public class AddDatabaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("GBK");
		Hero hero = new ADHero(req.getParameter("name"), Integer.parseInt(req.getParameter("HP")),
				Integer.parseInt(req.getParameter("armor")), Integer.parseInt(req.getParameter("moveSpeed")),
				Integer.parseInt(req.getParameter("aggressivity")), Integer.parseInt(req.getParameter("attackSpeed")));
		HeroDAO heroDao = new HeroDAO();
		if (heroDao.add(hero)) {
			//跳转到查询
			resp.sendRedirect("queryDatabase");
		} else {
			resp.setContentType("text/html;charset=GBK");
			PrintWriter pw = resp.getWriter();
			pw.println("<div>添加失败<div>");
			pw.close();
		}
	}

}
