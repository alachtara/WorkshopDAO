package pl.coderslab.entity;

import junit.framework.TestCase;
import java.util.List;

public class UserDaoTest extends TestCase {

    public void testCreate() {
        User givenUser = new User();
        givenUser.setUserName("user1");
        givenUser.setEmail("user1@email.com");
        givenUser.setPassword("user1Password");
        User userCreated = UserDao.create(givenUser);

        assertNotNull(userCreated);
    }

    public void testRead() {
        User givenUser = new User();
        givenUser.setId(18);
        givenUser.setEmail("user1@email.com");
        givenUser.setUserName("user1");
        User userRead = UserDao.read(18);

        assertNotNull(userRead);
        assertEquals(givenUser, userRead);
    }

    public void testUpdate() {
        User userDataToUpdate = new User();
        userDataToUpdate.setId(1);
        userDataToUpdate.setUserName("updatedUsername");
        userDataToUpdate.setEmail("updatedEmail@email.com");

        int numberOfRowsBeforeUpdate = UserDao.countRows();
        UserDao.update(userDataToUpdate);
        User changedUser = UserDao.read(userDataToUpdate.getId());
        int numberOfRowsAfterUpdate = UserDao.countRows();

        assertEquals(userDataToUpdate, changedUser);
        assertEquals(numberOfRowsBeforeUpdate, numberOfRowsAfterUpdate);
    }

    public void testDelete() {
        int idToDelete = 3;
        UserDao.delete(idToDelete);

        assertNull(UserDao.read(idToDelete));
    }

    public void testFindAllToArray() {
        User[] readAllUsers = UserDao.findAllToArray();
        int numberOfRows = UserDao.countRows();
        int idToCompareUsers = 1;
        User userToCompareDB = UserDao.read(idToCompareUsers);
        User userToCompareArray = new User();
        for(User user : readAllUsers) {
            if (user.getId() == idToCompareUsers)
                userToCompareArray = user;
        }

        assertNotNull(readAllUsers);
        assertEquals(numberOfRows, readAllUsers.length);
        assertEquals(userToCompareDB, userToCompareArray);

    }

    public void testFindAll() {
        List<User> readAllUsers = UserDao.findAll();
        int numberOfRows = UserDao.countRows();
        int idToCompareUsers = 1;
        User userToCompareDB = UserDao.read(idToCompareUsers);


        assertNotNull(readAllUsers);
        assertEquals(numberOfRows, readAllUsers.size());
        assertTrue(readAllUsers.contains(userToCompareDB));
    }
}