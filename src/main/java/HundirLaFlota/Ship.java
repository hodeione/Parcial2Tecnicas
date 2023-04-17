package HundirLaFlota;

public class Ship {

    private Point pointI;
    private Point pointF;
    private int longitud;
    private CardinalPoints direccion;
    private boolean hundido;
    private int impactos=0;

    public Ship(Point pointI, CardinalPoints direccion, int longitud) {
        this.pointI = pointI;
        this.direccion = direccion;
        if (longitud==1||longitud==3||longitud==5){
            this.longitud = longitud;
        }
        else{
            throw new IllegalArgumentException("La longitud del barco debe ser 1, 3 o 5");
        }
        this.hundido = false;
        this.pointF = new Point(pointI.getX(), pointI.getY());
        switch (direccion) {
            case NORTH:
                this.pointF.setY(pointI.getY() - longitud + 1);
                break;
            case SOUTH:
                this.pointF.setY(pointI.getY() + longitud - 1);
                break;
            case EAST:
                this.pointF.setX(pointI.getX() + longitud - 1);
                break;
            case WEST:
                this.pointF.setX(pointI.getX() - longitud + 1);
                break;
        }
    }

    public Point getPointI() {
        return pointI;
    }

    public void setPointI(Point pointI)throws IllegalArgumentException{
        if (pointI.getX() < 0 || pointI.getX() > 9 || pointI.getY() < 0 || pointI.getY() > 9) {
            throw new IllegalArgumentException("Coordenada fuera del tablero");
        }
    }

    public Point getPointF() {
        return pointF;
    }

    public void setPointF(Point pointF) {
        this.pointF = pointF;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public CardinalPoints getDireccion() {
        return direccion;
    }

    public void setDireccion(CardinalPoints direccion) {
        this.direccion = direccion;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    public int getImpactos() {
        return impactos;
    }

    public void setImpactos(int impactos) {
        this.impactos = impactos;
    }

    public boolean isSunk(){
        if (this.longitud == this.impactos) {
            return true;
        } else {
            return false;
        }
    }

    public void getShot(Point shotPoint)throws IllegalArgumentException{
        if (shotPoint==null){
            throw new IllegalArgumentException("El punto de disparo no puede ser nulo");
        }
        else if (this.pointI.getX()==this.pointF.getX()){
            if (shotPoint.getX()==this.pointI.getX()){
                if (shotPoint.getY()>=this.pointI.getY()&&shotPoint.getY()<=this.pointF.getY()){
                    this.impactos++;
                    this.isSunk();
                }
            }
        }
        else if (this.pointI.getY()==this.pointF.getY()){
            if (shotPoint.getY()==this.pointI.getY()){
                if (shotPoint.getX()>=this.pointI.getX()&&shotPoint.getX()<=this.pointF.getX()){
                    this.impactos++;
                    this.isSunk();
                }
            }
        }
    }
}
