package pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductService {
	public void dosomeService() {
		System.out.println("ִ��һ��ҵ��");
	}
	public void queryDatabase() {
		//��Ҫ����ʱ�������򱨴�
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&characterEncoding=utf-8", "root", "tiger");
				PreparedStatement ps = c.prepareStatement("select count(*) from hero where ? = ?");){
			ps.setString(1, "HP");
			ps.setInt(2, 34);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("��ѯ�ļ�¼��" + rs.getInt(1));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
