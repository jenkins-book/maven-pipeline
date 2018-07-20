package codes.showme.jenkinsbook.domain;

import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void getFullName() {

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Wayne");
        assertEquals("John Wayne", user.getFullName());

    }



    @org.junit.Test
    public void getFullName1() {

        User user = new User();
        user.setFirstName("abc");
        user.setLastName("Wayne");
        assertEquals("John", user.getFullName());

    }
}