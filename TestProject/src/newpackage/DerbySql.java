package newpackage;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


public class DerbySql{
	


    private static String dbURL = "jdbc:derby://10.109.6.149:1522//u02/netcracker/rbm/ammvm/AMMDB;user=mediation;password=mediation";
    private static String tableName = "restaurants";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void main(String[] args)
    {
/*    	String host = "";
    	int port;
    	String dbPath = "";
    	String derbyUser = "";
    	String derbyPassword = "";
    	String sqlQuery = "";
    	if (args.length < )*/

        createConnection();
        //insertRestaurants(5, "LaVals", "Berkeley");
        checkTable();
        //shutdown();
    	
  
    }
    
    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
            System.out.println( "connection established !!");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    private static void insertRestaurants(int id, String restName, String cityName)
    {
        try
        {
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " values (" +
                    id + ",'" + restName + "','" + cityName +"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void checkTable()
    {
        try
        {
            stmt = conn.createStatement();
 
            ResultSet results = stmt.executeQuery("select count(*) tabCount from sys.systables where tablename = 'RKTNlkjg_MED_STATS_COLLECTION'");
            
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                //System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

           // System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);

                System.out.println(id);
            }
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }
}