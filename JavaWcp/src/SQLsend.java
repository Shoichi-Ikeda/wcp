//DBに接続してSQLを送る
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLsend {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		String dburl = "jabc:h2:~/teest"; //接続先DBを指定
		String sql = "INSERT INTO EMPLOYEES(name) VALUED('ikeda')";
		Connection conn = DriverManager.getConnection(dburl); //DBに接続
		conn.createStatement().executeUpdate(sql); //SQLを送信
		conn.close(); //DB接続を閉じる
	}
}
