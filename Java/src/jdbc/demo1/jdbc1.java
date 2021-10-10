package jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pri","root","root");
        String sql = "update student set age = 20 where id = 1";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
