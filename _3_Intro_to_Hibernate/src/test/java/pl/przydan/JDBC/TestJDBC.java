package pl.przydan.JDBC;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

    @Test
    public void shouldConnectByJDBCtoDB() {

        String jdbcUrl =
                "jdbc:mysql://localhost:3306/" +
                        "hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {
            System.out.println("Connecting to db" + jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
