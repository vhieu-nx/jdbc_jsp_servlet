import java.sql.*;

public class UserManager {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "123456";
        String pass  = "abc";
        String fullname  = "adasdsadsa";
        String email = "a@gmail.com";
        String user = "hieu1";

        try {
            Connection connection =  DriverManager.getConnection(jdbcURL,username,password);

            //delete
            String sql = "DELETE FROM USERS WHERE username =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user);
            int row = preparedStatement.executeUpdate();
            if (row > 0){
                System.out.println("Delete success");
            }





//            Update
//            String sql = "Update users SET password= ?, fullname = ?, email = ? WHERE username = ? ";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1,pass);
//            statement.setString(2,fullname);
//            statement.setString(3,email);
//            statement.setString(4,user);
//            int row  = statement.executeUpdate();
//            if (row > 0){
//                System.out.println("Update success");
//            }






            //SELECT
//            String sql = "SELECT *FROM users";
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql);
//            while (resultSet.next()){
//                int userId = resultSet.getInt("user_id");
//                String user = resultSet.getString("username");
//                String pass = resultSet.getString("password");
//                String fullname = resultSet.getString("fullname");
//                String email = resultSet.getString("email");
//                System.out.println( userId + ","+ user + "," + pass + "," + fullname + "," + email);
//            }



            //INSERT INTO
//            String sql = "INSERT INTO users(username,password,fullname,email)" +
//                    " VALUE(?,?,?,?)" ;
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1,name);
//            preparedStatement.setString(2,pass);
//            preparedStatement.setString(3,fullname);
//            preparedStatement.setString(4,email);
//            int row = preparedStatement.executeUpdate();
//            if (row > 0){
//                System.out.println("A new user has been inserted successfully");
//            }

            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
