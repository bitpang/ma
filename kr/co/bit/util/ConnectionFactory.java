package kr.co.bit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionFactory {

	/**
	 * ����Ŭ ����̹� �ε�, ����Ŭ �����ͺ��̽��� ������ �� ���ᰴü ��ȯ
	 */
//	public Connection getConnection() {
//		Connection conn = null;
//		try {
//			
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			String url      = "jdbc:oracle:thin:@localhost:1521:orcl";
//			String user     = "hr";
//			String password = "hr";
//			
//			conn = DriverManager.getConnection(url, user, password);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return conn;
//	}
	
	public Connection getConnection() throws Exception {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "hr";
		String password = "hr";

		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;
	}
	
	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			if(conn != null) {
				conn.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(pstmt != null) {
				pstmt.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








