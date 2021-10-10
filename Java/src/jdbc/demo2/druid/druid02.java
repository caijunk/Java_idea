package jdbc.demo2.druid;


import jdbc.demo2.druid.util_druid.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用工具类
 */
public class druid02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into student values (3,'马尔扎哈',?,?,null,null)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,40);
            pstmt.setDouble(2,80);
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }


    }
}
