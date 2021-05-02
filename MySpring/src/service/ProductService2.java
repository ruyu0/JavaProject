package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component("productService2")
public class ProductService2 {
	public void queryDatabase() {
		//需要设置时区，否则报错
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&characterEncoding=utf-8", "root", "tiger");
				PreparedStatement ps = c.prepareStatement("select count(*) from hero where ? = ?");){
			ps.setString(1, "HP");
			ps.setInt(2, 34);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("查询的记录有" + rs.getInt(1));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
