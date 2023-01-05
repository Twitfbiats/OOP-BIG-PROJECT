package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Package.Package;

public class TestJdbc {

    private String url = "jdbc:mysql://localhost:3306/test_oopdb?useUnicode=true&characterEncoding=UTF-8";
    private Connection connection = null;

    public TestJdbc()
    {
        try
        {
            connection = DriverManager.getConnection(url, "root", "");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public List<Package> testSelect()
    {
        List<Package> packages = new ArrayList<>();
        Package package1;
        try 
        {
            Statement stm = connection.createStatement();
            ResultSet resultSet = stm.executeQuery("SELECT * FROM package");        

            while(resultSet.next())
            {
                package1 = new Package();
                package1.setId(Integer.parseInt(resultSet.getString("id")));
                package1.setDescription(resultSet.getString("description"));
                package1.setWeight(Float.parseFloat(resultSet.getString("weight")));
                package1.setSenderId(Integer.parseInt(resultSet.getString("sender")));
                package1.setReceiverId(Integer.parseInt(resultSet.getString("receiver")));
                package1.setDistance(Float.parseFloat(resultSet.getString("distance")));
                package1.setFee(Float.parseFloat(resultSet.getString("fee")));
                package1.setTransportType(resultSet.getString("transport_type"));
                package1.setSendDate(null);
                package1.setReceiveDateEstimation(null);
                package1.setStatus(resultSet.getString("status"));
                packages.add(package1);
            }

            try 
            {
                resultSet.close();
                stm.close();    
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return packages;
    }

    public void testInsert(Connection connection, String sql)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement(
            sql,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.executeUpdate();    
        } catch (Exception e) 
        {
            // TODO: handle exception
        }
    }
}
