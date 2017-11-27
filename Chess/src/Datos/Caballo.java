package Datos;

public class Caballo extends Ficha{

    public Caballo(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        //si el movimiento en X es igual a 2 veces el movimiento en Y y el movimiento en y es de 1 casilla, o viceversa. 
        if((x-getX()==2*(y-getY())&&(y-getY())==1)||((y-getY())==2*(x-getX())&&(x-getX())==1)){
            //if(verificar casilla ocupada)
            return true;
            //else
            //return false;
        }
        else{
            
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "c";
    }
}
