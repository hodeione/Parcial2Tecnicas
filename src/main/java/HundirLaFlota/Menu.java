package HundirLaFlota;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void menu() throws Exception {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Bienvenido a Hundor la flota V1.0");

                    Thread.sleep(1000);

                    System.out.println("Bienvenido jugador 1");
                    ArrayList<Ship> ship1 = new ArrayList<Ship>();
                    Tablero tablero1 = new Tablero();

                    Thread.sleep(1000);

                    System.out.println("Ingrese sus tres barcos");
                    int n = 1;
                    do {
                        try {
                            Point pposicionInicial = null;
                            boolean error = false;
                            do {
                                try {
                                    
                                System.out.println("Digame la posicion inicial del barco:" + n);
                                Thread.sleep(1000);
                                System.out.println("Digame la coordenada x e y de la posicion inicial del barco");
                                pposicionInicial = new Point(sc.nextInt(), sc.nextInt());
                                } catch (Exception e) {
                                    System.out.println("Error: "+e.getMessage());
                                    error = true;
                                }
                            } while (error);

                            System.out.println("Digame la longitud del barco " + n + "\n1:Canoa, 3: Fragata, 5: Portaaviones");
                            int longitud = sc.nextInt();


                            System.out.println("Digame la direccion del barco\n" + "1.-NORTH\n" + "2.-SOUTH\n" + "3.-EAST\n" + "4.-WEST");
                            int seleccion = sc.nextInt();
                            CardinalPoints direccion = null;

                            switch (seleccion) {
                                case 1:
                                    direccion = CardinalPoints.NORTH;
                                    break;
                                case 2:
                                    direccion = CardinalPoints.SOUTH;
                                    break;
                                case 3:
                                    direccion = CardinalPoints.EAST;
                                    break;
                                case 4:
                                    direccion = CardinalPoints.WEST;
                                    break;
                                default:
                                    throw new IllegalArgumentException("La dirección debe ser un número entre 1 y 4.");
                            }
                            Ship ship = new Ship(pposicionInicial, direccion, longitud);
                            ship1.add(ship);
                            n++;
                            tablero1.colocarBarco(pposicionInicial, direccion, longitud);
                            tablero1.mostrarTablero();
                        } catch (Exception e) {
                            System.out.println("Se produjo un error: " + e.getMessage() + " Por favor, inténtelo de nuevo.");
                            ship1.clear(); // eliminamos los barcos agregados anteriormente para comenzar de nuevo
                            n = 1; // reiniciamos el contador de barcos
                            tablero1.limpiarTablero(); // reiniciamos el tablero
                        }
                    } while (ship1.size() < 3);
                    tablero1.mostrarTablero();

                    User user1 = new User(ship1);

                    Thread.sleep(1000);
                    System.out.println("Bienvenido jugador 2");
                    ArrayList<Ship> ship2 = new ArrayList<Ship>();
                    Tablero tablero2 = new Tablero();

                    Thread.sleep(1000);

                    System.out.println("Ingrese sus tres barcos");
                    n = 1;
                    do {
                        try {
                            Point pposicionInicial = null;
                            boolean error = false;
                            do {
                                try {

                                System.out.println("Digame la posicion inicial del barco:" + n);
                                Thread.sleep(1000);
                                System.out.println("Digame la coordenada x e y de la posicion inicial del barco");
                                pposicionInicial = new Point(sc.nextInt(), sc.nextInt());
                                } catch (Exception e) {
                                    System.out.println("Error: "+e.getMessage());
                                    error = true;
                                }
                            } while (error);

                            System.out.println("Digame la longitud del barco " + n + "\n1:Canoa, 3: Fragata, 5: Portaaviones");
                            int longitud = sc.nextInt();

                            System.out.println("Digame la direccion del barco\n" + "1.-NORTH\n" + "2.-SOUTH\n" + "3.-EAST\n" + "4.-WEST");
                            int seleccion = sc.nextInt();
                            CardinalPoints direccion = null;

                            switch (seleccion) {
                                case 1:
                                    direccion = CardinalPoints.NORTH;
                                    break;
                                case 2:
                                    direccion = CardinalPoints.SOUTH;
                                    break;
                                case 3:
                                    direccion = CardinalPoints.EAST;
                                    break;
                                case 4:
                                    direccion = CardinalPoints.WEST;
                                    break;
                                default:
                                    throw new IllegalArgumentException("La dirección debe ser un número entre 1 y 4.");
                            }
                            Ship ship = new Ship(pposicionInicial, direccion, longitud);
                            ship2.add(ship);
                            n++;
                            tablero2.colocarBarco(pposicionInicial, direccion, longitud);
                            tablero2.mostrarTablero();
                        } catch (Exception e) {
                            System.out.println("Se produjo un error: " + e.getMessage() + " Por favor, inténtelo de nuevo.");
                            ship2.clear(); // eliminamos los barcos agregados anteriormente para comenzar de nuevo
                            n = 1; // reiniciamos el contador de barcos
                            tablero2.limpiarTablero(); // reiniciamos el tablero
                        }
                    } while (ship2.size() < 3);
                    tablero2.mostrarTablero();

                    User user2 = new User(ship2);

                    Thread.sleep(1000);

                    System.out.println("Bienvenido a la partida");

                    Thread.sleep(3000);
                    boolean game = true;
                    System.out.println("Se sorte el turno con cara o cruz, jugador 1 diga que elije:");
                    Thread.sleep(1000);
                    String caraCruz;
                    System.out.println("cara o cruz?");
                    caraCruz = sc.next();

                    Random r = new Random();
                    int turno = r.nextInt(2) + 1;

                    if (caraCruz.equals("cara") && turno == 1) {
                        System.out.println("El jugador 1 empieza, salio cara");
                        turno = 1;
                    } else if (caraCruz.equals("cruz") && turno == 2) {
                        System.out.println("El jugador 1 empieza, salio cruz");
                        turno = 1;
                    } else {
                        if (turno == 1&&caraCruz.equals("cruz")) {
                            System.out.println("Empieza el jugador 2, salio cara");
                            turno = 2;
                        } else if (turno == 2&&caraCruz.equals("cara")) {
                            System.out.println("Empieza el jugador 2, salio cruz");
                            turno = 2;
                        }
                    }

                    do {
                            switch (turno) {
                                case 1:
                                    boolean error = false;
                                    Point pposicionAtaque = null;
                                    do {
                                        try {


                                            System.out.println("Turno del jugador 1");
                                            System.out.println("Ingrese la coordenada x e y de la posicion a atacar");
                                            pposicionAtaque = new Point(sc.nextInt(), sc.nextInt());
                                            user1.attack(pposicionAtaque,user2);
                                            if (user2.getShip().size() == 0){
                                                game = false;
                                                System.out.println("El jugador 1 ha ganado");
                                            }

                                            if (user1.attack(pposicionAtaque,user2)==true){
                                                System.out.println("El jugador 1 ha acertado");
                                                tablero2.disparar(pposicionAtaque);
                                                tablero2.mostrarTablero();
                                                turno = 1;
                                            }else{
                                                System.out.println("El jugador 1 ha fallado");
                                                tablero2.disparar(pposicionAtaque);
                                                tablero2.mostrarTablero();
                                                turno = 2;
                                            }

                                        } catch (Exception e) {
                                            System.out.println("Se produjo un error: " + e.getMessage() + " Por favor, inténtelo de nuevo.");
                                             error = true;

                                        }
                                    } while (error=true);
                                    break;

                                case 2:
                                    do {
                                        try {
                                            System.out.println("Turno del jugador 2");
                                            System.out.println("Ingrese la coordenada x e y de la posicion a atacar");
                                            Point pposicionAtaque2 = new Point(sc.nextInt(), sc.nextInt());
                                            user2.attack(pposicionAtaque2,user1);
                                            if (user1.getShip().size() == 0){
                                                game = false;
                                                System.out.println("El jugador 2 ha ganado");
                                                break;
                                            }
                                            if (user2.attack(pposicionAtaque2,user1)==true){
                                                System.out.println("El jugador 2 ha tocado un barco");
                                                tablero1.disparar(pposicionAtaque2);
                                                tablero1.mostrarTablero();
                                                turno=2;
                                            }else{
                                                System.out.println("El jugador 2 ha fallado");
                                                tablero1.disparar(pposicionAtaque2);
                                                tablero1.mostrarTablero();
                                                turno=1;
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Se produjo un error: " + e.getMessage() + " Por favor, inténtelo de nuevo.");
                                            error = true;
                                        }
                                    }while (error=true);
                                    break;
                            }

                    }while (game);
                    System.out.println("Se acabo el juego");

                    break;

                case 2:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 2);
    }
}
