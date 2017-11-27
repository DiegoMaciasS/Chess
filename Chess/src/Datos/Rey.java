
package Datos;

public class Rey extends Ficha{

    public Rey(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        if(x<=getX()+1&&x>=getX()-1&&(y<=getY()+1)&&(y<=getY()-1)){
            //if(verificar casilla ocupada)
            return true;
            //else
            //return false;
        }
        else{
            
        }
        return true;
    }
    
}
