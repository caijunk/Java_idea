package jdbc.demo2.JDBCTemplate;

import jdbc.demo2.druid.util_druid.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbctempalta {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update student set name = 'baby' where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);

    }
}
