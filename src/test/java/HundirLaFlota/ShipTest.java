package HundirLaFlota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ShipTest {

    private static final int LONGITUD = 37;
    private static final CardinalPoints DIRECCION = CardinalPoints.NORTH;
    private static final boolean HUNDIDO = true;
    private static final int IMPACTOS = 96;
    @Mock
    private Point pointI;
    @Mock
    private Point pointF;
    @InjectMocks
    private Ship underTest;

    @org.junit.jupiter.api.Test
    void getpInicio() {
    }

    @org.junit.jupiter.api.Test
    void setpInicio() {
    }

    @org.junit.jupiter.api.Test
    void getpFin() {
    }

    @org.junit.jupiter.api.Test
    void setpFin() {
    }

    @org.junit.jupiter.api.Test
    void getTamaño() {
    }

    @org.junit.jupiter.api.Test
    void setTamaño() {
    }

    @org.junit.jupiter.api.Test
    void getImpactos() {
    }

    @org.junit.jupiter.api.Test
    void setImpactos() {
    }

    @org.junit.jupiter.api.Test
    void getCardinalPoints() {

    }

    @org.junit.jupiter.api.Test
    void setCardinalPoints() {
    }

    @org.junit.jupiter.api.Test
    void isSunk() {
    }

    @org.junit.jupiter.api.Test
    void getShot() {

    }

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
    void testGetImpactos() {
    }

    @Test
    void testSetImpactos() {
    }

    @Test
    void testIsSunk() {
    }

    @Test
    void testGetShot() {
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