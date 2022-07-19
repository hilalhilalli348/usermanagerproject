package DAO;

import Models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private Connection connection ;
    private final String user = "root";
    private final String password = "admin";
    private final String host = "jdbc:mysql://localhost:3306/users";

    // Connection to DB

    public UserDAO(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users",user,password);

        } catch (SQLException  | ClassNotFoundException  e ) {
            e.printStackTrace();
        }
    }


    // add user
    public void addUser(User newUser) throws SQLException {

        String SQL = "insert into users (name,surname) values (?,?)";

        PreparedStatement statement = connection.prepareStatement(SQL);
        statement.setString(1,newUser.getName());
        statement.setString(2,newUser.getSurName());

        statement.executeUpdate();
        connection.close();

    }

    // update user by id

    public void updateUser(User user) throws SQLException {

        String SQL = "UPDATE users SET name = ?, surname = ? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(SQL);
                statement.setString(1,user.getName());
                statement.setString(2,user.getSurName());
                statement.setInt(3,user.getId());

        statement.executeUpdate();
        connection.close();
    }
    // remove user by id

    public void removeUser(Long userID) throws SQLException {

            String SQL = "DELETE FROM users WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(SQL);
            statement.setLong(1,userID);
            statement.executeUpdate();
            connection.close();
    }

    // get user by id
    public User getUser(int userID) throws SQLException {

        String SQL = "select * from users where id=?";
        PreparedStatement statement = connection.prepareStatement(SQL);
        statement.setInt(1,userID);

        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        return new User(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"));

    }

    // get all users
    public List<User> getAllUsers() throws SQLException {

        List<User> users = new ArrayList<>();

        String SQL = "select * from users";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL);

        while (resultSet.next()){

            users.add(new User(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname")
            ));

        }
        connection.close();
        return users;
    }



}
