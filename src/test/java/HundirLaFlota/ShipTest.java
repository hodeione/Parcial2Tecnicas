package HundirLaFlota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ShipTest {

    private static final int LONGITUD = 75;
    private static final CardinalPoints DIRECCION = CardinalPoints.NORTH;
    private static final boolean HUNDIDO = true;
    private static final int IMPACTOS = 90;
    @Mock
    private Point pointI;
    @Mock
    private Point pointF;
    @InjectMocks
    private Ship underTest;

    @Test
    void getPointI() {
    }

    @Test
    void setPointI() {
    }

    @Test
    void getPointF() {
    }

    @Test
    void setPointF() {
    }

    @Test
    void getLongitud() {
    }

    @Test
    void setLongitud() {
    }

    @Test
    void getDireccion() {
    }

    @Test
    void setDireccion() {
    }

    @Test
    void isHundido() {
    }

    @Test
    void setHundido() {
    }

    @Test
    void getImpactos() {
    }

    @Test
    void setImpactos() {
    }

    @Test
    void isSunk() {
    }

    @Test
    void getShot() {
    }

    @Nested
    class WhenGettingPointI {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingPointF {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingLongitud {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingDireccion {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenCheckingIfIsHundido {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingImpactos {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenCheckingIfIsSunk {
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