package jdbc.demo1;

import jdbc.util.JDBCUtils;

import java.sql.*;

public class jdbc3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql:///pri","root","root");
            conn = JDBCUtils.getConnection();
            String sql = "select * from student";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                double score = rs.getDouble(4);
                Date date = rs.getDate(5);
                Timestamp timestamp = rs.getTimestamp(6);
                System.out.println(id+"---"+name+"---"+age+"---"+score+"---"+date+"---"+timestamp);
            }
        } /*catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/ catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            /*if (stat!=null){
                try {
                    stat.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }*/
            JDBCUtils.close(rs,stat,conn);
        }

    }
}
