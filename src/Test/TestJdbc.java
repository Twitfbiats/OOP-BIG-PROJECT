package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
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
        String s[] = new String[6];
        try 
        {
            Statement stm = connection.createStatement();
            ResultSet resultSet = stm.executeQuery(
            "SELECT package.*, customer1.name AS sender_name, customer2.name AS receiver_name "
            + ", address1.location AS from_where_name, address2.location AS to_where_name "
            + "FROM package LEFT JOIN customer AS customer1 ON package.sender = customer1.id "
             + "LEFT JOIN customer AS customer2 ON package.receiver = customer2.id LEFT JOIN "
             + "address AS address1 ON package.from_where = address1.id LEFT JOIN address AS address2 "
             + "ON package.to_where = address2.id;");      
             Calendar calendar = Calendar.getInstance();

            while(resultSet.next())
            {
                package1 = new Package();
                package1.setId(Integer.parseInt(resultSet.getString("id")));
                package1.setDescription(resultSet.getString("description"));
                package1.setWeight(Float.parseFloat(resultSet.getString("weight")));
                package1.setSenderId(Integer.parseInt(resultSet.getString("sender")));
                package1.setReceiverId(Integer.parseInt(resultSet.getString("receiver")));
                package1.getFrom().setId(Integer.parseInt(resultSet.getString("from_where")));
                package1.getTo().setId(Integer.parseInt(resultSet.getString("to_where")));
                package1.setDistance(Float.parseFloat(resultSet.getString("distance")));
                package1.setFee(Float.parseFloat(resultSet.getString("fee")));
                package1.setTransportType(resultSet.getString("transport_type"));
                s = resultSet.getString("send_date").split("[- :]");
                calendar.set(Integer.parseInt(s[0]), Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5]));
                package1.setSendDate(calendar);
                s = resultSet.getString("receive_date_estimation").split("[- :]");
                calendar.set(Integer.parseInt(s[0]), Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]), Integer.parseInt(s[5]));
                package1.setReceiveDateEstimation(calendar);
                package1.setStatus(resultSet.getString("status"));
                package1.setSenderName(resultSet.getString("sender_name"));
                package1.setReceiverName(resultSet.getString("receiver_name"));
                package1.getFrom().setLocation(resultSet.getString("from_where_name"));
                package1.getTo().setLocation(resultSet.getString("to_where_name"));
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
