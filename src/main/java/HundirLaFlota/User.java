package HundirLaFlota;

import java.util.ArrayList;

public class User {
    ArrayList<Ship> ship= new ArrayList<Ship>(3);
    private boolean isAlive;

    public ArrayList<Ship> getShip() {
        return ship;
    }

    public void setShip(ArrayList<Ship> ship) {
        this.ship = ship;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public User(ArrayList<Ship> ship) {
        if (ship.size()!=3||ship==null){
            throw new IllegalArgumentException("El usuario debe tener 3 barcos");
        }
        else{
            for(Ship ship1:ship){
                if (ship1.getLongitud()==1||ship1.getLongitud()==3||ship1.getLongitud()==5){
                    if (ship1.getLongitud()==1){
                        System.out.println("Se ha añadido la canoa");
                        this.ship.add(ship1);
                    }
                    else if (ship1.getLongitud()==3){
                        System.out.println("Se ha añadido el fragata");
                        this.ship.add(ship1);
                    }
                    else if (ship1.getLongitud()==5){
                        System.out.println("Se ha añadido el portaaviones");
                        this.ship.add(ship1);
                    }
                }
                else{
                    throw new IllegalArgumentException("Los barcos solo pueden tener una longitud de 1, 3 o 5," +
                            "siendo asi canoa fragata o Battleship");
                }
            }
        }
    }

    public boolean attack(Point shotPoint, User user)throws Exception{
        if (shotPoint.getX()<0||shotPoint.getX()>9||shotPoint.getY()<0||shotPoint.getY()>9){
            throw new IllegalArgumentException("El punto de disparo debe estar dentro del tablero");
        } else if (user == null) {
            throw new IllegalArgumentException("El usuario no puede ser nulo");
        } else{
            for (Ship ship:user.ship){
                EncontrarShip(shotPoint, ship);
                if (ship.isSunk()){
                    System.out.println("El barco ha sido hundido");
                    user.ship.remove(ship);
                    if (user.ship.size()==0){
                        user.setAlive(false);
                        System.out.println("El usuario ha sido derrotado");
                    }
                    return true;
                }
            }
        }
        return false;
    }

    //He echo uso de un metodo encontrarShip para reutilizar codigo
    private static void EncontrarShip(Point shotPoint, Ship ship) {
        if (ship.getPointI().getX()==ship.getPointF().getX()){
            if (shotPoint.getX()==ship.getPointI().getX()){
                if (shotPoint.getY()>=ship.getPointI().getY()&&shotPoint.getY()<=ship.getPointF().getY()){
                    ship.setImpactos(ship.getImpactos()+1);
                    ship.isSunk();
                }
            }
        }
        else if (ship.getPointI().getY()==ship.getPointF().getY()){
            if (shotPoint.getY()==ship.getPointI().getY()){
                if (shotPoint.getX()>=ship.getPointI().getX()&&shotPoint.getX()<=ship.getPointF().getX()){
                    ship.setImpactos(ship.getImpactos()+1);
                    ship.isSunk();
                }
            }
        }
    }

    public void getShot(Point shotPoint) throws Exception {
        for (Ship ship:ship){
            attack(shotPoint, this);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> origin/master
}

