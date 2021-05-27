package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * ��¥ : 2021/05/27
 * �̸� : ��¿�
 * ���� : �ڹ� �����ͺ��̽� ���α׷��� INSERT �ǽ��ϱ�
 */
public class InsertTest {

	public static void main(String[] args) {
		
		// DB����
		String host = "jdbc:mysql://127.0.0.1:3306/test";
		String user = "a3539a";
		String pass = "";
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ� - SQL ���� ��ü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ����
			String sql = "INSERT INTO `USER1` VALUES ('J101','������','010-1211-1010',27);";
			stmt.executeUpdate(sql);
			
			// 5�ܰ� - ����� ó��(SELECT�� ���)
			// 6�ܰ� - �����ͺ��̽� ���� ����
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
	
}
