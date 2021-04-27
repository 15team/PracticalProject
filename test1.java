package java211808659.lesson06;

import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        Connection connection=DBconnection.getConnection();// 获取连接
        bookinformation b = new bookinformation();
        b.menu();
    }
}
