import java.sql.Connection;

public class Connection_Test {
    public static void main(String[] args) {

        //  Test DB_Connector
//        Connection conn = DB_Connector.connect();

        //  Create a DB_Connector object
//        DB_Connector connect = new DB_Connector();

        //  Test DB_Statements - insertData and retrieveData methods
        DB_Statements statements = new DB_Statements();
        statements.insertData();
        statements.retrieveData();


    }
}
