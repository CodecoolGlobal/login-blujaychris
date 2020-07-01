package dao;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnector {

    private static BasicDataSource dataSource = new BasicDataSource();

    private DatabaseConnector() {

    }

    static {
        dataSource.setUrl("jdbc:postgresql://ec2-46-137-100-204.eu-west-1.compute.amazonaws.com/dcqm5j27dv07f1");
        dataSource.setUsername("doddqopttbmnfm");
        dataSource.setPassword("7f4b4240321bb5e20e8ec6a8f521c0c9e1c17a4a2b52b879dbd12fd319f4b4df");

        dataSource.setMinIdle(5);
        dataSource.setMaxIdle(10);
        dataSource.setMaxOpenPreparedStatements(100);
    }

    static Connection getConnection() throws SQLException {
        return dataSource.getConnection();

    }

}
