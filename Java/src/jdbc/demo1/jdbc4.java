package jdbc.demo1;

import jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        boolean flag = new jdbc4().login(username, password);
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }



    public boolean login(String username,String password){
        if (username == null||password == null){
            return  false;
        }
        //连接数据库判断是否登录成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"' ";
            stmt = conn.createStatement();
            rs= stmt.executeQuery(sql);
            /*if (rs.next()){
                return true;
            }else{
                return false;
            }*/
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }

        return false;
    }
}
