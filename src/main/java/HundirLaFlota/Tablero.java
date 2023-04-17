package HundirLaFlota;

public class Tablero {

    private static final char agua = '-';

    private static final char aguaFallo =  'F';
    private static final char hundido = 'H';
    private static final char barco = 'B';

    private char[][] tablero = new char[10][10];

    public Tablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = agua;
            }
        }
    }

    public void mostrarTablero() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarTableroPropio() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == agua || tablero[i][j] == hundido) {
                    System.out.print(agua + " ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void colocarBarco(Point coordenadaInicial, CardinalPoints direccion, int longitud) throws Exception {

        if (coordenadaInicial.getX() < 0 || coordenadaInicial.getX() > 9 || coordenadaInicial.getY() < 0 || coordenadaInicial.getY() > 9) {
            System.out.println("Coordenada fuera del tablero");
        }
        if (direccion == CardinalPoints.NORTH && coordenadaInicial.getX() + longitud <0) {
            throw new Exception("Barco fuera del tablero");
        }
        if (direccion == CardinalPoints.SOUTH && coordenadaInicial.getX() + longitud>9) {
            throw new Exception("Barco fuera del tablero");
        }
        if (direccion == CardinalPoints.EAST && coordenadaInicial.getY() + longitud > 9) {
            throw new Exception("Barco fuera del tablero");
        }
        if (direccion == CardinalPoints.WEST && coordenadaInicial.getY() - longitud < 0) {
            throw new Exception("Barco fuera del tablero");
        }
        if (direccion == CardinalPoints.NORTH) {
            for (int i = 0; i < longitud; i++) {
                if (tablero[coordenadaInicial.getX() - i][coordenadaInicial.getY()] == barco) {
                    throw new Exception("Barco en esa posición");
                }
            }
            for (int i = 0; i < longitud; i++) {
                tablero[coordenadaInicial.getX() - i][coordenadaInicial.getY()] = barco;
            }
        }
        if (direccion == CardinalPoints.SOUTH) {
            for (int i = 0; i < longitud; i++) {
                if (tablero[coordenadaInicial.getX() + i][coordenadaInicial.getY()] == barco) {
                    throw new Exception("Barco en esa posición");
                }
            }
            for (int i = 0; i < longitud; i++) {
                tablero[coordenadaInicial.getX() + i][coordenadaInicial.getY()] = barco;
            }
        }
        if (direccion == CardinalPoints.EAST) {
            for (int i = 0; i < longitud; i++) {
                if (tablero[coordenadaInicial.getX()][coordenadaInicial.getY() + i] == barco) {
                    throw new Exception("Barco en esa posición");
                }
            }
            for (int i = 0; i < longitud; i++) {
                tablero[coordenadaInicial.getX()][coordenadaInicial.getY() + i] = barco;
            }
        }

        if (direccion == CardinalPoints.WEST) {
            for (int i = 0; i < longitud; i++) {
                if (tablero[coordenadaInicial.getX()][coordenadaInicial.getY() - i] == barco) {
                    throw new Exception("Barco en esa posición");
                }
            }
            for (int i = 0; i < longitud; i++) {
                tablero[coordenadaInicial.getX()][coordenadaInicial.getY() - i] = barco;
            }
        }
    }

    public void disparar(Point coordenada) throws Exception {
        if (coordenada.getX() < 0 || coordenada.getX() > 9 || coordenada.getY() < 0 || coordenada.getY() > 9) {
            throw new Exception("Coordenada fuera del tablero");
        }
        if (tablero[coordenada.getX()][coordenada.getY()] == agua) {
            System.out.println("Agua");
            tablero[coordenada.getX()][coordenada.getY()] = aguaFallo;
        } else if (tablero[coordenada.getX()][coordenada.getY()] == barco) {
            tablero[coordenada.getX()][coordenada.getY()] = hundido;
            System.out.println("Has dado a un barco");
        } else {
            throw new Exception("Ya has disparado en esa posición");
        }
    }
    public void limpiarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = agua;
            }
        }
    }
}