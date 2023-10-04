package com.example.bai5_jdbc.view;

import com.example.bai5_jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
     void insertUser(User user) throws SQLException;

     User selectUser(int id);

     List<User> selectAllUsers();

     boolean deleteUser(int id) throws SQLException;

     boolean updateUser(User user) throws SQLException;

     User getUserById(int id);

     void insertUserStore(User user) throws SQLException;
     void addUserTransaction(User user, List<Integer> permission);
     void insertUpdateWithoutTransaction();
     List<User> selectUser();
     void delete_user(int id);


}
