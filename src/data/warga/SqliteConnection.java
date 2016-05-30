package data.warga;
import java.sql.*;
/**
 *
 * @author martin
 */
public class SqliteConnection {
    
    public static void createAddressDB()
    {
        Connection c = null;
        Statement stmt = null;
        try 
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:WargaDB.sqlite");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE RUMAH " +
                         " (RT       INT NOT NULL, " +
                         " RW       INT     NOT NULL, " + 
                         " JALAN    TEXT  NOT NULL," +
                         " BLOCK    TEXT  NOT NULL, " + 
                         " NO       INT  NOT NULL, " + 
                         " PEMILIK  TEXT , " +      
                         " STATUS   TEXT, " + 
                         " TELEPON  TEXT)"; 
            
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } 

        catch ( Exception e ) 
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
    
    public static void createPendudukDB()
    {
        Connection c = null;
        Statement stmt = null;
        try 
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:WargaDB.sqlite");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE PENDUDUK " +
                         " (ALAMAT              TEXT     NOT NULL, " +
                         " NAMADEPAN           TEXT     NOT NULL, " + 
                         " NAMABELAKANG        TEXT         NOT NULL," +
                         " STATUSRUMAH         TEXT, " + 
                         " STATUSKELUARGA      TEXT, " + 
                         " TANGGALLAHIR        TEXT, " +      
                         " JENISKELAMIN        TEXT, " + 
                         " STATUSPERNIKAHAN    TEXT, " + 
                         " JENJANGPENDIDIKAN   TEXT, " +
                         " AGAMA                TEXT, " +
                         " JENISPEKERJAAN      TEXT, " +
                         " KEWARGANEGARAAN      TEXT)"; 
            
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } 

        catch ( Exception e ) 
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
    
    public static Connection wargaConnector()
    {
        Connection conn = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:WargaDB.sqlite");
        }   
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
