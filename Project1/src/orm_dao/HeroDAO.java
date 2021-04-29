package orm_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import character.ADHero;
import character.Hero;

public class HeroDAO implements DAO<Hero> {
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
	}

	@Override
	public void add(Hero t) {

	}

	@Override
	public void update(Hero t) {

	}

	@Override
	public void delete(int id) {

	}

	@Override
	public Hero get(int id) {
		return null;
	}

	@Override
	public List<Hero> list() {
		List<Hero> list = new ArrayList<>();
		try (Connection c = getConnection();
				Statement s = c.createStatement();
				ResultSet rs = s.executeQuery("select * from hero;");) {
			while (rs.next()) {
				Hero hero = new ADHero(rs.getString(2),
						rs.getInt(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getInt(7));
				list.add(hero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Hero> list(int start, int count) {
		List<Hero> list = new ArrayList<>();
		try (Connection c = getConnection();
				Statement s = c.createStatement();
				ResultSet rs = s.executeQuery("select * from hero limit " + start + ", " + count + ";");) {
			while (rs.next()) {
				Hero hero = new ADHero(rs.getString(2),
						rs.getInt(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getInt(7));
				list.add(hero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
