package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {

//        User user1 = new User();
//        user1.setUserName("user1");
//        user1.setEmail("user1@email.com");
//        user1.setPassword("user1Password");
//
//        User user2 = new User();
//        user2.setUserName("user2");
//        user2.setEmail("user2@email.com");
//        user2.setPassword("user2Password");
//
//        UserDao.create(user1);
//        UserDao.create(user2);

//        System.out.println(UserDao.read(1));
//        System.out.println(UserDao.read(5));

//        User user1Changed = new User();
//        user1Changed.setId(1);
//        user1Changed.setUserName("user1Changed");
//        user1Changed.setEmail("user3@email.com");
//        user1Changed.setPassword("newPassword");
//
//        UserDao.update(user1Changed);

//        UserDao.delete(2);

        System.out.println(UserDao.findAll());
    }
}
