package kr.green.exam0304;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MariaDB {
	public static void main(String[] args) {
		// DB가 변경되면 아래의 변수 4개만 변경됩니다.
		String driverName = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/mydb";
		String user = "jspuser";
		String password = "123456";
		// 1. MariaDB JDBC 드라이버 클래스를 로드한다.
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. 연결객체 준비
		Connection conn = null;
		Statement statement = null; // 명령객체
		ResultSet resultSet = null; // 명령실행 결과를 저장할 객체
		try {
			// 3. 연결한다.
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공 : " + conn);
			// 4. 사용한다.
			statement = conn.createStatement(); // 명령객체 생성
			resultSet = statement.executeQuery("select * from person");
			if(resultSet.next()) { // 결과가 있느냐?
				do {
					// 읽기
					int idx = resultSet.getInt("idx");
					String name = resultSet.getString("name");
					String nickName = resultSet.getString("nickName");
					System.out.println(idx + ". " + name + "(" + nickName + ")");
					
				}while(resultSet.next()); // 끝까지 반복
			}else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 열기 역순으로 닫는다.
			try { if (resultSet != null) resultSet.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (statement != null) statement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
}
