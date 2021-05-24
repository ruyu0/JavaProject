package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import character.ADHero;
import character.Hero;

public class HeroDAO implements DAO<Hero>{
	
	private Connection getConnection() throws SQLException, ClassNotFoundException{
		//TODO:需要加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
	}
	
	@Override
	public boolean update(Hero t) {
		return false;
	}
	
	//这里HeroDAO使用name来找到删除的条目
	@Override
	public boolean delete(String id) {
		try (
				Connection connection = getConnection();
				Statement s = connection.createStatement();){
			int count = s.executeUpdate("delete from hero where (name = '" + id + "');");
			if (count > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean add(Hero t) {
		try(
				Connection connection = getConnection();
				Statement s = connection.createStatement();){
			int count = s.executeUpdate("INSERT INTO `test`.`hero` (`name`, `HP`, `armor`, `moveSpeed`, `aggressivity`, `attackSpeed`) "
					+ "VALUES ('"
					+ t
					+ "', '"
					+ t.getHP()
					+ "', '"
					+ t.getArmor()
					+ "', '"
					+ t.getMoveSpeed()
					+ "', '"
					+ t.getAggressivity()
					+ "', '"
					+ t.getAttackSpeed()
					+ "');");
			if (count > 0){
				return true;
			}else {
				return false;
			}
			
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public Hero get(int id) {
		return null;
	}
	
	@Override
	public List<Hero> query() {
		return query(0, 1000);
	}
	
	@Override
	public List<Hero> query(int start, int length) {
		List<Hero> heros = new ArrayList<Hero>();
		try(
				Connection connection = getConnection();
				Statement s = connection.createStatement();) {
			ResultSet rs = s.executeQuery("select * from hero limit " + start + ", " + length);
			while (rs.next()) {
				//TODO:ORM
				Hero hero = new ADHero(
						rs.getString(2), 
						rs.getInt(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getInt(7));
				heros.add(hero);
			}
			rs.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (heros.size() == 0) return null;
		else {
			return heros;
		}
	}
}
