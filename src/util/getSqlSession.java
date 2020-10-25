package util;

import java.sql.*;

public class getSqlSession {
   public static Connection conn = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    public static void getSqlSession() {

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获得链接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ddblog?serverTimezone=UTC", "root", "123456");
            //创建sql命令
//            String sql = "select * from user where ID = ?";
            String sql = "insert into usertest(id,username,password) value(?,?,?)";
            //创建sql执行对象
            ps = conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1, "2");
            ps.setString(2, "2");
            ps.setString(3, "2");

            //执行sql
           // rs = ps.executeQuery();
//           ps.executeQuery();
           ps.executeUpdate();
            //遍历执行结果
//            while(rs.next()){
//                System.out.println(rs.getString("username"));
//            }






        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("工具类获得sqlsessionfactory失效");
        }

    }


}
