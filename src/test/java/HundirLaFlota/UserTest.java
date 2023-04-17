package HundirLaFlota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserTest {

    private static final boolean IS_ALIVE = true;
    @Mock
    private Ship ship;
    @InjectMocks
    private User underTest;

    @Test
    void getShip() {
    }

    @Test
    void setShip() {
    }

    @Test
    void isAlive() {
    }

    @Test
    void setAlive() {
    }

    @Test
    void attack() {
    }

    @Test
    void getShot() {
    }

    @Nested
    class WhenGettingShip {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenCheckingIfIsAlive {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenAttacking {
        @Mock
        private Point shotPoint;
        @Mock
        private User user;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingShot {
        @Mock
        private Point shotPoint;

        @BeforeEach
        void setup() {
        }
    }
}