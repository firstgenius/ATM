package Builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = User.builder()
                .firstName("Yaroslav")
                .age(18)
                .occupation("Telegram")
                .build();
    }

    @Test
    void testToString() {
        assertEquals(user.toString(), "User(firstName=Yaroslav, lastName=null, occupations=[Telegram], gender=null, age=18, weight=0)");
    }
}