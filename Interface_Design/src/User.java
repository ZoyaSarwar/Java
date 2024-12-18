import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private String message;

    public String login(String[] credentials) {
        String message = "Invalid username or password"; // Default failure message
    
        // Establish connection to database and execute query
        try (Connection connection = DatabaseConnection.getConnection()) {
            // SQL Query
            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
    
            // Extract username and password from credentials
            String name = credentials[0];
            String password = credentials[1];
    
            // Set parameters
            statement.setString(1, name);
            statement.setString(2, password);
    
            // Execute query
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) { // If resultSet has rows, credentials are valid
                    message = "Login successful";
                }
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
            message = "Database connection error: " + e.getMessage();
        }
    
        return message;
    }
    

        

        //     if ( name.equals("admin") && password.equals("admin")) {   
        //         this.message = "Login Successful";
        //     } else {  
        //         this.message = "Invalid user name or password";
        //     }
    
        //     return this.message;
    
        // } catch (Exception e) {
        //     this.message = "Something went wrong, please try again later!";
        //     return this.message;
        // }
    

    public String create(String[]  info){

        try (Connection connection = DatabaseConnection.getConnection()) {
            
            String sql = "INSERT INTO user (Username, password, email, phone, address, gender) VALUES (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, info[0]);
            statement.setString(2, info[1]);
            statement.setString(3, info[2]);
            statement.setString(4, info[3]);
            statement.setString(5, info[4]);
            statement.setString(6, info[5]);

            statement.executeUpdate();

            this.message = "Registration Successful";
            // return this.message;

        } catch (SQLException e) {

            this.message =  e.getMessage();
            // return this.message;

        }

        return this.message;

    }

}
